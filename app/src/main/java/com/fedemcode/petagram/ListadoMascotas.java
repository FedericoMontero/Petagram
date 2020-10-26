package com.fedemcode.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.fedemcode.petagram.adapter.MascotasAdaptador;

import java.util.ArrayList;

public class ListadoMascotas extends AppCompatActivity {

    private ArrayList<DataSet> mascotas;
    private RecyclerView listadoMascotas;
    Toolbar toolbar;
    private TextView titleToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_mascotas);

        listadoMascotas = (RecyclerView) findViewById(R.id.rvMascotas1);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listadoMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public MascotasAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotasAdaptador(mascotas,this);
        listadoMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<DataSet>();

        mascotas.add(new DataSet("Perro y hueso","3",R.drawable.perros_uno));
        mascotas.add(new DataSet("San Bernardo","4",R.drawable.perros_dos));
        mascotas.add(new DataSet("Rocky","4",R.drawable.perros_tres));
        mascotas.add(new DataSet("Husky Siberiano","4",R.drawable.perros_cuatro));
        mascotas.add(new DataSet("Cschorro","4",R.drawable.perros_cinco));
    }
}