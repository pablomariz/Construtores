
public class TestaCasa {
    public static void main(String[] args){
        
        Casa c1 = new Casa();
        c1.setCor("Branca");
        c1.setPorta1(1);
        c1.setPorta2(0);
        c1.setPorta3(1);
        
        
        c1.pinta("amarelo");
        System.out.println("A cor da casa é " + c1.getCor());
        
        c1.quantasPortasEstaoAbertas();
        
    }
    
}
