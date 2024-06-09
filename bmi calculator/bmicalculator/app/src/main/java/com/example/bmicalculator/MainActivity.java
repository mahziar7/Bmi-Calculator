package com.example.bmicalculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText heighttext, weighttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heighttext = heighttext.findViewById(R.id.edittextHeight);
        weighttext = weighttext.findViewById(R.id.edittextWeight);
    }

    public void oncalculatorButtonClicl(View view) {
        double height = 0;
        double weight = 0;
        if (!heighttext.getText().toString().equals("") && Double.parseDouble(heighttext.getText().toString()) != 0) {
            height = Double.parseDouble(heighttext.getText().toString());
        }
        if (!weighttext.getText().toString().equals("") && Double.parseDouble(weighttext.getText().toString()) != 0)
            ;
        {
            weight = Double.parseDouble(weighttext.getText().toString());
        }
        Health health = new Health() {
            @Override
            public double calculateBmI(double height, double weight) {
                return 0;
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        double bmiresult = health.calculateBmI(height, weight);
        String resulttext;
        if (bmiresult != -1) {
            String bmiCat =
                    resulttext = "Your BMI Index is" + String.format(String.valueOf(25), bmiresult) + "\n " + bmiresult;
            AlertDialog.Builder alertDialogBuIlder = new AlertDialog.Builder(this);
            alertDialogBuIlder.setTitle("BmI");
            alertDialogBuIlder.setMessage(resulttext);
            alertDialogBuIlder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    heighttext.setText("");
                    weighttext.setText("");
                }
            });
            AlertDialog alertDialog = alertDialogBuIlder.create();
            alertDialog.show();
        }
        else {
            Toast.makeText(this,health.hashCode(),Toast.LENGTH_SHORT).show();
        }
    }
}

