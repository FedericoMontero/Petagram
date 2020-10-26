package com.fedemcode.petagram.db;

public class ConstanteDB {

    public static final String DATABASE_NAME = "animales";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLA_MASCOTAS           = "mascota";
    public static final String TABLA_MASCOTAS_ID        = "id";
    public static final String TABLA_MASCOTAS_NOMBRE    = "nombre";
    public static final String TABLA_MASCOTAS_FOTO      = "foto";

    public static final String TABLA_HUESOS_MASCOTA             = "huesos_mascota" ;
    public static final String TABLA_HUESOS_MASCOTA_ID          = "id";
    public static final String TABLA_HUESOS_MASCOTA_ID_MASCOTA  = "id_mascota";
    public static final String TABLA_HUESOS_MASCOTA_QTY_HUESOS  = "qty_huesos";
}
}
