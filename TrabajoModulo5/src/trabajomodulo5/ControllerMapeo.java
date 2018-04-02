
package trabajomodulo5;


public class ControllerMapeo {
    
    private String Lugar;
    private String NFlora;
    private String NFauna;
    
    
    public ControllerMapeo(){
        
    }
    
    public ControllerMapeo(String Flora, String Fauna, String Lugar){
        this.Lugar = Lugar;
        this.NFlora = Flora;
        this.NFauna = Fauna;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getNFlora() {
        return NFlora;
    }

    public void setNFlora(String NFlora) {
        this.NFlora = NFlora;
    }

    public String getNFauna() {
        return NFauna;
    }

    public void setNFauna(String NFauna) {
        this.NFauna = NFauna;
    }
    
    
}
