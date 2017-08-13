package com.example.mansi.puneguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mansi on 26-07-2017.
 */

public class EmergencyAdapter extends ArrayAdapter<Emergency> {

    public EmergencyAdapter(Context context, ArrayList<Emergency> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitem = convertView;
        if (listitem == null) {
            listitem = LayoutInflater.from(getContext()).inflate(R.layout.list_item_emergency, parent, false);
        }
        //getting the Emergency object at the position index
        Emergency currentEmergency = getItem(position);

        TextView name = listitem.findViewById(R.id.name);
        TextView specific_detail = listitem.findViewById(R.id.specific_detail);

        if (currentEmergency.getName() != null) {
            name.setText(currentEmergency.getName());
        }
        if (currentEmergency.getNumber() != null) {
            specific_detail.setText(currentEmergency.getNumber());
        }
        return listitem;
    }
}
