package com.example.navigation;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.navigation.databinding.ActivityDrawerBinding;

public class DrawerActivity extends AppCompatActivity {

    ActivityDrawerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView((binding = ActivityDrawerBinding.inflate(getLayoutInflater())).getRoot());

        setSupportActionBar(binding.toolbar);

        AppBarConfiguration appbarConfiguration = new AppBarConfiguration.Builder(
                // Top-level destinations:
                R.id.drawer1Fragment, R.id.drawer2Fragment
        )
                .setOpenableLayout(binding.drawerLayout)
                .build();

        NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        NavigationUI.setupWithNavController(binding.navView, navController);
        NavigationUI.setupWithNavController(binding.toolbar, navController, appbarConfiguration);
    }
}