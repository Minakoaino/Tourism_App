package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FoodStreetFragment extends Fragment {


    public FoodStreetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food_street, container, false);

        // No:- 1 Haleem activity

        TextView t1 = (TextView)view.findViewById(R.id.pastitsio);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Food_pastitsio.class);
                startActivity(i1);
            }
        });

        // No:-2 Seekh kabab Activity

        TextView t2 = (TextView)view.findViewById(R.id.olive_oil);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), food_olive_oil.class);
                startActivity(i2);
            }
        });

        // No.3 Biryani activity

        TextView t3 = (TextView)view.findViewById(R.id.dakos);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), foods_dakos.class);
                startActivity(i3);
            }
        });

        // No.4 halwa puri activty

        TextView t4 = (TextView)view.findViewById(R.id.sarikopitakia);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), food_sarikopitakia.class);
                startActivity(i4);
            }
        });

        // No. 5 Methi lassi activity

        TextView t5 = (TextView)view.findViewById(R.id.loukoumades);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), food_loukoumades.class);
                startActivity(i5);
            }
        });


        // No.6 Channay

        TextView t6 = (TextView)view.findViewById(R.id.raki);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(getActivity(), raki.class);
                startActivity(i6);
            }
        });

        // No.7 Karahi

        TextView t7 = (TextView)view.findViewById(R.id.mousakas);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(getActivity(), food_moussakas.class);
                startActivity(i7);
            }
        });


        return view;
    }

}
