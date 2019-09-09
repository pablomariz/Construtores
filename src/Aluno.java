
public class Aluno {
    String nome;
    String cpf;
    Data dataDeNascimento;
    
    String imprimir(){
        String aluno = this.nome + "/n" + this.cpf + "/n" + this.dataDeNascimento.imprimir();
        
        return aluno;
    }
    
}
