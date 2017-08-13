package com.example.mansi.puneguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 *  AboutFragment displays little details of Pune and its map if clicked on the image
 */
public class AboutFragment extends Fragment {

    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView= inflater.inflate(R.layout.about_layout, container, false);

        //If image is clicked an implicit intent is send to open the map with search(Pune Maharashtra)
        // on the device using any map application
        ImageView maps = (ImageView) rootView.findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Uri is created and passed to showMap
                Uri location = Uri.parse("geo:0,0?q=Pune+Maharashtra");
                showMap(location);
            }
        });

        return rootView;
    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW); //Viewing a map uses Intent.ACTION_VIEW
        intent.setData(geoLocation);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
