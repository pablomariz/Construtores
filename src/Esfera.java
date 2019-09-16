
public class Esfera {
    
    private int raio;
    
    public int getRaio(){
        return this.raio;
    }
    
    public void setRaio(int r) {
        this.raio = r;
    }
    
    public double volumeEsfera(){
        
        double volume = (4.0/3.0) * 3.14159265 * (raio * raio * raio);
        return volume;
    }
    
}
