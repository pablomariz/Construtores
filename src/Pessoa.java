
public class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa(String n, int i){
        
        this.setNome(n);
        this.setIdade(i);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i) {
        this.idade = i;
    }
    
    public void fazAniversario(){
        
        int niver = this.idade;
        this.idade = niver;
    }
    
    public String imprimir(){
        
        String aniversario = "Idade: " + this.idade + "\n" + "Idade 3 anos depois: " + (this.idade + 3);
        return aniversario;
    }
}
