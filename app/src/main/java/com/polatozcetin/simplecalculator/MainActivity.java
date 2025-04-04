package com.polatozcetin.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText Number1;
    EditText Number2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Number1=findViewById(R.id.Number1);
            Number2=findViewById(R.id.Number2);
            resultText=findViewById(R.id.resultText);



            return insets;

        });
    }

    public void sum (View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText("Enter number!");
        }else{int n1= Integer.parseInt(Number1.getText().toString());

            int n2= Integer.parseInt(Number2.getText().toString());

            int result=n1+n2;
            resultText.setText("Result: "+result);
        }


    }

    public void deduct (View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText("Enter number!");
        }else{int n1= Integer.parseInt(Number1.getText().toString());

            int n2= Integer.parseInt(Number2.getText().toString());

            int result=n1-n2;
            resultText.setText("Result: "+result);
        }
    }

    public void multiply (View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText("Enter number!");
        }else{int n1= Integer.parseInt(Number1.getText().toString());

            int n2= Integer.parseInt(Number2.getText().toString());

            int result=n1*n2;
            resultText.setText("Result: "+result);
        }
    }


    public void divide (View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText("Enter number!");
        }else{
            double n1= Integer.parseInt(Number1.getText().toString());

            double n2= Integer.parseInt(Number2.getText().toString());

            double result=n1/n2;
            resultText.setText("Result: "+result);
        }
    }

}