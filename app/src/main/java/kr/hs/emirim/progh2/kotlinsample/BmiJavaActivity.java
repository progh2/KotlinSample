package kr.hs.emirim.progh2.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText etTall;
    EditText etWeight;
    TextView txResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        etTall = findViewById(R.id.tallField);
        etWeight = findViewById(R.id.weightFiled);
        txResult = findViewById(R.id.resultLabel);

        findViewById(R.id.bmiButton)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        double tall = Double.parseDouble(etTall.getText().toString());
                        double weight = Double.parseDouble(etWeight.getText().toString());

                        double bmi = weight / (Math.pow( (tall / 100.0), 2));
                        txResult.setText("키 : " + tall + " / 체중 : " + weight
                                + " / BMI : " + (((int) (bmi * 10))/10 ));

                    }
                });

    }
}
