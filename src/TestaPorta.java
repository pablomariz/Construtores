
public class TestaPorta {
    
    public static void main(String[] args){
        
        Porta p1 = new Porta(true, "azul", 10, 20, 30);
        p1.fecha();
        p1.pinta("vermelho");
        p1.abre();
        p1.estaAberta();
        
        
        
        System.out.println("Porta: " + p1.getCor() + "\nDimensões: " + p1.getDimensaoX() + " x " 
                +p1.getDimensaoY() + " x " + p1.getDimensaoZ());
    }
    
}
