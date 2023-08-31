package com.maicuongtho.spinnerviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> presidents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //presidents = getResources().getStringArray(R.array.presidents_array);
        presidents = new ArrayList<String>();
        presidents.add("Richard Nixon");
        presidents.add("Gerald Ford");
        presidents.add("Jimmy Carter");
        presidents.add("Ronald Reagan");
        presidents.add("George H. W. Bush");
        presidents.add("Bill Clinton");
        presidents.add("George W. Bush");
        presidents.add("Barack Obama");
        presidents.add("Donald Trump");
        presidents.add("Joe Biden");

        Spinner s1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice, presidents);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int index = adapterView.getSelectedItemPosition();
                Toast.makeText(getBaseContext(),
                        "You have selected item : " + presidents.get(index),
                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}