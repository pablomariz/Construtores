
public class TestaAluno {
    
    public static void main(String[] args){
        
        Aluno a1 = new Aluno();
        a1.nome = "Carol";
        a1.cpf = "000.000.000.01";
        
        Data data = new Data();
        data.dia = 12;
        data.mes = 9;
        data.ano = 1998;
        a1.dataDeNascimento = data;
        
        System.out.println(a1.nome + "\n" + a1.cpf + "\n" + a1.dataDeNascimento.imprimir());
        
    }
}
