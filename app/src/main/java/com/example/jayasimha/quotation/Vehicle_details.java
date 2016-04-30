package com.example.jayasimha.quotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Vehicle_details extends AppCompatActivity implements AdapterView.OnItemSelectedListener,OnClickListener {


    Spinner s1, s2;
    Button saveandnext, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicle_details1);

        //start of manfacturer dropdown
        String[] vmanfact = {"ARIEL", "ASHOK LEYLAND", "ASTON MARTIN", "ATUL AUTO LTD", "AUDI", "AUSTIN", "BAJAJ AUTO", "BAJAJ TEMPO LTD", "Bentley", "BMW", "BRP ROTAX", "CADILLAC", "CAMPAGNA MOTORS", "CHEVROLET", "CHRYSLER", "DAEWOO MOTORS", "DATSUN", "DODGE", "EICHER MOTOR", "Ferrari", "FIAT", "FORCE MOTOR LTD", "FORD", "GENERAL MOTORS", "Hindustan Motors", "Holden", "HONDA", "HUMMER", "HYUNDAI", "ICML", "INFINITI", "ISUZU MOTORS LTD", "JAGUAR", "KIA MOTORS", "KUMAR MOTORS PVT LTD", "LADA", "Lamborgini", "Land Rover", "LINCOLN LIMOUSINE", "M &amp; M", "MAHINDRA RENAULT PVT LTD.", "MARUTI", "MASERATI", "Mazda Motor", "MERCEDES", "MISAKI SPEED CO. LTD", "Mitsubishi", "NISSAN", "PEUGEOT", "PGO", "PIAGGIO", "PILOTE", "PONTIAC", "PORSCHE", "PREMIER", "Renault", "REVA", "RILEY", "Rolls-Royce", "SAAB CITY LTD", "SAN MOTORS", "SKODA", "Sonalika Group", "SSANGYONG MOTOR CO", "SWARAJ MAZDA LTD", "Tata Motors", "TOYOTA", "TVS MOTOR", "UMBRELLA CORPORATION", "Volks Wagon", "VOLKSWAGEN", "VOLVO"};
        ArrayAdapter<String> stringArrayAdapter3 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        vmanfact);
        s1 =
                (Spinner) findViewById(R.id.manufacturer1);
        s1.setAdapter(stringArrayAdapter3);
        s2 = (Spinner) findViewById(R.id.model1);
        s1.setOnItemSelectedListener(this);

        saveandnext = (Button) findViewById(R.id.vsaveandnext);
        cancel = (Button) findViewById(R.id.vcancel);
        saveandnext.setOnClickListener(this);
        cancel.setOnClickListener(this);


    }


    final Context context = this;


    //display of model dropdown based on the value selection in manufacturer model
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        // TODO Auto-generated method stub
        String sp1 = String.valueOf(s1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if (sp1.contentEquals("ARIEL")) {
            List<String> list = new ArrayList<String>();
            list.add("ATOM 3");

            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }
        if (sp1.contentEquals("ASHOK LEYLAND")) {
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
        if (sp1.contentEquals("ASTON MARTIN")) {
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
        if (sp1.contentEquals("ATUL AUTO LTD")) {
            List<String> list = new ArrayList<String>();

            list.add("AUTO RICKSHAW");

            ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter4.notifyDataSetChanged();
            s2.setAdapter(dataAdapter4);
        }
        if (sp1.contentEquals("AUDI")) {
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
    public void onNothingSelected(AdapterView<?> parent) {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.vsaveandnext:
                Intent intent1 = new Intent(context, detailed_quote.class);
                startActivity(intent1);
                break;
            case R.id.vcancel:
                Intent intent = new Intent(context, Vehicle_details.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}