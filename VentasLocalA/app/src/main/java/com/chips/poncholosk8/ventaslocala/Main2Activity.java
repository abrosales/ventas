package com.chips.poncholosk8.ventaslocala;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.Layout;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        super.setTitle("Ventas");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Intent i = new Intent(this,MainActivity.class );
            startActivity(i);
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        View cliente=(View) findViewById(R.id.layoutclientes);
        View producto=(View) findViewById(R.id.layoutproductos);
        View ventas=(View) findViewById(R.id.layoutventas);
        View abonos=(View) findViewById(R.id.layoutabonos);
        View consultas=(View) findViewById(R.id.layoutconsultas);
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(this,MainActivity.class );
            startActivity(i);
            finish();
        }else if(id == R.id.Regclientes){
            cliente.setVisibility(View.VISIBLE);
            producto.setVisibility(View.INVISIBLE);
            ventas.setVisibility(View.INVISIBLE);
            abonos.setVisibility(View.INVISIBLE);
            consultas.setVisibility(View.VISIBLE);
            super.setTitle("Clientes");

        }else if(id == R.id.Regproducto){
            producto.setVisibility(View.VISIBLE);
            cliente.setVisibility(View.INVISIBLE);
            ventas.setVisibility(View.INVISIBLE);
            abonos.setVisibility(View.INVISIBLE);
            consultas.setVisibility(View.VISIBLE);
            super.setTitle("Productos");
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        View ventas=(View) findViewById(R.id.layoutventas);
        View abonos=(View) findViewById(R.id.layoutabonos);
        View consultas=(View) findViewById(R.id.layoutconsultas);
        if (id == R.id.nav_Ventas) {
            ventas.setVisibility(View.VISIBLE);
            abonos.setVisibility(View.INVISIBLE);
            consultas.setVisibility(View.INVISIBLE);
            super.setTitle("Ventas");
        } else if (id == R.id.nav_Abonos) {
            ventas.setVisibility(View.INVISIBLE);
            abonos.setVisibility(View.VISIBLE);
            consultas.setVisibility(View.INVISIBLE);
            super.setTitle("Abonos");
        } else if (id == R.id.nav_Consultas) {
            ventas.setVisibility(View.INVISIBLE);
            abonos.setVisibility(View.INVISIBLE);
            consultas.setVisibility(View.VISIBLE);
            super.setTitle("Consultas");

        } else if (id == R.id.nav_Salir) {
            Intent i = new Intent(this,MainActivity.class );
            startActivity(i);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
