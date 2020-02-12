package com.example.simplecalculator;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    Integer num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = num1 + num2;
                textResult.setText("계산 결과: " + result.toString());
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = num1 - num2;
                textResult.setText("계산 결과: " + result.toString());
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = num1 * num2;
                textResult.setText("계산 결과: " + result.toString());
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result = num1 / num2;
                textResult.setText("계산 결과: " + result.toString());
                return false;
            }
        });

    }
}
