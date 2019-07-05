package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button equals, operation;
    private TextView textView;
    private EditText editText1, editText2;

    private double ans = 0.0;
    private String op;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equals = findViewById(R.id.equals);
        operation = findViewById(R.id.operation);
        textView = findViewById(R.id.result);
        editText1 = findViewById(R.id.field1);
        editText2 = findViewById(R.id.field2);
        op = "SUM";
    }

    public void computation(View view) {

        if(op.equals("SUM")) {
            op = "SUBTRACT";
            operation.setText("SUBTRACT");
        } else if(op.equals("SUBTRACT")) {
            op = "PRODUCT";
            operation.setText("PRODUCT");
        } else if(op.equals("PRODUCT")) {
            op = "DIVISION";
            operation.setText("DIVISION");
        } else if(op.equals("DIVISION")) {
            op = "SUM";
            operation.setText("SUM");
        }

    }

    public void show(View view) {

        double a = Double.parseDouble(editText1.getText().toString());
        double b = Double.parseDouble(editText2.getText().toString());

        if(op.equals("SUM")) {
            ans = a + b;
        } else if(op.equals("SUBTRACT")) {
            ans = a - b;
        }  else if(op.equals("PRODUCT")) {
            ans = a * b;
        }  else if(op.equals("DIVISION")) {
            ans = a / b;
        }

        textView.setText(String.valueOf(ans));

    }

}
