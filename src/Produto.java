
public class Produto {
    
    String nome;
    double preco;    
    
    double diminuir10(){
        double desconto = this.preco - (this.preco * 0.1);
        return desconto;
    }
    
    double aumenta25(){
        double aumento = this.preco + (this.preco * 0.25);
        return aumento;        
    }
}
