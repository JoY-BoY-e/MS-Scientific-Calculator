package com.example.calculator;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView2,expressiontxt;
    double prev_Val=0;

    double[] memory = new double[10];
    int m_size=0;


    String currentOperation = "";
    Button  btn_1,btn_2,btn_3,btn_0,btn_7,btn_8,btn_9,btn_4,btn_5,btn_6,btn_plus,btn_minus,
    btn_equal,btn_plus_min,btn_dot,btn_mul,btn_div,btn_mod,btn_C,btn_CE,btn_clr,
            btn_frac,btn_sq,btn_sqrt,btn01,btn02,btn03,btn04,btn05,btn06;

    private void adjustTextSize() {
        int length = textView2.getText().toString().length();

        if (length <= 11) {
            textView2.setTextSize(38); // Large size for small inputs
        } else if (length <= 24) {
            textView2.setTextSize(28);
        } else if (length <= 32) {
            textView2.setTextSize(18);
        } else {
            textView2.setTextSize(15); // Smallest size for large inputs
        }
    }

    private void formatAndSetText(double value) {
        if (value == (long) value) {
            textView2.setText(String.format("%d", (long) value));
        } else {
            textView2.setText(String.valueOf(value));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn01= findViewById(R.id.btn01);
        btn02= findViewById(R.id.btn02);
        btn03= findViewById(R.id.btn03);
        btn04= findViewById(R.id.btn04);
        btn05= findViewById(R.id.btn05);
        btn06= findViewById(R.id.btn06);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_0 = findViewById(R.id.btn_0);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_equal = findViewById(R.id.btn_equal);
        btn_dot = findViewById(R.id.btn_dot);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        btn_plus_min = findViewById(R.id.btn_pls_min);
        btn_clr = findViewById(R.id.btn_clr);
        btn_C  = findViewById(R.id.btn_C);
        btn_CE = findViewById(R.id.btn_CE);
        btn_mod = findViewById(R.id.btn_mod);
        btn_frac = findViewById(R.id.btn_fract);
        btn_sq = findViewById(R.id.btn_sq);
        btn_sqrt = findViewById(R.id.btn_sqrt);

        textView2=findViewById(R.id.textView2);
        expressiontxt=findViewById(R.id.expressiontxt);



        textView2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
               adjustTextSize();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "1";
                }
                else
                    val += '1';
                textView2.setText(val);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "2";
                }
                else
                    val += '2';
                textView2.setText(val);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "3";
                }
                else
                    val += '3';
                textView2.setText(val);
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "0";
                }
                else
                    val += '0';
                textView2.setText(val);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "7";
                }
                else
                    val += '7';
                textView2.setText(val);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "8";
                }
                else
                    val += '8';
                textView2.setText(val);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "9";
                }
                else
                    val += '9';
                textView2.setText(val);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "4";
                }
                else
                    val += '4';
                textView2.setText(val);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "5";
                }
                else
                    val += '5';
                textView2.setText(val);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=textView2.getText().toString();
                if(val.equals("0")){
                    val = "6";
                }
                else
                    val += '6';
                textView2.setText(val);
            }
        });

        //memory operations
        btn01.setOnClickListener(v -> {
            if(memory.length>0){
                memory = new double[10];
            }
        });

        btn02.setOnClickListener(v->{
            textView2.setText(String.valueOf(memory[m_size]));
        });

        btn03.setOnClickListener(v -> {
            double currentValue=Double.parseDouble(textView2.getText().toString());
            memory[m_size-1] += currentValue;
        });

        btn04.setOnClickListener(v -> {
            double currentValue=Double.parseDouble(textView2.getText().toString());
            memory[m_size-1] -= currentValue;
        });

        btn05.setOnClickListener(v -> {
            double currentValue=Double.parseDouble(textView2.getText().toString());
            if(m_size < 10)
                memory[m_size++] = currentValue;
            else
                showToast("Memory is Full");
        });

        // Operation buttons
        btn_plus.setOnClickListener(v -> handleOperation("+"));
        btn_minus.setOnClickListener(v -> handleOperation("-"));
        btn_mul.setOnClickListener(v -> handleOperation("*"));
        btn_div.setOnClickListener(v -> handleOperation("/"));

        btn_equal.setOnClickListener(v -> {
            try {
                double currentValue = Double.parseDouble(textView2.getText().toString());
                double result = performCalculation(currentValue);
                formatAndSetText(result);
                prev_Val = result;
                currentOperation = "";
            } catch (NumberFormatException e) {
                showToast("Invalid number!");
            }
        });

        btn_sqrt.setOnClickListener(v -> {
            try {
                double currentValue = Double.parseDouble(textView2.getText().toString());
                if (currentValue < 0) {
                    showToast("Cannot calculate square root of a negative number!");
                } else {
                    double result = Math.sqrt(currentValue);
                    formatAndSetText(result);
                }
            } catch (NumberFormatException e) {
                showToast("Invalid number!");
            }
        });

        btn_sq.setOnClickListener(v -> {
            try {
                double currentValue = Double.parseDouble(textView2.getText().toString());
                double result = currentValue * currentValue;
                formatAndSetText(result);
            } catch (NumberFormatException e) {
                showToast("Invalid number!");
            }
        });

        btn_frac.setOnClickListener(v -> {
            try {
                double currentValue = Double.parseDouble(textView2.getText().toString());
                if (currentValue == 0) {
                    showToast("Cannot divide by zero!");
                } else {
                    double result = 1 / currentValue;
                    formatAndSetText(result);
                }
            } catch (NumberFormatException e) {
                showToast("Invalid number!");
            }
        });


        btn_mod.setOnClickListener(v -> {
            try {
                double currentValue = Double.parseDouble(textView2.getText().toString());
                if (!currentOperation.isEmpty()) {
                    switch (currentOperation) {
                        case "+":
                        case "-":
                            currentValue = (prev_Val * currentValue) / 100;
                            break;
                        case "*":
                        case "/":
                            currentValue /= 100;
                            break;
                    }
                } else {
                    currentValue /= 100;
                }
                formatAndSetText(currentValue);
            } catch (NumberFormatException e) {
                showToast("Invalid number!");
            }
        });

        btn_plus_min.setOnClickListener(v -> {
            String val = textView2.getText().toString();
            if (val.startsWith("-")) {
                textView2.setText(val.substring(1));
            } else if (!val.equals("0")) {
                textView2.setText("-" + val);
            }
        });

        btn_dot.setOnClickListener(v -> {
            String val = textView2.getText().toString();
            if (!val.contains(".")) {
                textView2.setText(val + ".");
            }
        });

        btn_CE.setOnClickListener(v -> textView2.setText("0"));

        btn_C.setOnClickListener(v -> {
            textView2.setText("0");
            expressiontxt.setText("0");
            prev_Val = 0;
            currentOperation = "";
        });

        btn_clr.setOnClickListener(v -> {
            String val = textView2.getText().toString();
            if (val.length() > 1) {
                val = val.substring(0, val.length() - 1);
            } else {
                val = "0";
            }
            textView2.setText(val);
        });
    }

    private void handleOperation(String operation) {
        try {
            double currentValue = Double.parseDouble(textView2.getText().toString());
            if (!currentOperation.isEmpty()) {
                currentValue = performCalculation(currentValue);
                formatAndSetText(currentValue);
            }
            prev_Val = currentValue;
            currentOperation = operation;
            expressiontxt.setText(String.valueOf(prev_Val) + operation);
            textView2.setText("0");
        } catch (NumberFormatException e) {
            showToast("Invalid number!");
        }
    }

    private double performCalculation(double currentValue) {

        expressiontxt.setText(String.valueOf(prev_Val)+currentOperation+String.valueOf(currentValue));
        switch (currentOperation) {
            case "+":
                return prev_Val + currentValue;
            case "-":
                return prev_Val - currentValue;
            case "*":
                return prev_Val * currentValue;
            case "/":
                if (currentValue == 0) {
                    showToast("Cannot divide by zero");
                    return prev_Val;
                }
                return prev_Val / currentValue;
            default:
                return currentValue;
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}