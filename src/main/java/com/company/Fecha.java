package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fecha {

        public static String getFecha(){
            Calendar fechaActual = Calendar.getInstance();
            Date date = fechaActual.getTime();
            SimpleDateFormat ft = new SimpleDateFormat("dd-MM-YYYY");
            return ft.format(date);
        }

        public static String sumarDias(Calendar fecha, int dias){
            fecha.add(Calendar.DATE, dias);
            Date nuevaFecha = fecha.getTime();
            SimpleDateFormat ft = new SimpleDateFormat("dd-MM-YYYY");
            return ft.format(nuevaFecha);
        }

        public static String sumarMeses(Calendar fecha, int meses){
            fecha.add(Calendar.MONTH, meses);
            Date nuevaFecha = fecha.getTime();
            SimpleDateFormat ft = new SimpleDateFormat("dd-MM-YYYY");
            return ft.format(nuevaFecha);
        }
}
