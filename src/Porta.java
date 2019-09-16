
public class Porta {
    
    private boolean aberta;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;
    
    public boolean getAberta(){
        return this.aberta;
    }
    
    public void setAberta(boolean a) {
        this.aberta = a;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public double getDimensaoX(){
        return this.dimensaoX;
    }
    
    public void setDimensaoX(double d) {
        this.dimensaoX = d;
    }
    
    public double getDimensaoY(){
        return this.dimensaoY;
    }
    
    public void setDimensaoY(double y) {
        this.dimensaoY = y;
    }
    
    public double getDimensaoZ(){
        return this.dimensaoZ;
    }
    
    public void setDimensaoZ(double z) {
        this.dimensaoZ = z;
    }
    
    public void abre(){
        
        this.aberta = true;
        System.out.println("A porta está aberta.");
    }
    
    public void fecha(){
        
        this.aberta = false;
        System.out.println("A porta está fechada.");
    }
    
    public void pinta(String s){
        
        cor = s;
        
    }
    
    public boolean estaAberta(){
        if(aberta){
            System.out.println("Porta aberta.");
            return true;
        }
       else{
            System.out.println("Porta fechada.");
            return false;
        }
    }
}
