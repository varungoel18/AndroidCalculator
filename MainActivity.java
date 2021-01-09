package com.varungoel.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDecimal,btnActionDivide,btnActionMultiply,btnActionSubtract,btnActionAdd,btnActionEnter,btnClear ;
    TextView txtDisplayText;
    int firstNumber,secondNumber;
    String actionType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        btnDecimal = findViewById(R.id.btn_dot);
        btnActionDivide = findViewById(R.id.btn_divide);
        btnActionMultiply = findViewById(R.id.btn_multiply);
        btnActionSubtract = findViewById(R.id.btn_substract);
        btnActionAdd = findViewById(R.id.btn_addition);
        btnActionEnter = findViewById(R.id.btn_equal);
        txtDisplayText = findViewById(R.id.txt_Output);
        btnClear = findViewById(R.id.btn_cut);
        //btn1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "1");
            }
        });
        //btn2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "2");
            }
        });

        //btn3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "3");
            }
        });

        //btn4
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "4");

            }
        });

        //btn5
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "5");
            }
        });

        //btn6
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "6");
            }
        });

        //btn7
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "7");
            }
        });

        //btn8
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "8");
            }
        });

        //btn9
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "9");
            }
        });

        //btn0
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "0");
            }
        });
        //btnDivide
        btnActionDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "/");
            }
        });


        //btndecimal
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + ".");
            }
        });

        //btnmultiply
        btnActionMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "X");
            }
        });

        //btnsubtract
        btnActionSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "-");
            }
        });

        //btnadd
        btnActionAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText(txtDisplayText.getText().toString() + "+");
            }
        });

        //btnequal
        btnActionEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = txtDisplayText.getText().toString();
                if(number.contains("/")) {
                String[] splitNumber = number.split("/");
                Double firstNumber =Double.valueOf(splitNumber[0]);
                Double secondNumber = Double.valueOf(splitNumber[1]);
                txtDisplayText.setText(String.valueOf(divide(firstNumber,secondNumber)));
                }else if(number.contains("X")) {
                    String[] splitNumber = number.split("X");
                    Double firstNumber =Double.valueOf(splitNumber[0]);
                    Double secondNumber = Double.valueOf(splitNumber[1]);
                    txtDisplayText.setText(String.valueOf(mul(firstNumber,secondNumber)));
                }else if(number.contains("-")) {
                    String[] splitNumber = number.split("-");
                    Double firstNumber =Double.valueOf(splitNumber[0]);
                    Double secondNumber = Double.valueOf(splitNumber[1]);
                    txtDisplayText.setText(String.valueOf(sub(firstNumber,secondNumber)));
                }else if(number.contains("+")) {
                    String[] splitNumber = number.split("\\+");
                    Double firstNumber =Double.valueOf(splitNumber[0]);
                    Double secondNumber = Double.valueOf(splitNumber[1]);
                    txtDisplayText.setText(String.valueOf(add(firstNumber,secondNumber)));
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDisplayText.setText("");
            }
        });
    }
    Double add(Double a,Double b) {
        return a+b;
    }
    Double sub(Double a,Double b) {
        return a-b;
    }
    Double mul(Double a,Double b) {
        return a*b;
    }
    Double divide(Double a,Double b) {
        return a/b;
    }
}