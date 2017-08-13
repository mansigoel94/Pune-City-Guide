package com.example.mansi.puneguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * RestaurantFragment displays list of the top Restaurants to dine in Pune with their image and location and a list of their cuisines
 */
public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.listview,container,false);

        //creating restaurants arraylist and populating it
        ArrayList<Category>  restaurants=new ArrayList<>();
        restaurants.add(new Category(getString(R.string.restaurant1name),getString(R.string.restaurant1place),getString(R.string.restaurant1cuisine),R.drawable.chingari));
        restaurants.add(new Category(getString(R.string.restaurant2name),getString(R.string.restaurant2place),getString(R.string.restaurant2cuisine),R.drawable.spicekitchen));
        restaurants.add(new Category(getString(R.string.restaurant3name),getString(R.string.restaurant2place),getString(R.string.restaurant3cuisine),R.drawable.paasha));
        restaurants.add(new Category(getString(R.string.restaurant4name),getString(R.string.restaurant4place),getString(R.string.restaurant4cuisine),R.drawable.malakaspice));
        restaurants.add(new Category(getString(R.string.restaurant5name),getString(R.string.restaurant5place),getString(R.string.restaurant5cuisine),R.drawable.barbequenation));
        restaurants.add(new Category(getString(R.string.restaurant6name),getString(R.string.restaurant6place),getString(R.string.restaurant6cuisine),R.drawable.baantao));

        //Attaching the arraylist to listview in layout using custom ArrayAdapter(CategoryAdapter)
        ListView listView=(ListView)rootView.findViewById(R.id.listview);
        CategoryAdapter adapter=new CategoryAdapter(getActivity(), restaurants);
        listView.setAdapter(adapter);

        return rootView;
    }

}
