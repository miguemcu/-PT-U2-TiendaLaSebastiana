package Entities;


import java.util.ArrayList;
import java.time.LocalDate;
 public class Bebida extends Producto {
    private LocalDate fechaDeVencimiento;
    private ArrayList<String> etiquetas;

    public Bebida() {
    }
    
    public Bebida(String nombre, long id,double precioMenor, double precioMayor,
                  LocalDate fechaDeVencimiento, ArrayList<String> etiquetas) {
        super(nombre,id, precioMenor, precioMayor, EnumTipoProd.BEBIDA);
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
        System.out.println("Precio Mayor: " + getPrecioMayor());
        System.out.println("Precio Menor: " + getPrecioMenor());
        System.out.println("Fecha Vencimiento: " + getFechaDeVencimiento());
        System.out.println("Etiquetas:");
        for (String etiqueta : etiquetas){
            System.out.println("- " + etiqueta) ;
        }
    }
}

