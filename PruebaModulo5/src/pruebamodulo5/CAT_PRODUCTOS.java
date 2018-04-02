
package pruebamodulo5;

import java.util.ArrayList;

public class CAT_PRODUCTOS {

private String id_prod;
private String desc_prod;
private double stock_prod;
private String foto_prod;
private String unidad_prod;
private double precio_compra_prod;
private double precio_venta_prod;
private double existencias_prod;
private int Id_catecoria_prod;
private int Id_proveedor;

public CAT_PRODUCTOS(){}
public CAT_PRODUCTOS(String id_prod, String desc_prod, double stock_prod, String foto_prod, String unidad_prod, double precio_compra, double precio_venta, double existencia, int Id_catecoria_prod, int Id_proveedor){
    this.id_prod = id_prod;
    this.desc_prod = desc_prod;
    this.stock_prod = stock_prod;
    this.foto_prod = foto_prod;
    this.unidad_prod = unidad_prod;
    this.precio_compra_prod = precio_compra;
    this.precio_venta_prod = precio_venta;
    this.existencias_prod = existencia;
    this.Id_catecoria_prod = Id_catecoria_prod;
    this.Id_proveedor = Id_proveedor;
}

    public String getId_prod() {
        return id_prod;
    }

    public void setId_prod(String id_prod) {
        this.id_prod = id_prod;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public double getStock_prod() {
        return stock_prod;
    }

    public void setStock_prod(double stock_prod) {
        this.stock_prod = stock_prod;
    }

    public String getFoto_prod() {
        return foto_prod;
    }

    public void setFoto_prod(String foto_prod) {
        this.foto_prod = foto_prod;
    }

    public String getUnidad_prod() {
        return unidad_prod;
    }

    public void setUnidad_prod(String unidad_prod) {
        this.unidad_prod = unidad_prod;
    }

    public double getPrecio_compra_prod() {
        return precio_compra_prod;
    }

    public void setPrecio_compra_prod(double precio_compra_prod) {
        this.precio_compra_prod = precio_compra_prod;
    }

    public double getPrecio_venta_prod() {
        return precio_venta_prod;
    }

    public void setPrecio_venta_prod(double precio_venta_prod) {
        this.precio_venta_prod = precio_venta_prod;
    }

    public double getExistencias_prod() {
        return existencias_prod;
    }

    public void setExistencias_prod(double existencias_prod) {
        this.existencias_prod = existencias_prod;
    }

    public Integer getId_catecoria_prod() {
        return Id_catecoria_prod;
    }

    public void setId_catecoria_prod(Integer Id_catecoria_prod) {
        this.Id_catecoria_prod = Id_catecoria_prod;
    }

    public Integer getId_proveedor() {
        return Id_proveedor;
    }

    public void setId_proveedor(Integer Id_proveedor) {
        this.Id_proveedor = Id_proveedor;
    }

    
    public ArrayList<String> ingresar_producto(ArrayList<String> n){
        
        return n;
    }
}

