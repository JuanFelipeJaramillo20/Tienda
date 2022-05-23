/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial1.interactiva;

import java.util.Date;

/**
 *
 * @author juanf
 */
public class Producto {
    
    protected String codigo;
    protected String nombre;
    protected String presentacion;
    protected double precioCompra;
    protected double precioVenta;
    protected int cantidad;
    protected Date fechaVencimmiento;
    protected int cantidadVendida;

    public Producto(String codigo, String nombre, String presentacion, double precioCompra, double precioVenta, int cantidad, Date fechaVencimmiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.fechaVencimmiento = fechaVencimmiento;
        this.cantidadVendida = 0;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVencimmiento() {
        return fechaVencimmiento;
    }

    public void setFechaVencimmiento(Date fechaVencimmiento) {
        this.fechaVencimmiento = fechaVencimmiento;
    }

    @Override
    public String toString() {
        return getNombre() + ", " + getCodigo() + ", " + getPresentacion() + ", " + getPrecioVenta() + ", " + getFechaVencimmiento();
    }
    
}
