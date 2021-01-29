package com.company;

import java.util.LinkedList;
import java.util.List;

public class Agenda {

    private List<Actividad> actividadesPorRealizar = new LinkedList<>();
    private List<Actividad> actividadesRealizadas = new LinkedList<>();

    public void agregarActividad(Actividad actividad) {
        actividadesPorRealizar.add(actividad);
    }

    public void marcarActividadRealizada(int i) {
        actividadesRealizadas.add(actividadesPorRealizar.get(i));
        actividadesPorRealizar.get(i).estadoRealizado();
        actividadesPorRealizar.remove(i);
    }

    public void verActividadesPorRealizar() {
        System.out.println("ACTIVIDADES POR REALIZAR: ");
        for (int i = 0; i < actividadesPorRealizar.size(); i++) {
            System.out.println("   "+ (i + 1) + ". " + actividadesPorRealizar.get(i));
        }
    }

    public void verActividadesRealizadas() {
        System.out.println("SE REALIZARON LAS ACTIVIDADES: ");
        for (int i = 0; i < actividadesRealizadas.size(); i++) {
            System.out.println("   "+ ( i + 1) + ". " + actividadesRealizadas.get(i));
        }
    }
}


