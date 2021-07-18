package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ShoppingPlacesFragment extends Fragment {


    public ShoppingPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.beaches, container, false);

        // No.1
        // make new activty ( elafonisi )

        TextView t1 = (TextView)view.findViewById(R.id.elafonisi_beach);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), elafonisi.class);
                startActivity(i1);
            }
        });

        // No:2
        // make new activity ( falassarna

        TextView t2 = (TextView)view.findViewById(R.id.falassarna_beach);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), falassarna.class);
                startActivity(i2);
            }
        });


        // No.3
        // make new activity ( activity_shoppingPlaces_mall_lahore )

        TextView t3 = (TextView)view.findViewById(R.id.balos_lagoon);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), balos.class);
                startActivity(i3);
            }
        });

        // No.4
        // make activity ( activity_shoppingPlaces_amanaah_mall )

        TextView t4 = (TextView)view.findViewById(R.id.lasinthi_vai_beach);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), lasinthi.class);
                startActivity(i4);
            }
        });

        // No.5
        // make activity ( activity_shoppingPlaces_packages )

        TextView t5 = (TextView)view.findViewById(R.id.preveli_beach);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), preveli.class);
                startActivity(i5);
            }
        });




        return view;
    }


}
