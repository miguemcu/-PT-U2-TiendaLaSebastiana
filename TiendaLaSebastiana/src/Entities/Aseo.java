package Entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Aseo extends Producto {
    private LocalDate fechaDeVencimiento;
    private ArrayList<String> etiquetas;

    public Aseo() {
    }
    
    public Aseo(String nombre, long id, double precio, double precioMayorista, LocalDate fechaDeVencimiento, ArrayList<String> etiquetas) {
        super(nombre,id,precio, precioMayorista, EnumTipoProd.ASEO);
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.etiquetas = etiquetas;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public String imprimirFicha() {
        StringBuilder ficha = new StringBuilder();
        ficha.append("=== Ficha Producto Aseo ===\n");
        ficha.append("Nombre: ").append(getNombre()).append("\n");
        ficha.append("ID: ").append(getId()).append("\n");
        ficha.append("Precio Mayor: ").append(getPrecioMayorista()).append("\n");
        ficha.append("Precio Menor: ").append(getPrecio()).append("\n");

        LocalDate fechaDeVencimiento = getFechaDeVencimiento();
        if (fechaDeVencimiento != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
            ficha.append("Fecha Vencimiento: ").append(fechaDeVencimiento.format(formatter)).append("\n");
        } else {
            ficha.append("Fecha Vencimiento: No especificada\n");
        }

        ficha.append("Etiquetas:\n");
        for (String etiqueta : getEtiquetas()) {
            ficha.append("- ").append(etiqueta).append("\n");
        }
        return ficha.toString();
    }
}
 

