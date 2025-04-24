package Entities;


public abstract class Producto {
    private String nombre;
    private long id;
    private double cantidad;
    private double precioMayor;
    private double precioMenor;
    private EnumTipoProd tipoProducto;

    public Producto() {
    }

    public Producto(String nombre, long id, double cantidad, double precioMayor, double precioMenor, EnumTipoProd tipoProducto) {
        this.nombre = nombre;
        this.id = id;
        this.cantidad = cantidad;
        this.precioMayor = precioMayor;
        this.precioMenor = precioMenor;
    }

    public EnumTipoProd getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(EnumTipoProd tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioMayor() {
        return precioMayor;
    }

    public void setPrecioMayor(double precioMayor) {
        this.precioMayor = precioMayor;
    }

    public double getPrecioMenor() {
        return precioMenor;
    }

    public void setPrecioMenor(double precioMenor) {
        this.precioMenor = precioMenor;
    }
    
    public abstract void imprimirFicha();
}
