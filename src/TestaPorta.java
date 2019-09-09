
public class TestaPorta {
    
    public static void main(String[] args){
        
        Porta p1 = new Porta();
        p1.cor = "azul";
        p1.abre();
        p1.dimensaoX = 10;
        p1.dimensaoY = 20;
        p1.dimensaoZ = 30;
        p1.pinta("vermelho");
        p1.fecha();
        p1.estaAberta();
        
        
        
        System.out.println("Porta: " + p1.cor + "\nDimensões: " + p1.dimensaoX + " x " 
                +p1.dimensaoY + " x " + p1.dimensaoZ);
    }
    
}
