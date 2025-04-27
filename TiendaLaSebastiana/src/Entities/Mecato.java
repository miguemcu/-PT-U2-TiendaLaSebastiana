package Entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */
public class Mecato extends Producto {
    private LocalDate fechaDeVencimiento;
    private ArrayList<String> etiquetas;

    public Mecato() {
    }
    
    public Mecato(String nombre, long id, double cantidad, double precioMenor, double precioMayor,
                  LocalDate fechaDeVencimiento, ArrayList<String> etiquetas) {
        super(nombre,id,cantidad,precioMenor, precioMayor, EnumTipoProd.MECATO);
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
      public void imprimirFicha() {
        System.out.println("=== Ficha Bebida ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Precio Mayor: " + getPrecioMayor());
        System.out.println("Precio Menor: " + getPrecioMenor());
        System.out.println("Fecha Vencimiento: " + getFechaDeVencimiento());
        System.out.println("Etiquetas:");
        for (String etiqueta : etiquetas){
            System.out.println("- " + etiqueta) ;
        }
    }
}

