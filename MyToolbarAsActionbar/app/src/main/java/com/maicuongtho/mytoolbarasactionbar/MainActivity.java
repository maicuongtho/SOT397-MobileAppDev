package com.maicuongtho.mytoolbarasactionbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // assigning ID of the toolbar to a variable
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // using toolbar as ActionBar
        setSupportActionBar(toolbar);
        // Display application icon in the toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.app_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        // assigning ID of textView2 to a variable
        ImageView img2= (ImageView)findViewById(R.id.imageView2);
        img2.setClickable(true);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        "You clicked on Build Icon",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}