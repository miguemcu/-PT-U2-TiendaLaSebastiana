package Entities;


import java.util.ArrayList;
import java.util.Date;
 public class Bebida extends Producto {
    private Date fechaDeVencimiento;
    private ArrayList<String> etiquetas;

    public Bebida() {
    }
    
    public Bebida(String nombre, long id, double cantidad, double precioMenor, double precioMayor,
                  Date fechaDeVencimiento, ArrayList<String> etiquetas) {
        super(nombre,id,cantidad,precioMenor, precioMayor, EnumTipoProd.BEBIDA);
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.etiquetas = etiquetas;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
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

