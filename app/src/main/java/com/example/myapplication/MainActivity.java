package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputBox;
    String input = "";
    String output = "";
    double num1 = 0.0;
    double num2 = 0.0;
    double answer = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instantiate the textViews to be filled later
        setTV();
    }

    private void setTV() {
        inputBox = (TextView)findViewById(R.id.calcInput);
    }

    private void setInput(String n) {
        input = input + n;
    }


    // I incorporated the method touched on in class that was in the notes
    // to have multiple buttons call one method
    // The google doc where the notes were located is linked below
    // https://docs.google.com/document/d/1RIUmb3jgJADvgss2Dm4-tNKqUcj_FqONM6OAe1c8x3w/edit
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
                    num2 = Double.valueOf(input.substring(input.indexOf("+")));
                    answer = num1+num2;
                    input += " = " + output.format(String.valueOf(answer));
                    inputBox.setText(input);
                }

            }
            else if(input.indexOf("-") != -1){
                if(input.indexOf("-") < input.length()){
                    num1 = Double.valueOf(input.substring(0,input.indexOf("-")));
                    num2 = Double.valueOf(input.substring(input.indexOf("-")+1));
                    answer = num1-num2;
                    input += " = " + output.format(String.valueOf(answer));
                    inputBox.setText(input);
                }

            }
            else if(input.indexOf("*") != -1){
                Log.i("Salome", "Multiply Button clicked");
                if(input.indexOf("*") < input.length()){
                    num1 = Double.valueOf(input.substring(0,input.indexOf("*")));
                    num2 = Double.valueOf(input.substring(input.indexOf("*")+1));
                    answer = num1*num2;
                    input += " = " + output.format(String.valueOf(answer));
                    inputBox.setText(input);
                }

            }
            else if(input.indexOf("/") != -1){
                if(input.indexOf("/") < input.length()){
                    num1 = Double.valueOf(input.substring(0,input.indexOf("/")));
                    num2 = Double.valueOf(input.substring(input.indexOf("/")+1));
                    answer = num1/num2;
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

    // I had trouble with this method and had to eventually use the video linked below
    // https://youtu.be/-jOEn3Vv0bM?si=WXCDMcw5xIpPeMIj
    // This code is setting both my input into the calculator as well as the textview
    // showing my input to be empty
    public void clearOnClick(View v){
        input = "";
        inputBox.setText("");
    }

}