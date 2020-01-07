package com.example.material_design_app.mainScreens.ui.signup;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.ui.log_in_sign_in.LogInSignInFragment;
import com.example.material_design_app.mainScreens.ui.main.NavigationClass;

public class SignUpScreenFragment extends Fragment {


    Spinner countryMenu;
    Spinner cityNames;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter1;
    TextView logIn;
    Button button;


    public SignUpScreenFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sign_up_screen, container, false);

        countryMenu = view.findViewById(R.id.countries);

        cityNames = view.findViewById(R.id.cities);

        adapter2 = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                R.array.city_names,android.R.layout.simple_spinner_dropdown_item);

        adapter1 = ArrayAdapter.createFromResource(getActivity().getBaseContext(),
                        R.array.country_names,android.R.layout.simple_spinner_dropdown_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //setting adapter to spinner
        countryMenu.setAdapter(adapter1);

        cityNames.setAdapter(adapter2);

        logIn = view.findViewById(R.id.login_text);

        logIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new LogInSignInFragment()).addToBackStack(null).commit();

            }
        });

        button = view.findViewById(R.id.button_sign_up);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getContext(), NavigationClass.class));

            }
        });


        return view;

    }

}
