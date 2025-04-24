package Gestión;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian
 */
import Gestión.Inventario;
import Gestión.Caja;
import java.util.ArrayList;
import java.util.Date;

public class Reporte {
    private Date fechaInicio;
    private Date fechaFin;

    public Reporte() {
    }

    public Reporte(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Firma del método: genera reporte de ventas por periodo
    public void generarReporteVentas(Caja caja, String tipoPeriodo) {
        // tipoPeriodo puede ser "diario", "semanal", "mensual"
        // Lógica a implementar
    }

    // Firma del método: reporte inventario actual
    public void generarReporteInventario(Inventario inventario) {
        // Lógica para mostrar estado actual del inventario
    }

    // Firma del método: muestra productos con stock crítico o sobrestock
    public void mostrarAlertasStock(Inventario inventario) {
        // Lógica para detectar productos con stock muy bajo o muy alto
    }
}
