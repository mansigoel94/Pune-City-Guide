package com.example.mansi.puneguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        //creating emergency_details arraylist and populating it
        ArrayList<Emergency> emergency_details = new ArrayList<>();
        emergency_details.add(new Emergency(getString(R.string.emergency1name), getString(R.string.emergency1number)));
        emergency_details.add(new Emergency(getString(R.string.emergency2name), getString(R.string.emergency2number)));
        emergency_details.add(new Emergency(getString(R.string.emergency3name), getString(R.string.emergency3number)));
        emergency_details.add(new Emergency(getString(R.string.emergency4name), getString(R.string.emergency4number)));
        emergency_details.add(new Emergency(getString(R.string.emergency5name), getString(R.string.emergency5number)));
        emergency_details.add(new Emergency(getString(R.string.emergency6name), getString(R.string.emergency6number)));

        //Attaching the arraylist to listview in layout using custom ArrayAdapter(EmergencyAdapter)
        ListView listView = (ListView) findViewById(R.id.listview);
        EmergencyAdapter emergency_adapter = new EmergencyAdapter(getBaseContext(), emergency_details);
        listView.setAdapter(emergency_adapter);
    }

}
