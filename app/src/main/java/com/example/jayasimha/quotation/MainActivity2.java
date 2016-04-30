package com.example.jayasimha.quotation;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jayasimha.quotation.R;


public class MainActivity2 extends AppCompatActivity implements OnClickListener {
    Button buttonOne,buttonTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idv_quote);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        buttonOne = (Button) findViewById(R.id.button1);
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);

           }


    final Context context = this;



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(context, MainActivity1.class);
                startActivity(intent1);
                break;
            case R.id.button2:

                //dialog starts here

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Premium Estimate has been given by assuming no gap in insurance and no claim in all previous policies.Please \n" +
                        "validate & confirm all details as per your previous policy on Calculate Premium page before proceeding to buy");

                alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent2 = new Intent(context, CurrentInsDetails.class);
                        startActivity(intent2);

                    }
                });

                alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                //end of dialog

                break;

            default:
                break;
        }






    }



}


