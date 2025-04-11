package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Linea {
    private String codigo;
    private String nombre;
    private Double precio;
    private Integer cantidad;

    public Linea(String codigo, String nombre, Double precio, Integer cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

}
