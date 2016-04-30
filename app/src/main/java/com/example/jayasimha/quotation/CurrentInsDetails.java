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

import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.jayasimha.quotation.R;




public class CurrentInsDetails extends AppCompatActivity implements OnClickListener {

    RadioButton BuyInsForNewCar, RenewExistingPolicy;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_details);

        RadioButton myRadioButton = (RadioButton) findViewById(R.id.yes);
        myRadioButton.setVisibility(View.INVISIBLE);
        RadioButton myRadioButton2 = (RadioButton) findViewById(R.id.no);
        myRadioButton2.setVisibility(View.INVISIBLE);
        findViewById(R.id.CurentPolicy).setVisibility(View.GONE);

        TextView textView = (TextView) findViewById(R.id.CurentPolicy);
        textView.setVisibility(View.INVISIBLE);

        BuyInsForNewCar = (RadioButton) findViewById(R.id.BuyInsForNewCar);
        RenewExistingPolicy = (RadioButton) findViewById(R.id.RenewExistingPolicy);
        BuyInsForNewCar.setOnClickListener(this);
        RenewExistingPolicy.setOnClickListener(this);


    }

    final Context context = this;


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BuyInsForNewCar:
                Intent intent1 = new Intent(context, CustomExpandableList.class);
                startActivity(intent1);

               // Button BuyQuote = (Button) findViewById(R.id.buyquote);
                System.out.println("Inside BuyQuote");
                //BuyQuote.setOnClickListener(this);

                RadioButton myRadioButton = (RadioButton) findViewById(R.id.yes);
                myRadioButton.setVisibility(View.INVISIBLE);
                RadioButton myRadioButton2 = (RadioButton) findViewById(R.id.no);
                myRadioButton2.setVisibility(View.INVISIBLE);
                findViewById(R.id.CurentPolicy).setVisibility(View.GONE);

                break;
            case R.id.yes:
                Intent intent2 = new Intent(context, policy_calculate.class);
                startActivity(intent2);
                BuyInsForNewCar.setChecked(false);
                break;
            case R.id.no:
                Intent intent3 = new Intent(context, detailed_quote.class);
                startActivity(intent3);
                break;
            case R.id.RenewExistingPolicy:
                // Intent intent = new Intent(context, check_policy.class);
                // startActivity(intent);
               /* RadioButton yes, no;

                yes = (RadioButton) findViewById(R.id.yes);
                no = (RadioButton) findViewById(R.id.no);
                yes.setOnClickListener(this);
                no.setOnClickListener(this);

                final Context context = this;*/
                renew();


               /* @Override
                public void onClick(View v){
                switch (v.getId()) {
                    case R.id.no:
                        Intent intent3 = new Intent(context, detailed_quote2.class);
                        startActivity(intent3);
                        break;
                    case R.id.yes:
                        // Intent intent = new Intent(context, check_policy.class);
                        // startActivity(intent);
                        Intent intent4 = new Intent(context, policy_calculate.class);
                        startActivity(intent4);
                        break;
                }
            }*/

                break;

                default:
                    break;
            }


        }


    public void renew(){
        RadioButton yes, no;

        RadioButton myRadioButton = (RadioButton) findViewById(R.id.yes);
        myRadioButton.setVisibility(View.VISIBLE);
        RadioButton myRadioButton2 = (RadioButton) findViewById(R.id.no);
        myRadioButton2.setVisibility(View.VISIBLE);
        findViewById(R.id.CurentPolicy).setVisibility(View.VISIBLE);

        yes = (RadioButton) findViewById(R.id.yes);
        no = (RadioButton) findViewById(R.id.no);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);



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



