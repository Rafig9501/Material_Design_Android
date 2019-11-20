package com.example.material_design_app;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;


public class CityList extends Fragment {

    ListView  cityList;
    String [] cityNames = {"Baku", "Moscow", "Washington", "Dubai", "Berlin", "Budapesht", "Rome", "London", "Istanbul"};

    public CityList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_city_list, container, false);

        cityList = view.findViewById(R.id.city_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1,cityNames);

        cityList.setAdapter(adapter);

        return view;

    }
}
