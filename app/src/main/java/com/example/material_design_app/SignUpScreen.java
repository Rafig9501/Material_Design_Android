package com.example.material_design_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class SignUpScreen extends Fragment {


    Button countryMenu;
    Button cityNames;


    public SignUpScreen() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sign_up_screen, container, false);

        countryMenu = view.findViewById(R.id.countries);

        cityNames = view.findViewById(R.id.cities);

        cityNames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getChildFragmentManager().beginTransaction().add(R.id.city_container,new CityList()).addToBackStack(null).commit();

            }
        });

        return view;

    }

}
