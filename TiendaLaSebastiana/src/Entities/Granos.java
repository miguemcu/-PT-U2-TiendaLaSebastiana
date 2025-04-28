package Entities;


import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */

public class Granos extends Producto {
    private LocalDate fechaDeVencimiento;
    private ArrayList<String> etiquetas;

    public Granos() {
    }
    
    public Granos(String nombre, long id, double precio, double precioMayorista,
                  LocalDate fechaDeVencimiento, ArrayList<String> etiquetas) {
        super(nombre,id,precio, precioMayorista, EnumTipoProd.GRANOS);
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
        System.out.println("=== Ficha Granos ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getId());

        System.out.println("Precio Mayor: " + getPrecioMayorista());
        System.out.println("Precio Menor: " + getPrecio());
        System.out.println("Fecha Vencimiento: " + getFechaDeVencimiento());
        System.out.println("Etiquetas:");
        for (String etiqueta : etiquetas){
            System.out.println("- " + etiqueta) ;
        }
    }
}
