package com.example.jayasimha.quotation;

import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class CustomExpandableList extends ExpandableListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandable_main);
        ExampleAdapter adapter = new ExampleAdapter(this, getLayoutInflater());
        setListAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
class ExampleAdapter implements ExpandableListAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public ExampleAdapter(Context context, LayoutInflater layoutInflater) {
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        View v = null;
        if(groupPosition == 0) {
           v = View.inflate(context, R.layout.expandable_child1, null);
        }
        if(groupPosition == 1) {
            v = View.inflate(context, R.layout.expandable_child2, null);
        }
        if(groupPosition == 2) {
            v = View.inflate(context, R.layout.expandable_child3, null);
        }
        if(groupPosition == 3) {
            v = View.inflate(context, R.layout.expandable_child4, null);

        }
       /* if(groupPosition == 4) {
            v = View.inflate(context, R.layout.expandable_child_layout, null);

        }
        if(groupPosition == 5) {
            v = View.inflate(context, R.layout.expandable_child_layout, null);

        }*/
        v.invalidate();
        return v;
    }


    public void calculateDate(){

    }


    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public long getCombinedChildId(long groupId, long childId) {
        return 0;
    }

    @Override
    public long getCombinedGroupId(long groupId) {
        return 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public int getGroupCount() {
        return 4;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {

        View v = convertView.inflate(context, R.layout.expandable_group_layout, null);
        //v.setBackgroundColor(Color.WHITE);
       // v.setBackground(Drawable.createFromPath());
        TextView txtView = (TextView) v.findViewById(R.id.txt1);
        if(groupPosition == 0) {
            txtView.setText("RegistrationDetails");
           // txtView.setTextSize(25f);


        }
        if(groupPosition == 1) {
            txtView.setText("PersonalDetails");
            //txtView.setTextSize(15f);
        }
        if(groupPosition == 2) {
            txtView.setText("VehicleDetails");
         //   txtView.setTextSize(15f);
        }
       /* if(groupPosition == 3) {
            txtView.setText("GetProtectionForAccessories");
           // txtView.setTextSize(15f);
        }
        if(groupPosition == 4) {
            txtView.setText("GetAdditionalDiscount");
            // txtView.setTextSize(15f);
        }*/
        if(groupPosition == 3) {
            txtView.setText("InsuredContactDetails");
            // txtView.setTextSize(15f);
        }
        v.invalidate();
        return v;

    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void onGroupCollapsed(int groupPosition) {

    }

    @Override
    public void onGroupExpanded(int groupPosition) {

    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }



}