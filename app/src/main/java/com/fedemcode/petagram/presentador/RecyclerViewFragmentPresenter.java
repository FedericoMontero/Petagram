package com.fedemcode.petagram.presentador;

import android.content.Context;

import com.fedemcode.petagram.db.ConstructorMascotas;
import com.fedemcode.petagram.pojo.Mascota;
import com.fedemcode.petagram.vistafragment.IRecyclerViewFragmentView;

import java.util.ArrayList;

public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter{

    private IRecyclerViewFragment iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragment iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotas();
    }

    @Override
    public void obtenerMascotas() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();

        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}