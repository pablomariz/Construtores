
public class Casa {
    
    String cor;
    int porta1, porta2, porta3;
        
    void pinta(String s){
        
        cor = s;
    }
    
    int aberta(){
        
        return 1;
    }
    
    int fechada(){
        
        return 0;
    }
    
   
    int quantasPortasEstaoAbertas(){
        int soma = this.porta1 + this.porta2 + this.porta3;
        if(soma == 0){
            System.out.println("Todas as portas estão fechadas.");
        }
        else{
            System.out.println(soma + " portas estão abertas.");
        }
        return soma;
    }   
}
