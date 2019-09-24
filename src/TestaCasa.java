
public class TestaCasa {
    public static void main(String[] args){
        
        Casa c1 = new Casa("Azul", 1, 0, 1);        
        
        c1.pinta("Preto");
        System.out.println("A cor da casa é " + c1.getCor());
        
        c1.quantasPortasEstaoAbertas();
        
    }
    
}
