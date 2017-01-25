package com.hyunseok.android.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    Button btn_C, btn_plus, btn_minus, btn_multiply, btn_divide, btn_result;
    TextView tv_preview, textView;

    double result = 0;
    double temp = 0;
    int sign = 0; // default0, plus1, minus2, multiply3, divide4
    boolean ch_sign = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_C = (Button)findViewById(R.id.btn_C);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        btn_divide = (Button)findViewById(R.id.btn_divide);
        btn_result = (Button)findViewById(R.id.btn_result);
        textView = (TextView)findViewById(R.id.textView);
        tv_preview = (TextView)findViewById(R.id.tv_preview);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_C.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_result.setOnClickListener(this);
    }

    public void onClick(View v) {
        // 안드로이드 메이저 컴포넌트(액티비티, 서비스, 컨텐트 프로바이더, 브로드캐스트 리시버)를 로드하기 위해서는
        // intent를 통해서 로드할 컴포넌트를 지정해야한다. 

            switch (v.getId()) {
                case R.id.btn_0:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("0");
                    break;
                case R.id.btn_1:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("1");
                    break;
                case R.id.btn_2:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("2");
                    break;
                case R.id.btn_3:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("3");
                    break;
                case R.id.btn_4:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("4");
                    break;
                case R.id.btn_5:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("5");
                    break;
                case R.id.btn_6:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("6");
                    break;
                case R.id.btn_7:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("7");
                    break;
                case R.id.btn_8:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("8");
                    break;
                case R.id.btn_9:
                    if(ch_sign == true) {
                        textView.setText("");
                        ch_sign = false;
                    }
                    textView.append("9");
                    break;
                case R.id.btn_plus:
                    //textView.append("+");
                    plus(tv_preview.getText().toString());
                    break;
                case R.id.btn_minus:
                    //textView.append("-");
                    minus(tv_preview.getText().toString());
                    break;
                case R.id.btn_multiply:
                    //textView.append("*");
                    multiply(tv_preview.getText().toString());
                    break;
                case R.id.btn_divide:
                    //textView.append("/");
                    divide(tv_preview.getText().toString());
                    break;
                case R.id.btn_C:
                    textView.setText("");
                    temp = 0;
                    result = 0;
                    ch_sign = false;
                    break;
                case R.id.btn_result:
                    result(textView.getText().toString());
                    break;
            }
    }

    public void plus(String str) {
        sign = 1;
        ch_sign = true;
        temp = Double.parseDouble(str);

        result = result + temp;

        textView.setText(result+"");
    }

    public void minus(String str) {
        sign = 2;
        ch_sign = true;
        temp = Double.parseDouble(str);

        result = result - temp;

        textView.setText(result+"");
    }

    public void multiply(String str) {
        sign = 3;
        ch_sign = true;
        temp = Double.parseDouble(str);

        result = result * temp;

        textView.setText(result+"");
    }

    public void divide(String str) {
        sign = 4;
        ch_sign = true;
        temp = Double.parseDouble(str);

        result = result / temp;

        textView.setText(result+"");
    }

    public void result(String str) {

        switch(sign) {
            case 1 :
                result = result + temp;
                textView.setText(result+"");
                temp = 0;
                break;
            case 2 :
                result = result - temp;
                textView.setText(result+"");
                temp = 0;
                break;
            case 3 :
                result = result * temp;
                textView.setText(result+"");
                temp = 0;
                break;
            case 4 :
                result = result / temp;
                textView.setText(result+"");
                temp = 0;
                break;
            default :
                break;
        }
    }
}
