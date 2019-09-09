
public class Pessoa {
    
    String nome;
    int idade;
    
    void fazAniversario(){
        
        int niver = this.idade;
        this.idade = niver;
    }
    
    String imprimir(){
        
        String aniversario = "Idade: " + this.idade + "\n" + "Idade 3 anos depois: " + (this.idade + 3);
        return aniversario;
    }
}
