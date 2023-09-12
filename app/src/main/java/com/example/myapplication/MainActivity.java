package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputBox;
    String input = "";
    TextView resultBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTVs();


    }

    private void setTVs() {
        inputBox = (TextView)findViewById(R.id.calcInput);
        resultBox = (TextView)findViewById(R.id.calcResults);
    }

    private void setInput(String n) {
        input = input + n;
    }

    public void buttonOnClick(View v){
        if(v.getId() == R.id.button1){
            setInput("1");
        }
        else if(v.getId() == R.id.button2){
            setInput("2");
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
    }

    public void clearOnClick(View v){
        input == "";
        setInput("");
        setResult("");
    }

}