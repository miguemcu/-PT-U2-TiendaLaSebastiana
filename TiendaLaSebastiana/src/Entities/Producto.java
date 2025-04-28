package Entities;


public abstract class Producto {
    private String nombre;
    private long id;
    private double precioMayor;
    private double precioMenor;
    private EnumTipoProd tipoProducto;

    public Producto() {
    }

    public Producto(String nombre, long id, double precioMayor, double precioMenor, EnumTipoProd tipoProducto) {
        this.nombre = nombre;
        this.id = id;
        this.precioMayor = precioMayor;
        this.precioMenor = precioMenor;
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
