
public class TestaAluno {
    
    public static void main(String[] args){
        
        Aluno a1 = new Aluno();
        a1.setNome("Carol");
        a1.setCpf("000.000.000.01");
        
        Data data = new Data();
        data.setDia(12);
        data.setMes(9);
        data.setAno(1998);
        a1.setDataDeNascimento(data);
        
        System.out.println(a1.getNome() + "\n" + a1.getCpf() + "\n" + a1.getDataDeNascimento().imprimir());
        
    }
}
