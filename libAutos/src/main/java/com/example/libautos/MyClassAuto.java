package com.example.libautos;

import java.time.LocalDate;

public class MyClassAuto {
    private String modelo;
    private String marca;
    private String year;

    public MyClassAuto (String modelo,String marca, String year){
        this.modelo = modelo;
        this.marca = marca;
        this.year = year;
    };

    public MyClassAuto (){
        this.modelo = "jetta";
        this.marca = "wv";
        this.year = "2002";
    };

    public  String toString(){
        String cadena = "\nmodelo: " + this.modelo + "\nmarca: " + this.marca + "\nyear: " + this.year ;
        return  cadena;
    };

    public Boolean isPreowned(){
        LocalDate date = LocalDate.now();
        Integer year = date.getYear();
        if (this.year<year) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    };
};

