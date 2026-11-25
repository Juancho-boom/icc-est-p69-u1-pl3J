package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        incidentes.sort(null);
        return incidentes;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        int low = 0;
        int hi = incidentes.size() - 1;
        while (low <= hi) {
            int medio = (low + hi) / 2;
            int com = incidentes.get(medio).compareTo(objetivo);
            if(com == 0){
                return medio;
            } else if(com < 0){
                low = medio + 1;
            } else {
                hi = medio - 1;
            }
        }
        return -1;
    }
}
