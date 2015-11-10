package com.chips.poncholosk8.ventaslocala;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickentrar(View view){
        TextView usuario= (TextView)findViewById(R.id.txt_usuario);
        TextView password= (TextView)findViewById(R.id.txt_contraseña);
        String us=usuario.getText().toString();
        String cr=password.getText().toString();

        if (us.equals("ragusita") && cr.equals("ragusitaitza")) {
            Intent i = new Intent(this, Main2Activity.class);
            startActivity(i);
            finish();
            Toast.makeText(this, "Bienvenido "+us, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Usuario o Contraseña no validos", Toast.LENGTH_SHORT).show();
        }
    }
}
