package com.maicuongtho.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Intent i = new Intent(this, SecondActivity.class);
    //---use putExtra() to add new name/value pairs---
        i.putExtra("name1", "Mai Cuong Tho");
        i.putExtra("age1", 25);
    //---use a Bundle object to add new name/values pairs---
        Bundle extras = new Bundle();
        extras.putString("name2", "Pham Hong Tuoi");
        extras.putInt("age2", 35);
    //---attach the Bundle object to the Intent object---
        i.putExtras(extras);
    //---start the activity ( don't get a result back)---
        startActivity(i);
    }
}