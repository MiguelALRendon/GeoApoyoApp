package com.example.geoapoyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import com.example.geoapoyo.adapter.VPAdapter;

public class home_activity extends AppCompatActivity {

    //Color primario (se va usar varias veces)
    int tabIconColor;
    int tabIconColorDes;
    //Nose, lo pide para settear el color
    PorterDuff.Mode pdMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.primary);
        tabIconColorDes = ContextCompat.getColor(getApplicationContext(), R.color.deselected);

        //Obtiene los componentes
        TabLayout tabLayout = findViewById(R.id.idTabLayout);
        ViewPager vpVisualizer = findViewById(R.id.vpVisualizer);
        pdMode = PorterDuff.Mode.SRC_IN;

        //Setteamos el vp en tablayout
        tabLayout.setupWithViewPager(vpVisualizer);

        //creamos el adapter
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager());
        vpAdapter.addFragment(new UsuariosFragment());
        vpAdapter.addFragment(new MapFragment());
        vpAdapter.addFragment(new SettingsFragment());
        vpVisualizer.setAdapter(vpAdapter);

        transformTabs(tabLayout);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //Cualquier tab seleccionado se vuelve azul
                tab.getIcon().setColorFilter(tabIconColor, pdMode);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //Si el tab se deselecciona, se pone grisaseo
                tab.getIcon().setColorFilter(tabIconColorDes, pdMode);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void transformTabs(TabLayout tabLayout) {
        //Agrega los iconos a los tabs
        tabLayout.getTabAt(0).setIcon(R.drawable.baseline_groups_2_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.baseline_map_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.baseline_settings_24);
        //Settea el color del primer tab en azul (Por algun motivo no pude cambiarlo desde XML y no encontre como hacerlo fuera del codigo
        //Las otras tabs las settea en el color grisaseo
        tabLayout.getTabAt(0).getIcon().setColorFilter(tabIconColor, pdMode);
        tabLayout.getTabAt(1).getIcon().setColorFilter(tabIconColorDes, pdMode);
        tabLayout.getTabAt(2).getIcon().setColorFilter(tabIconColorDes, pdMode);
    }

}