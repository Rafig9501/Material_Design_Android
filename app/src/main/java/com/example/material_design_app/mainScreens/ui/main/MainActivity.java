package com.example.material_design_app.mainScreens.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.ui.log_in_sign_in.LogInSignInFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, new LogInSignInFragment()).commit();

    }
}
