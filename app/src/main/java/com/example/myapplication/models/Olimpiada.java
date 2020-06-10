package com.example.myapplication.models;

import java.util.ArrayList;

public class Olimpiada {
    public String nombre;
    public String descripcion;

    public Olimpiada(String _nombre, String _descripcion) {
        this.nombre = _nombre;
        this.descripcion = _descripcion;
    }

    public static ArrayList getCollection() {
        ArrayList<Olimpiada> collection = new ArrayList<>();
        collection.add(new Olimpiada("Copa America", "Exigete al maximo"));
        collection.add(new Olimpiada("Europa League", "Da todo de ti"));
        collection.add(new Olimpiada("Champions League", "Retos extremo"));
        return collection;
    }
}
