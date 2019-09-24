
public class TestaProduto {
    
    public static void main (String[] args){
        
        Produto p1 = new Produto("Primeiro produto", 100.0);        
        
        Produto p2 = new Produto("Segundo produto", 320.00);
        
        double desconto = p1.diminuir10();
        double aumento = p2.aumenta25();
        
        System.out.println("Produto 1 com desconto: " + desconto + "\n" 
                + "Produto 2 com aumento: " + aumento);
    }
}
