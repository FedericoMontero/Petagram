package com.fedemcode.petagram.vista.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fedemcode.petagram.R;
import com.fedemcode.petagram.adapter.MascotasAdaptador;
import com.fedemcode.petagram.pojo.Mascota;
import com.fedemcode.petagram.presentador.IRecyclerViewFragmentPresenter;
import com.fedemcode.petagram.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment implements IRecyclerViewFragment{

    ArrayList <Mascota> mascotas;
    public RecyclerView rvMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this vista.vistafragment
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        rvMascotas = ( RecyclerView) v.findViewById(R.id.rvMascotasFragment);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(linearLayoutManager);
    }

    @Override
    public MascotasAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas,getActivity());

        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotasAdaptador adaptador) {
        rvMascotas.setAdapter(adaptador);
    }
}
