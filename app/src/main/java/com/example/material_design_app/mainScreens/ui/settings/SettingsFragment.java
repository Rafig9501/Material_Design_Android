package com.example.material_design_app.mainScreens.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import com.example.material_design_app.R;

    
public class SettingsFragment extends Fragment {

    SwitchCompat mSwitch1;
    SwitchCompat mSwitch2;
    SwitchCompat mSwitch3;

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;

    public SettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        mSwitch1 = view.findViewById(R.id.mSwitch1);
        mSwitch2 = view.findViewById(R.id.mSwitch2);
        mSwitch3 = view.findViewById(R.id.mSwitch3);

        radioButton1 = view.findViewById(R.id.radio_button_1);
        radioButton2 = view.findViewById(R.id.radio_button_2);
        radioButton3 = view.findViewById(R.id.radio_button_3);

        checkBox1 = view.findViewById(R.id.checkBox1);
        checkBox2 = view.findViewById(R.id.checkBox2);
        checkBox3 = view.findViewById(R.id.checkBox3);

        mSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mSwitch1.setText("Fox Jumps Over");
                    mSwitch1.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    mSwitch1.setText("The quick brown");
                    mSwitch1.setTextColor(getResources().getColor(R.color.color5));
                }
            }
        });

        mSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mSwitch2.setText("Fox Jumps Over");
                    mSwitch2.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    mSwitch2.setText("The quick brown");
                    mSwitch2.setTextColor(getResources().getColor(R.color.color5));
                }
            }
        });

        mSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mSwitch3.setText("Fox Jumps Over");
                    mSwitch3.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    mSwitch3.setText("The quick brown");
                    mSwitch3.setTextColor(getResources().getColor(R.color.color5));
                }
            }
        });

        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    radioButton1.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    radioButton1.setTextColor(getResources().getColor(R.color.color5));
                }
            }
        });

        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    radioButton2.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    radioButton2.setTextColor(getResources().getColor(R.color.color5));
                }
            }
        });

        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    radioButton3.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    radioButton3.setTextColor(getResources().getColor(R.color.color5));

                }
            }
        });

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    checkBox1.setTextColor(getResources().getColor(R.color.colorAccent));
                } else checkBox1.setTextColor(getResources().getColor(R.color.color5));
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    checkBox2.setTextColor(getResources().getColor(R.color.colorAccent));
                } else checkBox2.setTextColor(getResources().getColor(R.color.color5));
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    checkBox3.setTextColor(getResources().getColor(R.color.colorAccent));
                } else checkBox3.setTextColor(getResources().getColor(R.color.color5));
            }
        });

        return view;

    }
}
