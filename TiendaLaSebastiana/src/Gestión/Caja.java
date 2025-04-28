package Gestión;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian
 */
import Entities.Empleado;
import java.util.ArrayList;
import Entities.Producto;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Caja {
    private Empleado cajero;
    private ArrayList<Empleado> empleados;
    private ArrayList<Venta> ventas;
    private Inventario inventario;

    
    public Caja() {
        this.empleados = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
        this.ventas = new ArrayList<>();
    }

    // Getters y Setters

    public Empleado getCajero() {
        return cajero;
    }

    public void setCajero(Empleado cajero) {
        this.cajero = cajero;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Venta vender() {
        // Lógica pendiente: realizar una venta, registrar, restar stock
        return null;
    }
    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
    public ArrayList<Venta> obtenerVentasSegunPeriodo(LocalDate fechaInicio, LocalDate fechaFin){
        ArrayList<Venta> ventasFiltradas = ventas.stream()
        .filter(v -> {
            LocalDate fechaVenta = v.getFecha().toLocalDate();
            return !fechaVenta.isBefore(fechaInicio) && !fechaVenta.isAfter(fechaFin);
        })
        .collect(Collectors.toCollection(ArrayList::new));
        
        return ventasFiltradas;
    }
    
    public void agregarVenta(Venta venta) {
        this.ventas.add(venta);
    }
}
