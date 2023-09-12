package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int numInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public static void main(String[] args) {




    }
    public void numSelected(View v){

        if(v.getId() == R.id.button1){
            numInput = 1;
        }
        else if(v.getId() == R.id.button2){
            numInput = 2;
        }
        else(v.getId() == R.id.button3){
            numInput = 3;
        }
            else(v.getId() == R.id.button4){
            numInput = 4;
        }
            else(v.getId() == R.id.button5){
            numInput = 5;
        }
            else(v.getId() == R.id.button6){
            numInput = 6;
        }
            else(v.getId() == R.id.button7){
            numInput = 7;
        }
            else(v.getId() == R.id.button8){
            numInput = 8;
        }
            else(v.getId() == R.id.button9){
            numInput = 9;
        }
            else(v.getId() == R.id.button0){
            numInput = 0;
        }
    }
}