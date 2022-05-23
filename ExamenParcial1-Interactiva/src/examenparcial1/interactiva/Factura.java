/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial1.interactiva;

import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juanf
 */
public class Factura {
    
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;
    public double precioTotal;

    public Factura() {
        precioTotal = 0.0;
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public int cantidadTotal(){
        int suma = 0;
        for(int i = 0 ; i < cantidades.size() ; i++){
            suma += cantidades.get(i);
        }
        return suma;
    }
    

    public void añadirProducto(Producto producto, int cantidad){
        
        
            
                productos.add(producto);
                cantidades.add(cantidad);
                
            
        
    }
    
    public void calcularPrecioTotal(){
        for(int i = 0 ; i < productos.size() ; i++){
            
                this.precioTotal += (productos.get(i).getPrecioVenta() * cantidades.get(i));
                productos.get(i).setCantidadVendida(productos.get(i).getCantidadVendida()+cantidades.get(i));
        }
    }
    
    public String serializarFactura(){
        String serializado = "";
        int cantidadProductos = 0;
        for(int i = 0 ; i < productos.size() ; i++){
                serializado += productos.get(i).toString();
                cantidadProductos += cantidades.get(i);
        }
        serializado += "\n Cantidad de productos total: " + cantidadProductos;
        return serializado;
    }
    
    public void escribirFactura(){
        try {
            FileWriter fw = new FileWriter(".\\Factura.txt");
            fw.write(serializarFactura());
        } catch (Exception ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
