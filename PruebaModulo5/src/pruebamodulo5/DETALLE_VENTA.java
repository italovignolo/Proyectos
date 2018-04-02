
package pruebamodulo5;

public class DETALLE_VENTA {
    private int id_detalle_venta;
    private Integer id_venta;
    private String id_prod;
    private double cantidad_vendida;
    
    public DETALLE_VENTA(){}

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public String getId_prod() {
        return id_prod;
    }

    public void setId_prod(String id_prod) {
        this.id_prod = id_prod;
    }

    public double getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(double cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }
    
    
    
}
