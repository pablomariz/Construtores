
public class TestaPessoa {
    
    public static void main(String[] args){
        
    Pessoa p1 = new Pessoa ();
    p1.setNome("Carolina");
    p1.setIdade(20);
    p1.fazAniversario();
    
    System.out.println("Nome: " + p1.getNome() + "\n" + p1.imprimir());
    
    }
}
