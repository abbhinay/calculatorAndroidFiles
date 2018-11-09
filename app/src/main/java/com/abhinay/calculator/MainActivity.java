package com.abhinay.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView monitorView;
    TextView resultView;
    String number1 = "";
    String number2 = "";
    int manager = 1;
    String operation = "";
    double answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitorView = (TextView) findViewById(R.id.monitor);
        resultView = (TextView) findViewById(R.id.resultTextView);
    }

    public void result(View v){
        Log.d("calculator", "result");
        String Ret = doTheMath(Double.parseDouble(number1), Double.parseDouble(number2), operation);
        number1 = Ret;
        number2 = "";
        manager = 2;
    }
    public void memory(View v){
        if(number1 != ""){
            double no = 1;
            for(int i=Integer.parseInt(number1); i > 0 ; i--){
                no = no*i;
            }
            number1 = Double.toString(no);
            monitorView.setText(number1 + operation + number2);
        }
    }
    public void leftBracket(View v){
        manager = 2;
        operation = "^";
        monitorView.setText(number1 + operation + number2);
    }
    public void cancel(View v){
        Log.d("calculator", "c");
        number1 = "";
        number2 = "";
        operation = "";
        manager = 1;
        double answer = 0;
        monitorView.setText(number1 + operation + number2);
        resultView.setText("");
    }
    public void backspace(View v){
        Log.d("calculator", "backspace");
        if(manager == 1){
            if (number1 != null && number1.length() > 0) {
                number1 = number1.substring(0, number1.length() - 1);
                monitorView.setText(number1 + operation + number2);
            }
        }else{
            if (number2 != null && number2.length() > 0) {
                number2 = number2.substring(0, number2.length() - 1);
                monitorView.setText(number1 + operation + number2);
            }
        }

    }
    public void decimal(View v){
        Log.d("calculator", ".");
        if(manager == 1){
            number1 = number1 + ".";
        }else{
            number2 = number2 + ".";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void divide(View v){
        Log.d("calculator", "divide");
        manager = 2;
        operation = "/";
        monitorView.setText(number1 + operation + number2);
    }
    public void multiply(View v){
        Log.d("calculator", "multiply");
        manager = 2;
        operation = "*";
        monitorView.setText(number1 + operation + number2);
    }
    public void subtract(View v){
        Log.d("calculator", "subtract");
        manager = 2;
        operation = "-";
        monitorView.setText(number1 + operation + number2);
    }
    public void add(View v){
        Log.d("calculator", "addition");
        manager = 2;
        operation = "+";
        monitorView.setText(number1 + operation + number2);
    }
    public void nine(View v){
        Log.d("calculator", "9");
        if(manager == 1){
            number1 = number1 + "9";
        }else{
            number2 = number2 + "9";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void eight(View v){
        Log.d("calculator", "8");
        if(manager == 1){
            number1 = number1 + "8";
        }else{
            number2 = number2 + "8";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void seven(View v){
        Log.d("calculator", "7");
        if(manager == 1){
            number1 = number1 + "7";
        }else{
            number2 = number2 + "7";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void six(View v){
        Log.d("calculator", "6");
        if(manager == 1){
            number1 = number1 + "6";
        }else{
            number2 = number2 + "6";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void five(View v){
        Log.d("calculator", "5");
        if(manager == 1){
            number1 = number1 + "5";
        }else{
            number2 = number2 + "5";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void four(View v){
        Log.d("calculator", "4");
        if(manager == 1){
            number1 = number1 + "4";
        }else{
            number2 = number2 + "4";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void three(View v){
        Log.d("calculator", "3");
        if(manager == 1){
            number1 = number1 + "3";
        }else{
            number2 = number2 + "3";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void two(View v){
        Log.d("calculator", "2");
        if(manager == 1){
            number1 = number1 + "2";
        }else{
            number2 = number2 + "2";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void one(View v){
        Log.d("calculator", "1");
        if(manager == 1){
            number1 = number1 + "1";
        }else{
            number2 = number2 + "1";
        }
        monitorView.setText(number1 + operation + number2);
    }
    public void Zero(View v){
        Log.d("calculator", "0");
        if(manager == 1){
            number1 = number1 + "0";
        }else{
            number2 = number2 + "0";
        }
        monitorView.setText(number1 + operation + number2);
    }

    public String doTheMath(double num1, double num2, String op){
        if(op.equals("+")){
            answer = num1 + num2;
            Log.d("calculator", "(String) answer");
        }
        else if(op.equals("-")){
            answer = num1 - num2;
        }
        else if(op.equals("*")){
            answer = num1 * num2;
        }
        else if(op.equals("/")){
            answer = num1/num2;
        }
        else if(op.equals("^")){
            answer = Math.pow(num1, num2);
        }
        else if(op.equals("√")){
            answer = num1 * Math.sqrt(num2);
        }
        resultView.setText(Double.toString(answer));
        return Double.toString(answer);
    }
}
