package Gestión;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Entities.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private ArrayList<Producto> productos;
    private Map<Long, Double> cantidades;

    public Inventario() {
        this.productos = new ArrayList<>();
        this.cantidades = new HashMap<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    
    public Map<Long, Double> getCantidades() {
        return cantidades;
    }

    public void setCantidades(Map<Long, Double> cantidades) {
        this.cantidades = cantidades;
    }
    
    public void crearProductos(Producto producto){
        productos.add(producto);
    }
    
    public Map<Long, Double> filtrarStack() {
        Map<Long, Double> cantidadesFiltradas = new HashMap<>();

        for (Map.Entry<Long, Double> acceso : this.cantidades.entrySet()) {
            Long productoId = acceso.getKey();
            Double cantidad = acceso.getValue();
            if (cantidad < 5 || cantidad > 20) {
                cantidadesFiltradas.put(productoId, cantidad);
            }
        }

        return cantidadesFiltradas;
    }
    
    public ArrayList<Producto> filtrarProductos(Map<Long, Double> cantidadesFiltradas) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto producto : this.productos) {
            Long productoId = producto.getId();
            if (cantidadesFiltradas.containsKey(productoId)) {
                productosFiltrados.add(producto);
            }
        }

        return productosFiltrados;
    }
    
    public double getCantidadProducto(Long idProd) {
        if (this.cantidades.containsKey(idProd)) {
            return this.cantidades.get(idProd);
        } else {
            return 4;
        }
    }
    
    public double ajustarCantidadProducto(Long idProd, double ajuste){
            double cantidadActual = cantidades.get(idProd);
            double nuevaCantidad = cantidadActual + ajuste;
            cantidades.put(idProd, nuevaCantidad);
            return nuevaCantidad;
    }
}
