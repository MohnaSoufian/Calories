package com.example.calories;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginDialog {
    public final int ID = 1;
    private AlertDialog.Builder loginBuilder;
    private AlertDialog elDialogo = null;
    private static final String TAG = "prueba";

    public LoginDialog(final Context ctx, View mView){
        Log.d(TAG, "LoginDialog constructor ");
        this.loginBuilder= new AlertDialog.Builder(ctx);
        Log.d(TAG, "Login dialog constructor inicializado");
        final EditText mEmail= (EditText) mView.findViewById(R.id.emailEditText);
        final EditText mPassword= (EditText) mView.findViewById(R.id.passwordEditText);
        Button mLogin= (Button) mView.findViewById(R.id.login2Btn);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onclick  login dialog");
                if (!mEmail.getText().toString().isEmpty() && !mPassword.getText().toString().isEmpty()) {
                    Toast.makeText(ctx,
                            "login successful",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ctx,
                            "please fill any empty fields",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        loginBuilder.setView(mView);


    }
    public final AlertDialog dameElDialogo() {
        if (this.elDialogo == null) {
            Log.d(TAG, "login dialogo dame dialogo");
            this.elDialogo = this.loginBuilder.create();
        }
        return this.elDialogo;
    }

}
