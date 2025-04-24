package Gestión;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian
 */
import Entities.DetalleVenta;
import Entities.Producto;
import java.util.ArrayList;

import java.util.ArrayList;

public class Venta {
    private ArrayList<DetalleVenta> detalles;
    private double totalVenta;
    private double totalBruto;
    private double totalDescuento;
    private double totalIva;

    public Venta() {
        this.detalles = new ArrayList<>();
    }

    public Venta(ArrayList<DetalleVenta> detalles, double totalVenta, double totalBruto,
                 double totalDescuento, double totalIva) {
        this.detalles = detalles;
        this.totalVenta = totalVenta;
        this.totalBruto = totalBruto;
        this.totalDescuento = totalDescuento;
        this.totalIva = totalIva;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(double totalBruto) {
        this.totalBruto = totalBruto;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(double totalIva) {
        this.totalIva = totalIva;
    }

    public String generarRecibo() {
        // Implementación pendiente
        return null;
    }
}



