package com.example.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HistorialPlacesFragment extends Fragment  {


    Activity context;

    public HistorialPlacesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_historial_places, container, false);

        // No:- 1

        TextView t1 = (TextView)view.findViewById(R.id.phaistos);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), phaistos.class);
                startActivity(i1);
            }
        });

        // No:-2

        TextView t2 = (TextView)view.findViewById(R.id.knossos);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), knossos.class);
                startActivity(i2);
            }
        });

        // No:-3

        TextView t3 = (TextView)view.findViewById(R.id.spinaloga);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), spinalonga.class);
                startActivity(i3);
            }
        });

        // No:-4

        TextView t4 = (TextView)view.findViewById(R.id.museum);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), heraklion_archaeological_museum.class);
                startActivity(i4);
            }
        });

        // No:-5

        TextView t5 = (TextView)view.findViewById(R.id.arkadi);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), arkadi.class);
                startActivity(i5);
            }
        });


        // No:-6


        TextView t6 = (TextView)view.findViewById(R.id.cave);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), psychro_cave.class);
                startActivity(i6);
            }
        });







        return view;
    }




}
