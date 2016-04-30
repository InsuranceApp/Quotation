package com.example.jayasimha.quotation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


import android.widget.ArrayAdapter;

import android.widget.Spinner;

import com.example.jayasimha.quotation.R;




public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button buttonOne,buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = (Button) findViewById(R.id.getquickquote);
        buttonTwo = (Button) findViewById(R.id.buyquote);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);




    }



        final Context context = this;



            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.getquickquote:
                        Intent intent1 = new Intent(context, MainActivity1.class);
                        startActivity(intent1);
                        break;
                    case R.id.buyquote:
                        Intent intent = new Intent(context, MainActivity3.class);
                        startActivity(intent);
                        break;

                    default:
                        break;
                }






            }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
