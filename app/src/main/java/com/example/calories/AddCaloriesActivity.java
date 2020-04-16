package com.example.calories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AddCaloriesActivity extends AppCompatActivity {

    final static String Tag="prueba";
    final int calorias_tomate = 27;
    final int calorias_berenjena = 25;
    final int calorias_pimiento = 19;
    final int calorias_garbanzo = 85;
    final int calorias_zanahoria = 27;
    final int calorias_cucumber = 46;
    final int calorias_couscous = 350;
    final int calorias_cebolla = 40;
    final int calorias_aceite = 135;
    final int calorias_banana= 53;
    final int calorias_calabacin = 72;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(Tag, "activity 2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_calories);
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        calorias.setText("0");

    }
    public void botonBerenjena_Pulsado(View view) {
        Log.d(Tag, "activity berenjena");
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);// ver main.xml
        int cal= Integer.parseInt(calorias.getText().toString());
        Log.d(Tag, cal+"calorias");
        if (cal==0){
            calorias.setText(calorias_berenjena+"");
        }
        else
            calorias.setText((cal+calorias_berenjena)+"");

    }

    public void botonTomate_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_tomate+"");
        }
        else
            calorias.setText(cal+calorias_tomate+"");
    }

    public void botonCucumber_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_cucumber+"");
        }
        else
            calorias.setText(cal+calorias_cucumber+"");

    }

    public void botonPimiento_verde_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_pimiento+"");
        }
        else
            calorias.setText(cal+calorias_pimiento+"");
    }

    public void botonPimiento_rojo_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_pimiento+"");
        }
        else
            calorias.setText(cal+calorias_pimiento+"");
    }

    public void botonCebolla_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_cebolla+"");
        }
        else
            calorias.setText(cal+calorias_cebolla+"");
    }

    public void botonBanana_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_banana+"");
        }
        else
            calorias.setText(cal+calorias_banana+"");
    }

    public void botonAceite_oliva_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_aceite+"");
        }
        else
            calorias.setText(cal+calorias_aceite+"");
    }

    public void botonCouscous_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_couscous+"");
        }
        else
            calorias.setText(cal+calorias_couscous+"");
    }

    public void botonGarbanzo_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_garbanzo+"");
        }
        else
            calorias.setText(cal+calorias_garbanzo+"");
    }

    public void botonZanaoria_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_zanahoria+"");
        }
        else
            calorias.setText(cal+calorias_zanahoria+"");
    }

    public void botonCalabacin_Pulsado(View view) {
        TextView calorias = (TextView) findViewById(R.id.caloriasTextView);
        int cal= Integer.parseInt(calorias.getText().toString());
        if (cal==0){
            calorias.setText(calorias_calabacin+"");
        }
        else
            calorias.setText(cal+calorias_calabacin+"");
    }
}
