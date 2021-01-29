package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Actividad {

    private String estado;
    private String nombre;
    private String descripcion;
    private String fechaInicial;
    private String fechaFinal;

    public Actividad(String nombre, String descripcion, String fechaFinal) {
        this.estado = "REALIZAR HASTA EL";
        this.nombre = nombre;
        this.descripcion = descripcion;
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-YYYY");
        this.fechaInicial = ft.format(date);
        this.fechaFinal = fechaFinal;
    }

    public void estadoRealizado() {
        this.estado = "REALIZADO";
    }

    @Override
    public String toString() {
        return nombre + " " + estado + " " + fechaFinal;
    }
}                  // Nombre    // Estado  // Descripcion   // Plazo
