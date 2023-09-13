package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputBox;
    String input = "";
    TextView resultBox;
    String output = "";
    double num1 = 0.0;
    double num2 = 0.0;
    double answer = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instantiate the textViews to be filled later
        setTVs();
    }

    private void setTVs() {
        inputBox = (TextView)findViewById(R.id.calcInput);
        resultBox = (TextView)findViewById(R.id.calcResults);
    }

    private void setInput(String n) {
        input = input + n;
    }

    private void setOutput(String n){
        output = output + n;
    }

    public void buttonOnClick(View v){

        if(v.getId() == R.id.button1){
            setInput("1");
        }
        else if(v.getId() == R.id.button2){
            setInput("2");
        }
        else if(v.getId() == R.id.button3){
            setInput("3");
        }
        else if(v.getId() == R.id.button4){
            setInput("4");
        }
        else if(v.getId() == R.id.button5){
            setInput("5");
        }
        else if(v.getId() == R.id.button6){
            setInput("6");
        }
        else if(v.getId() == R.id.button7){
            setInput("7");
        }
        else if(v.getId() == R.id.button8){
            setInput("8");
        }
        else if(v.getId() == R.id.button9){
            setInput("9");
        }
        else if(v.getId() == R.id.button0){
            setInput("0");
        }
        else if(v.getId() == R.id.plusButton){
            setInput("+");
        }
        else if(v.getId() == R.id.minusButton){
            setInput("-");
        }
        else if(v.getId() == R.id.multiplyButton){
            setInput("*");
        }
        else if(v.getId() == R.id.divideButton){
            setInput("/");
        }
        else if(v.getId() == R.id.enterButton){
            if(input.indexOf("+") != -1){
                if(input.indexOf("+") < input.length()){
                    num1 = Double.valueOf(input.substring(0,input.indexOf("+")));
                    num2 = Double.valueOf(input.substring(input.indexOf("+"),input.length()));
                    answer = num1 + num2;
                    input += " = " + output.format(String.valueOf(answer));
                    inputBox.setText(input);
                }
                else{
                    input = "";
                }
            }
            else if(input.indexOf("-") != -1){
                if(input.indexOf("-") < input.length()){
                    num1 = Double.valueOf(input.substring(0,input.indexOf("-")));
                    num2 = Double.valueOf(input.substring(input.indexOf("-"),input.length()));
                    answer = num1 - num2;
                    input += " = " + output.format(String.valueOf(answer));
                    inputBox.setText(input);
                }
                else{
                    input = "";
                }
            }
            else if(input.indexOf("*") != -1){
                if(input.indexOf("*") < input.length()){
                    num1 = Double.valueOf(input.substring(0,input.indexOf("*")));
                    num2 = Double.valueOf(input.substring(input.indexOf("*"),input.length()));
                    answer = num1 * num2;
                    input += " = " + output.format(String.valueOf(answer));
                    inputBox.setText(input);
                }
                else{
                    input = "";
                }
            }
            else if(input.indexOf("/") != -1){
                if(input.indexOf("/") < input.length()){
                    num1 = Double.valueOf(input.substring(0,input.indexOf("/")));
                    num2 = Double.valueOf(input.substring(input.indexOf("/"),input.length()));
                    answer = num1 / num2;
                    input += " = " + output.format(String.valueOf(answer));
                    inputBox.setText(input);
                }
                else{
                    input = "";
                }
            }
        }
        inputBox.setText(input);
    }

    public void clearOnClick(View v){
        input = "";
        inputBox.setText("");
        resultBox.setText("");
    }

}