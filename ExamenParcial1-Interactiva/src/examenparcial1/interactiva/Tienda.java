package examenparcial1.interactiva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author juanf
 */
public class Tienda {

    private ArrayList<Producto> listaProductos;
    private ArrayList<Producto> factura;
    private ArrayList<Producto> proximosAVencer;
    
    public Tienda() {
        inicializar();
    }
    
    public void inicializar(){
        
        factura = new ArrayList<>();
        listaProductos = new ArrayList<>();
        proximosAVencer = new ArrayList<>();
       //Cargar inventario desde archivo
       
       leerArchivo();
        
    }

    public void leerArchivo() {
        
        try {
            
            File archivo = new File("src\\examenparcial1\\interactiva\\Inventario.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while(linea != null){
                String[] producto = linea.split(",");
                if(validarCodigo(producto[0])){
                    Date a = new SimpleDateFormat("dd/MM/yyyy").parse(producto[6]);
                    Producto temp = new Producto(producto[0], producto[1], producto[2], Double.parseDouble(producto[3]), Double.parseDouble(producto[4]), Integer.parseInt(producto[5]), a);
                    listaProductos.add(temp);
                }
                linea = br.readLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarArchivo(){
        try {
            FileWriter fw = new FileWriter(".\\Inventario.txt");
            for(int i = 0 ; i < listaProductos.size() ; i ++){
                String codigo = listaProductos.get(i).getCodigo();
                String nombre = listaProductos.get(i).getNombre();
                String presentacion = listaProductos.get(i).getPresentacion();
                String pCompra = listaProductos.get(i).getPrecioCompra() + "";
                String pVenta = listaProductos.get(i).getPrecioVenta() + "";
                String cantidad = listaProductos.get(i).getCantidad() + "";
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                String vencimiento = dateFormat.format(listaProductos.get(i).getFechaVencimmiento());
                fw.write(codigo + "," + nombre + "," + presentacion + "," + pCompra + "," + pVenta + "," + cantidad + "," + vencimiento);
            }
        } catch (Exception ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean validarCodigo(String codigo){
        return true;
    }
    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Producto> getFactura() {
        return factura;
    }

    public void setFactura(ArrayList<Producto> factura) {
        this.factura = factura;
    }
    
    public String[] listaNombres(){
        String[] nombres = new String[this.listaProductos.size()];
        for(int i = 0 ; i < nombres.length ; i++){
            nombres[i] = this.listaProductos.get(i).getNombre();
        }
        return nombres;
    }
    
    public void mostrarInventario(){
        String[] nombreColumnas = {"Código", "Nombre", "Presentación", "Precio Compra", "Precio Venta", "Cantidad", "Fecha Vencimiento"};
        Object[][] infoTabla = new String[listaProductos.size()][7];
        for(int i = 0 ; i  < listaProductos.size() ; i++){
            String codigo = listaProductos.get(i).getCodigo();
            String nombre = listaProductos.get(i).getNombre();
            String presentacion = listaProductos.get(i).getPresentacion();
            String pCompra = listaProductos.get(i).getPrecioCompra() + "";
            String pVenta = listaProductos.get(i).getPrecioVenta() + "";
            String cantidad = listaProductos.get(i).getCantidad() + "";
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String vencimiento = dateFormat.format(listaProductos.get(i).getFechaVencimmiento());
            infoTabla[i][0] = codigo;
            infoTabla[i][1] = nombre;
            infoTabla[i][2] = presentacion;
            infoTabla[i][3] = pCompra;
            infoTabla[i][4] = pVenta;
            infoTabla[i][5] = cantidad;
            infoTabla[i][6] = vencimiento;
        }
        JTable tabla = new JTable(infoTabla, nombreColumnas);
        JScrollPane scroll = new JScrollPane(tabla);
        tabla.setFillsViewportHeight(true);
        JOptionPane.showMessageDialog(null, new JScrollPane(tabla));
    }
    
    public void valorTotalInventario(){
        double valorTotalInventario = 0;
        for(int i = 0 ; i < listaProductos.size() ; i++){
            valorTotalInventario += listaProductos.get(i).getCantidad() * listaProductos.get(i).getPrecioCompra();
        }
        JOptionPane.showMessageDialog(null, "El valor total del inventario es: " + valorTotalInventario );
    }
    
    public void cargarProductosAVencer(){
        for(int i = 0 ; i < listaProductos.size() ; i++){
            Date fechaActual = new Date();
            long fechaActualMilis = fechaActual.getTime();
            Date producto = listaProductos.get(i).getFechaVencimmiento();
            long fechaProductoMilis = producto.getTime();
            long timeDiff = 0;
		if(fechaActualMilis > fechaProductoMilis) {
			timeDiff = fechaActualMilis - fechaProductoMilis;
		} else {
			timeDiff = fechaProductoMilis - fechaActualMilis;
		}
            int diferencia = (int) (timeDiff / (1000 * 60 * 60* 24));
            if(diferencia < 7){
                proximosAVencer.add(listaProductos.get(i));
            }
        }
        String[] nombreColumnas = {"Código", "Nombre", "Presentación", "Precio Compra", "Precio Venta", "Cantidad", "Fecha Vencimiento"};
        Object[][] infoTabla = new String[proximosAVencer.size()][7];
        for(int i = 0 ; i  < proximosAVencer.size() ; i++){
            String codigo = proximosAVencer.get(i).getCodigo();
            String nombre = proximosAVencer.get(i).getNombre();
            String presentacion = proximosAVencer.get(i).getPresentacion();
            String pCompra = proximosAVencer.get(i).getPrecioCompra() + "";
            String pVenta = proximosAVencer.get(i).getPrecioVenta() + "";
            String cantidad = proximosAVencer.get(i).getCantidad() + "";
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String vencimiento = dateFormat.format(proximosAVencer.get(i).getFechaVencimmiento());
            infoTabla[i][0] = codigo;
            infoTabla[i][1] = nombre;
            infoTabla[i][2] = presentacion;
            infoTabla[i][3] = pCompra;
            infoTabla[i][4] = pVenta;
            infoTabla[i][5] = cantidad;
            infoTabla[i][6] = vencimiento;
        }
        JTable tabla = new JTable(infoTabla, nombreColumnas);
        JScrollPane scroll = new JScrollPane(tabla);
        tabla.setFillsViewportHeight(true);
        JOptionPane.showMessageDialog(null, tabla);
    }
    
    public void utilidadPorMes(){
        double valorTotalInventario = 0;
        for(int i = 0 ; i < listaProductos.size() ; i++){
            valorTotalInventario += listaProductos.get(i).getCantidad() * listaProductos.get(i).getPrecioCompra();
        }
        double precioTotalInventario= 0;
        for(int i = 0 ; i < listaProductos.size() ; i++){
            precioTotalInventario += listaProductos.get(i).getCantidad() * listaProductos.get(i).getPrecioVenta();
        }
        JOptionPane.showMessageDialog(null, "La utilidad generada este mes es: " + (precioTotalInventario - valorTotalInventario) );
    }
    
    public void productoMasVendido(){
        Producto temp = null;
        for(int i = 0 ; i < listaProductos.size() ; i ++){
            if(temp == null){
                temp = listaProductos.get(i);
            }else{
                if (listaProductos.get(i).getCantidadVendida() >= temp.getCantidadVendida()){
                    temp = listaProductos.get(i);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El producto mas vendido de este mes es: " + temp.nombre + ". " + temp.cantidadVendida + " unidades vendidas." );
    }
    
}
