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
    
    public ArrayList<Producto> filtrarProductos() {
        
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto producto : this.productos) {
            Long productoId = producto.getId();
            
            double cantidad = this.cantidades.get(productoId);
            if (cantidad < 5 || cantidad > 20) {
                productosFiltrados.add(producto);
            }
            
        }

        return productosFiltrados;
    }
    
    public Map<Long, Double> filtrarStack(ArrayList<Producto> productosFiltrados) {
        Map<Long, Double> cantidadesFiltradas = new HashMap<>();

        for (Producto producto : productosFiltrados) {
            Long productoId = producto.getId();
                cantidadesFiltradas.put(productoId, this.cantidades.get(productoId));
        }

        return cantidadesFiltradas;
    }
    

}
