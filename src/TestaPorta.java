
public class TestaPorta {
    
    public static void main(String[] args){
        
        Porta p1 = new Porta(true, "amarelo", 10, 20, 30);
        p1.fecha();
        p1.pinta("cinza");
        p1.abre();
        p1.estaAberta();
        
        
        
        System.out.println("Porta: " + p1.getCor() + "\nDimensões: " + p1.getDimensaoX() + " x " 
                +p1.getDimensaoY() + " x " + p1.getDimensaoZ());
    }
    
}
