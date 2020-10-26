package com.fedemcode.petagram.db;

import android.content.ContentValues;
import android.content.Context;

import com.fedemcode.petagram.R;
import com.fedemcode.petagram.pojo.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {

    private Context context;
    private static final int Hueso = 1;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){

        BaseDatos db = new BaseDatos(context);
        insertarMisMascotas(db);
        return db.obtenerTodasLasMascotas();
    }

    public void insertarMisMascotas (BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_NOMBRE, "Erizo");
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_FOTO, R.drawable.erizo);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_NOMBRE, "Perro1");
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_FOTO, R.drawable.perros1);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_NOMBRE, "Perro 2");
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_FOTO, R.drawable.perros2);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_NOMBRE, "Perro 3");
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_FOTO, R.drawable.perros_tres);

        db.insertarMascota(contentValues);

        contentValues =  new ContentValues();
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_NOMBRE, "Perro 4");
        contentValues.put(ConstanteDB.TABLA_MASCOTAS_FOTO, R.drawable.perros_cuatro);

        db.insertarMascota(contentValues);
    }

    public void darHuesoMascota(Mascota mascota) {

        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstanteDB.TABLA_HUESOS_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstanteDB.TABLA_HUESOS_MASCOTA_QTY_HUESOS, Hueso);
        db.insertarHuesosMascota(contentValues);
    }

    public int obtenerHuesosMascota (Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerHuesosMascota(mascota);
    }

}