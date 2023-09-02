package com.maicuongtho.myactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mymenu, menu);
        //CreateMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu2:
                Toast.makeText(this, "You clicked on Item 2", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu3:
                Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_LONG).show();
                break;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }


}