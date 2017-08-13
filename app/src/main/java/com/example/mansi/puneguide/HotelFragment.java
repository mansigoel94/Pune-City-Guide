package com.example.mansi.puneguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * HotelFragment displays list of the top Hotels to stay in Pune with their image and location and a little description about it
 */
public class HotelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listview, container, false);

        //creating hotelObjects arraylist and populating it
        ArrayList<Category> hotelObjects = new ArrayList<>();
        hotelObjects.add(new Category(getString(R.string.hotel1name), getString(R.string.hotel1place), getString(R.string.hotel1description), R.drawable.oakwood));
        hotelObjects.add(new Category(getString(R.string.hotel2name), getString(R.string.hotel2place), getString(R.string.hotel2description), R.drawable.novotel));
        hotelObjects.add(new Category(getString(R.string.hotel3name), getString(R.string.hotel3place), getString(R.string.hotel3description), R.drawable.marriott));
        hotelObjects.add(new Category(getString(R.string.hotel4name), getString(R.string.hotel2place), getString(R.string.hotel4description), R.drawable.ibis));
        hotelObjects.add(new Category(getString(R.string.hotel5name), getString(R.string.hotel5place), getString(R.string.hotel5description), R.drawable.raddisson));
        hotelObjects.add(new Category(getString(R.string.hotel6name), getString(R.string.hotel2place), getString(R.string.hotel6description), R.drawable.hyatt));
        hotelObjects.add(new Category(getString(R.string.hotel7name), getString(R.string.hotel6place), getString(R.string.hotel7description), R.drawable.royalorchidcentral));

        //Attaching the arraylist to listview in layout using custom ArrayAdapter(CategoryAdapter)
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        CategoryAdapter adapter = new CategoryAdapter(getActivity(), hotelObjects);
        listView.setAdapter(adapter);

        return rootView;
    }

}
