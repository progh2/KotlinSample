package kr.hs.emirim.progh2.kotlinsample;

import android.widget.Toast;

public class ToastUtilJava {

    public static void toastLong(String message){
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_LONG).show();
    }

    public static void toastShort(String message){
        Toast.makeText(MainApplication.getAppContext(), message, Toast.LENGTH_SHORT).show();
    }

}
