package com.example.jayasimha.quotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;


public class Personal_details extends AppCompatActivity implements OnClickListener {

    Button buttonOne,buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_details1);





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
