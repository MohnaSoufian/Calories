package com.example.calories;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Toast;

public class ThirdActivity
        extends AppCompatActivity
        implements Elegidor.Listener{

    private Elegidor selectorDeNivel;
    // .....................................................................
    enum Options { muy_facil, facil, medio, dificil};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast.makeText(this, "toast de duración larga", Toast.LENGTH_LONG).show();
        selectorDeNivel = new Elegidor (Options.class, "choose an option", this, this);
        showDialog(selectorDeNivel.ID);
    }
    @Override
    protected Dialog onCreateDialog(int dialogId) {
        Dialog aDialog = null;
        if (dialogId == selectorDeNivel.ID) {
            aDialog = selectorDeNivel.dameElDialogo();
        }
        return aDialog;
    }

    @Override
    public <T extends Enum<T>> void eleccionHecha(T theChoice) {
        Toast.makeText(this, "tu elección = " + theChoice, Toast.LENGTH_LONG).show();
    }
}
