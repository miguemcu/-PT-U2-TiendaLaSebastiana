package Gestión;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Entities.Producto;
import java.util.ArrayList;
import java.util.Map;

public class Inventario {
    private ArrayList<Producto> productos;
    private Map<Long, Double> cantidades;

    public Inventario() {
    }

    public Inventario(ArrayList<Producto> productos, Map<Long, Double> cantidades) {
        this.productos = productos;
        this.cantidades = cantidades;
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
    
    

}
