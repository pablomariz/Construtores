
public class Porta {
    
    boolean aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;
    
    void abre(){
        
        this.aberta = true;
        System.out.println("A porta está aberta.");
    }
    
    void fecha(){
        
        this.aberta = false;
        System.out.println("A porta está fechada.");
    }
    
    void pinta(String s){
        
        cor = s;
        
    }
    
    boolean estaAberta(){
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
