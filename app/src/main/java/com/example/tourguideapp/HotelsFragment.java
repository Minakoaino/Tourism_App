package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);

        // No:-1
        // Luxus Grand hotel action perform and open new activity ( grecotel )

        TextView t1 = (TextView)view.findViewById(R.id.grecotel);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), grecotel_creta.class);
                startActivity(i1);
            }
        });


        // No:2
        // Heritage luxury suites action perform and open new activity ( minoa_hotel )

        TextView t2 = (TextView)view.findViewById(R.id.minoa_hotel);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getActivity(), minoa.class);
                startActivity(i2);
            }
        });



        // No:- 3
        // Pearl COntinental action perform and open new activity ( radisson_blue )

        TextView t3 = (TextView)view.findViewById(R.id.radisson_blue);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getActivity(), radisson_blue.class);
                startActivity(i3);
            }
        });

        // No:- 4
        // Nishat hotel action perform and open new activity ( royal_blue )

        TextView t4 = (TextView)view.findViewById(R.id.royal_blue);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(getActivity(), royal_blue.class);
                startActivity(i4);
            }
        });

        // No:5
        // Avari lahore action perform and open new activity ( i_resort_beach )

        TextView t5 = (TextView)view.findViewById(R.id.i_resort_beach);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(getActivity(), i_resort.class);
                startActivity(i5);
            }
        });





        return view;
    }


}
