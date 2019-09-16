
public class TestaProduto {
    
    public static void main (String[] args){
        
        Produto p1 = new Produto();
        p1.setNome("Produto 1");
        p1.setPreco(50.0);
        
        
        Produto p2 = new Produto();
        p2.setNome("Produto 2");
        p2.setPreco(29.99);
        
        double desconto = p1.diminuir10();
        double aumento = p2.aumenta25();
        
        System.out.println("Produto 1 com desconto: " + desconto + "\n" 
                + "Produto 2 com aumento: " + aumento);
    }
}
