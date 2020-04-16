package com.example.calories;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import java.lang.reflect.Method;


public class Elegidor implements IElegidor {

    public final int ID;
    private Listener quienNosEscucha;
    private AlertDialog.Builder elBuilderDeDialogo;
    private AlertDialog elDialogo = null;
    private final String[] losNombres;


    public <T extends Enum<T>> Elegidor(final Class<T> theEnum, String theTitle, Context ctx, Listener listener) {
        this.ID = theEnum.hashCode();
        this.losNombres = sacaNombres(theEnum);
        this.quienNosEscucha = listener;
        this.elBuilderDeDialogo = new AlertDialog.Builder(ctx);
        this.elBuilderDeDialogo.setTitle(theTitle);
        this.elBuilderDeDialogo.setSingleChoiceItems(losNombres, -1, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int electedNumber) {
                dialog.dismiss();
                Enum.valueOf(theEnum, losNombres[electedNumber]);
                T theOption = (T) Enum.valueOf(theEnum, losNombres[electedNumber]);
                if (quienNosEscucha != null) {
                    quienNosEscucha.eleccionHecha(theOption);
                    }
                }
            });
    } // ()
    private static <T extends Enum<T>> String[] sacaNombres(Class<T> c) {
        // returns the values of *any* enum in an array of String
        String[] values;
        try {
            Method m1 = c.getMethod("values");
            Object[] valuesObj;
            valuesObj = (Object[]) m1.invoke(c);
            values = new String[valuesObj.length];
            for (int i = 0; i < valuesObj.length; i++) {
                values[i] = valuesObj[i].toString();
            }
        } catch (Exception ex) {
            values = null;
        }
        return values;
    }

    public final AlertDialog dameElDialogo() {
        if (this.elDialogo == null) {
            this.elDialogo = this.elBuilderDeDialogo.create();
        }
        return this.elDialogo;
    }

    public interface Listener {
        public <T extends Enum<T>> void eleccionHecha(T theChoice);
    }
}
