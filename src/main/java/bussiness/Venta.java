package bussiness;

import domain.Linea;

import java.util.ArrayList;
import java.util.List;


public class Venta {

    private List<Linea> listLinea = new ArrayList<>();

    public void addLinea(Linea linea) {
        listLinea.add(linea);
    }

    public void removeLinea(Linea linea) {
        listLinea.remove(linea);
    }

    public Double getTotal() {
        Double total = 0.0;
        for (Linea linea : listLinea) {
            total += linea.getPrecio() * linea.getCantidad();
        }
        return total;
    }

    public List<Linea> getListLinea() {
        return listLinea;
    }


}
