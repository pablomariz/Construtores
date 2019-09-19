
public class TestaCasa {
    public static void main(String[] args){
        
        Casa c1 = new Casa("Branca", 1, 0, 1);        
        
        c1.pinta("amarelo");
        System.out.println("A cor da casa é " + c1.getCor());
        
        c1.quantasPortasEstaoAbertas();
        
    }
    
}
