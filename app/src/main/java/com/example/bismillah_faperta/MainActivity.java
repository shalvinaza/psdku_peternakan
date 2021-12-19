package com.example.bismillah_faperta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ProfilFragment()).commit();
        navigationView.setCheckedItem(R.id.nav_profil);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_profil:
                getSupportActionBar().setTitle("Profil Prodi");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ProfilFragment()).commit();
                break;
            case R.id.nav_fasilitas:
                getSupportActionBar().setTitle("Fasilitas");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new FasilitasFragment()).commit();
                break;
            case R.id.nav_lulusan:
                getSupportActionBar().setTitle("Profil Lulusan");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new LulusanFragment()).commit();
                break;
            case R.id.nav_sdm:
                getSupportActionBar().setTitle("Sumber Daya Manusia");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SdmFragment()).commit();
                break;
            case R.id.nav_kontak:
                getSupportActionBar().setTitle("Kontak");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new KontakFragment()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }
}
