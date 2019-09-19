
public class Produto {
    
    private String nome;
    private double preco;
    
    public Produto(String n, double p){
        
        this.setNome(n);
        this.setPreco(p);
    }

public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }

public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double p) {
        this.preco = p;
    }    
    
    public double diminuir10(){
        double desconto = this.preco - (this.preco * 0.1);
        return desconto;
    }
    
    public double aumenta25(){
        double aumento = this.preco + (this.preco * 0.25);
        return aumento;        
    }
}
