package com.hyunseok.android.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrid = (Button)findViewById(R.id.btnGrid);
        btnGrid.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // 안드로이드 메이저 컴포넌트(액티비티, 서비스, 컨텐트 프로바이더, 브로드캐스트 리시버)를 로드하기 위해서는
        // intent를 통해서 로드할 컴포넌트를 지정해야한다.
        switch(v.getId()) {
            case R.id.btnGrid :
                Intent intent = new Intent(this, CalculatorActivity.class); // <- 대상이 되는 컴포넌트임.
                startActivity(intent);
                finish();
        }

    }
}
