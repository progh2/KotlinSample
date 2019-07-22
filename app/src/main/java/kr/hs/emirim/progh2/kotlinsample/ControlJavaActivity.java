package kr.hs.emirim.progh2.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static kr.hs.emirim.progh2.kotlinsample.ToastUtilJava.toastShort;

public class ControlJavaActivity extends AppCompatActivity {

    EditText numberField;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_control);

        numberField = findViewById(R.id.numberField);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int number = Integer.parseInt(
                       numberField.getText().toString());

               if(number % 2 == 0){
                   toastShort("2의 배수 : " + number);
               }else if(number %3 == 0){
                   toastShort("3의 배수 : " + number);
               }else{
                   ToastUtilKotlinKt.toastLong("" + number);
               }

               switch (number){
                   case 4:
                       button.setText("실행 - 4");
                       break;
                   case 9:
                       button.setText("실행 - 9");
                       break;
                   default:
                        button.setText("실행");
               }
            }
        });
    }
}
