package com.company;

public class main {
    public static void main(String[] args) {
        // Ingresar actividades
        // Actividad Realizada
        // Fecha Actividades
        Agenda agenda = new Agenda();

        agenda.agregarActividad(new Actividad("Actividad 1", "Hacer el proyecto", "29/01/2021"));
        agenda.agregarActividad(new Actividad("Actividad 2", "Hacer el proyecto", "29/01/2021"));
        agenda.agregarActividad(new Actividad("Actividad 3", "Hacer el proyecto", "29/01/2021"));
        agenda.agregarActividad(new Actividad("Actividad 4", "Hacer el proyecto", "29/01/2021"));
        agenda.agregarActividad(new Actividad("Actividad 5", "Hacer el proyecto", "29/01/2021"));
        agenda.agregarActividad(new Actividad("Actividad 6", "Hacer el proyecto", "29/01/2021"));

        agenda.marcarActividadRealizada(0);
        agenda.marcarActividadRealizada(1);
        agenda.marcarActividadRealizada(2);


        agenda.verActividadesRealizadas();
        agenda.verActividadesPorRealizar();




    }
}
