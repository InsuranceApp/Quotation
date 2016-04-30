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

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.jayasimha.quotation.R;




public class policy_calculate extends AppCompatActivity implements OnClickListener {

    Button buttonOne, buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcuate_premium1);

        //confirmation dropdown
        String[] confirmation = {"Engine Number", "Chasis Number"};
        ArrayAdapter<String> stringArrayAdapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        confirmation);
        Spinner spinner =
                (Spinner) findViewById(R.id.ConfirmationType);
        spinner.setAdapter(stringArrayAdapter);

        buttonOne = (Button) findViewById(R.id.CalculatePreButton);
        buttonOne.setOnClickListener(this);

    }

    final Context context = this;

    @Override
    public void onClick(View v) {
        EditText policyNumber = (EditText) findViewById(R.id.PolicyNumberDetail);

        if( policyNumber.getText().toString().trim().equals("")){
            policyNumber.setError( "Policy Number is required!" );
        }
        else {
            Intent intent1 = new Intent(context, CustomExpandableList.class);
            startActivity(intent1);
        }

    }
}