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
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;


import android.widget.Spinner;

import android.widget.Toast;

import android.widget.Spinner;
import android.widget.Toast;


import android.widget.ArrayAdapter;

import android.widget.Spinner;

import com.example.jayasimha.quotation.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity1 extends AppCompatActivity implements OnItemSelectedListener {

    Button button;
    Spinner s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_quote);


        //date dropdown
        String[] vdate = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        ArrayAdapter<String> stringArrayAdapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vdate);
        Spinner spinner =
                (Spinner) findViewById(R.id.date);
        spinner.setAdapter(stringArrayAdapter);

        //month dropdown
        String[] vmonth = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        ArrayAdapter<String> stringArrayAdapter1 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vmonth);
        Spinner spinner1 =
                (Spinner) findViewById(R.id.month);
        spinner1.setAdapter(stringArrayAdapter1);

        //year dropdown
        String[] vyear = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"};
        ArrayAdapter<String> stringArrayAdapter2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vyear);
        Spinner spinner2 =
                (Spinner) findViewById(R.id.year);
        spinner2.setAdapter(stringArrayAdapter2);
        //end of year dropdown
        //start of manfacturer dropdown
        String[] vmanfact = {"ARIEL", "ASHOK LEYLAND", "ASTON MARTIN", "ATUL AUTO LTD", "AUDI", "AUSTIN", "BAJAJ AUTO", "BAJAJ TEMPO LTD", "Bentley", "BMW", "BRP ROTAX", "CADILLAC", "CAMPAGNA MOTORS", "CHEVROLET", "CHRYSLER", "DAEWOO MOTORS", "DATSUN", "DODGE", "EICHER MOTOR", "Ferrari", "FIAT", "FORCE MOTOR LTD", "FORD", "GENERAL MOTORS", "Hindustan Motors", "Holden", "HONDA", "HUMMER", "HYUNDAI", "ICML", "INFINITI", "ISUZU MOTORS LTD", "JAGUAR", "KIA MOTORS", "KUMAR MOTORS PVT LTD", "LADA", "Lamborgini", "Land Rover", "LINCOLN LIMOUSINE", "M &amp; M", "MAHINDRA RENAULT PVT LTD.", "MARUTI", "MASERATI", "Mazda Motor", "MERCEDES", "MISAKI SPEED CO. LTD", "Mitsubishi", "NISSAN", "PEUGEOT", "PGO", "PIAGGIO", "PILOTE", "PONTIAC", "PORSCHE", "PREMIER", "Renault", "REVA", "RILEY", "Rolls-Royce", "SAAB CITY LTD", "SAN MOTORS", "SKODA", "Sonalika Group", "SSANGYONG MOTOR CO", "SWARAJ MAZDA LTD", "Tata Motors", "TOYOTA", "TVS MOTOR", "UMBRELLA CORPORATION", "Volks Wagon", "VOLKSWAGEN", "VOLVO"};
        ArrayAdapter<String> stringArrayAdapter3 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vmanfact);
         s1 =
                (Spinner) findViewById(R.id.manufacturer);
        s1.setAdapter(stringArrayAdapter3);
        s2 = (Spinner)findViewById(R.id.model);
        s1.setOnItemSelectedListener(this);
        addListenerOnButton();


    }
    //display of model dropdown based on the value selection in manufacturer model
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub
        String sp1= String.valueOf(s1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if(sp1.contentEquals("ARIEL")) {
            List<String> list = new ArrayList<String>();
            list.add("ATOM 3");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }
        if(sp1.contentEquals("ASHOK LEYLAND")) {
            List<String> list = new ArrayList<String>();

            list.add("ALPSV CAMPER VAN");
            list.add("STILE LE 8STR");
            list.add("STILE LS 7STR");
            list.add("STILE LS 8STR");
            list.add("STILE LX 7STR");
            list.add("STILE LX 8STR");
            ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter2.notifyDataSetChanged();
            s2.setAdapter(dataAdapter2);
        }
        if(sp1.contentEquals("ASTON MARTIN")) {
            List<String> list = new ArrayList<String>();

            list.add("DB9");
            list.add("DBS COUPE");
            list.add("RAPIDE");
            list.add("V8 VANTAGE");
            list.add("VANTAGE V8");
            list.add("VIRAGE");
            ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter3.notifyDataSetChanged();
            s2.setAdapter(dataAdapter3);
        }
        if(sp1.contentEquals("ATUL AUTO LTD")) {
            List<String> list = new ArrayList<String>();

            list.add("AUTO RICKSHAW");

            ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter4.notifyDataSetChanged();
            s2.setAdapter(dataAdapter4);
        }
        if(sp1.contentEquals("AUDI")) {
            List<String> list = new ArrayList<String>();

            list.add("A3 1.8 TFSI PREMIUM PLUS");
            list.add("A3 2.0 TDI");
            list.add("A3 35 TDI ATTRACTION");
            list.add("A3 35 TDI PREMIUM");
            list.add("A3 35 TDI PREMIUM PLUS");
            list.add("A3 35 TDI TECHNOLOGY");
            ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter5.notifyDataSetChanged();
            s2.setAdapter(dataAdapter5);
        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    //end



    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.getquote);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity2.class);
                startActivity(intent);

            }

        });

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
