package com.fedemcode.petagram;

import android.content.Intent;
import android.os.Bundle;

import com.fedemcode.petagram.adapter.MascotasAdaptador;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<DataSet> mascotas;
    private RecyclerView listadoMascotas;
    Toolbar toolbar;
    private ImageButton estrella;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        listadoMascotas = (RecyclerView) findViewById(R.id.rvMascotas1);
        estrella = (ImageButton) findViewById(R.id.estrella);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listadoMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListadoMascotas.class);
                startActivity(intent);

            }
        });




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Creditos a Fede:)", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.action_contacto:
                break;
            case R.id.action_ajustes:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public MascotasAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotasAdaptador(mascotas,this);
        listadoMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<DataSet>();

        mascotas.add(new DataSet("Perro con hueso","3",R.drawable.perros_uno));
        mascotas.add(new DataSet("San Bernardo","4",R.drawable.perros_dos));
    }

}


//El git se hace desde la consola y lo guarda en Github, petagram. si push no funciona leer el error y hacer git push master o algo asi