package com.example.calories;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity
        extends AppCompatActivity
        implements Elegidor.Listener{

    final static String TAG = "prueba";
    private Elegidor selectorDeNivel;
    private LoginDialog loginDialog;
    enum Options { muy_facil, facil, medio, dificil};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button addCalories = (Button) findViewById(R.id.addCaloriesBtn);
        final Button setUrGoalBtn = (Button) findViewById(R.id.setUrGoalBtn);
        final Button loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick 2 ");
                View mView = getLayoutInflater().inflate(R.layout.dialog_login, null);
                loginDialog= new LoginDialog(MainActivity.this, mView);
                Log.d(TAG, "show dialog now");
                showDialog(loginDialog.ID);
            }
        });

        addCalories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick");
                Intent intencion = new Intent(getApplicationContext(), AddCaloriesActivity.class);
                Log.d(TAG, "intencion");
                startActivity(intencion);
                Log.d(TAG, "intencion started");
            }
        });


        // tercer button

        setUrGoalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "toast de duración larga", Toast.LENGTH_LONG).show();
                selectorDeNivel = new Elegidor (Options.class, "choose an option", MainActivity.this, MainActivity.this);
                showDialog(selectorDeNivel.ID);
            }


        });

    }
    @Override
    protected Dialog onCreateDialog(int dialogId) {
        Dialog aDialog = null;
        if (dialogId == selectorDeNivel.ID) {
            Log.d(TAG, "Call selector dialogo");
            aDialog = selectorDeNivel.dameElDialogo();
        }
        else if (dialogId == loginDialog.ID) {
            Log.d(TAG, "Call Login dialog");
            aDialog = loginDialog.dameElDialogo();
        }

        return aDialog;
    }

    @Override
    public <T extends Enum<T>> void eleccionHecha(T theChoice) {
        Toast.makeText(this, "tu elección = " + theChoice, Toast.LENGTH_LONG).show();
    }
}
