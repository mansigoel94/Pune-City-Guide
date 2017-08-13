package com.example.mansi.puneguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * ToDoFragment displays list of the top places to visit in Pune with their image and location and a little description about it
 */
public class ToDoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview, container, false);

        //creating to do arraylist and populating it
        ArrayList<Category> todo = new ArrayList<>();
        todo.add(new Category(getString(R.string.visit1name), getString(R.string.visit1place), getString(R.string.visit1description), R.drawable.dagdusheth));
        todo.add(new Category(getString(R.string.visit2name), getString(R.string.visit2place), getString(R.string.visit2description), R.drawable.darshanmuseum));
        todo.add(new Category(getString(R.string.visit3name), getString(R.string.visit3place), getString(R.string.visit3description), R.drawable.iscon));
        todo.add(new Category(getString(R.string.visit4name), getString(R.string.visit4place), getString(R.string.visit4description), R.drawable.sinhgad));
        todo.add(new Category(getString(R.string.visit5name), getString(R.string.visit5place), getString(R.string.visit5description), R.drawable.sarasbaug));
        todo.add(new Category(getString(R.string.visit6name), getString(R.string.visit6place), getString(R.string.visit6description), R.drawable.phoenix));
        todo.add(new Category(getString(R.string.visit7name), getString(R.string.visit7place), getString(R.string.visit7description), R.drawable.malshejghat));

        //Attaching the arraylist to listview in layout using custom ArrayAdapter(CategoryAdapter)
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        CategoryAdapter adapter = new CategoryAdapter(getActivity(), todo);
        listView.setAdapter(adapter);

        return rootView;

    }
}
