package com.example.jayasimha.quotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Spinner;


public class Registration_details extends AppCompatActivity implements OnClickListener {

    Button buttonOne,buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_details1);

        //date dropdown
        String[] vdate = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        ArrayAdapter<String> stringArrayAdapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vdate);
        Spinner spinner =
                (Spinner) findViewById(R.id.date1);
        spinner.setAdapter(stringArrayAdapter);

        //month dropdown
        String[] vmonth = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        ArrayAdapter<String> stringArrayAdapter1 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vmonth);
        Spinner spinner1 =
                (Spinner) findViewById(R.id.month1);
        spinner1.setAdapter(stringArrayAdapter1);

        //year dropdown
        String[] vyear = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"};
        ArrayAdapter<String> stringArrayAdapter2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vyear);
        Spinner spinner2 =
                (Spinner) findViewById(R.id.year1);
        spinner2.setAdapter(stringArrayAdapter2);
        //end of year dropdown





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
