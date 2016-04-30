package com.example.jayasimha.quotation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jayasimha on 3/16/2016.
 */
public class detailed_quote extends AppCompatActivity implements View.OnClickListener {
    TextView registrationd,personald,vehicled,tick2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_quote1);
        registrationd = (TextView) this.findViewById(R.id.registrationdetails);
        personald = (TextView) this.findViewById(R.id.personaldetails);
        vehicled = (TextView) this.findViewById(R.id.vehicledetails);
        /*tick2 = (TextView) this.findViewById(R.id.tick2);
        tick2.setEnabled(false);*/

        registrationd.setOnClickListener(this);
        personald.setOnClickListener(this);
        vehicled.setOnClickListener(this);




    }



    final Context context = this;



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.registrationdetails:
                Intent intent1 = new Intent(context,Registration_details.class);
                startActivity(intent1);
                break;
            case R.id.personaldetails:
                Intent intent = new Intent(context, Personal_details.class);
                startActivity(intent);
                break;
            case R.id.vehicledetails:
                Intent intent2 = new Intent(context, Vehicle_details.class);
                startActivity(intent2);
                break;

            default:
                break;
        }






    }




}
