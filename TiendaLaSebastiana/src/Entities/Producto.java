package Entities;


public abstract class Producto {
    private String nombre;
    private long id;
    private double cantidad;
    private double precioMayorista;
    private double precio;
    private EnumTipoProd tipoProducto;

    public Producto() {
    }

    public Producto(String nombre, long id, double cantidad, double precioMayorista, double precio, EnumTipoProd tipoProducto) {
        this.nombre = nombre;
        this.id = id;
        this.cantidad = cantidad;
        this.precioMayorista = precioMayorista;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
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

    public double getPrecioMayorista() {
        return precioMayorista;
    }

    public void setPrecioMayorista(double precioMayorista) {
        this.precioMayorista = precioMayorista;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public abstract void imprimirFicha();
}
