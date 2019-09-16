
public class TestaPorta {
    
    public static void main(String[] args){
        
        Porta p1 = new Porta();
        p1.setCor("azul");
        p1.abre();
        p1.setDimensaoX(10);
        p1.setDimensaoY(20);
        p1.setDimensaoZ(30);
        p1.pinta("vermelho");
        p1.fecha();
        p1.estaAberta();
        
        
        
        System.out.println("Porta: " + p1.getCor() + "\nDimensões: " + p1.getDimensaoX() + " x " 
                +p1.getDimensaoY() + " x " + p1.getDimensaoZ());
    }
    
}
