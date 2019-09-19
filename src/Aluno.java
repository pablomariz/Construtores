
public class Aluno {
    private String nome;
    private String cpf;
    private Data dataDeNascimento;
    
    public Aluno(String n, String c, Data d){
        
        this.setNome(n);
        this.setCpf(c);
        this.setDataDeNascimento(d);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String c) {
        this.cpf = c;
    }
    
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    
    public void setDataDeNascimento(Data d) {
        this.dataDeNascimento = d;
    }
    
    public String imprimir(){
        String aluno = this.nome + "/n" + this.cpf + "/n" + this.dataDeNascimento.imprimir();
        
        return aluno;
    }
    
}
