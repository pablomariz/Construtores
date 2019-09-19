
public class TestaProduto {
    
    public static void main (String[] args){
        
        Produto p1 = new Produto("Produto 1", 50.0);        
        
        Produto p2 = new Produto("Produto 2", 29.99);
        
        double desconto = p1.diminuir10();
        double aumento = p2.aumenta25();
        
        System.out.println("Produto 1 com desconto: " + desconto + "\n" 
                + "Produto 2 com aumento: " + aumento);
    }
}
