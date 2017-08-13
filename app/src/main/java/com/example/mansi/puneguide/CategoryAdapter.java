package com.example.mansi.puneguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Category> {
    public CategoryAdapter(Context context, ArrayList<Category> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitem = convertView;
        if (listitem == null) {
            listitem = LayoutInflater.from(getContext()).inflate(R.layout.list_item_category, parent, false);
        }
        //getting the Category object at the position index
        Category currentCategory = (Category) getItem(position);

        TextView name = (TextView) listitem.findViewById(R.id.name);
        TextView specific_detail = (TextView) listitem.findViewById(R.id.specific_detail);
        TextView description = (TextView) listitem.findViewById(R.id.description);
        ImageView image = (ImageView) listitem.findViewById(R.id.image_item);

        //if data(imageResId, Name, Location and description) are present then populate the list item with those values

        if (currentCategory.getImageResId() != -1) {
            image.setImageResource(currentCategory.getImageResId());
        }

        if (currentCategory.getName() != null) {
            name.setText(currentCategory.getName());
        }

        if (currentCategory.getLocation() != null) {
            specific_detail.setText(currentCategory.getLocation());
        }
        if (currentCategory.getDescription() != null) {
            description.setText(currentCategory.getDescription());
        }
        return listitem;
    }
}
