package com.example.material_design_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;


public class FirstScreen extends Fragment {

    Button signInButton;

    public FirstScreen() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_screen, container, false);

        signInButton = view.findViewById(R.id.sign_up_button);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.main_layout, new SignUpScreen()).addToBackStack(null).commit();

            }
        });

        return view;

    }

}
