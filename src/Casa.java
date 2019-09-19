
public class Casa {
    
    private String cor;
    private int porta1, porta2, porta3;
    
    public Casa(String c, int p1, int p2, int p3){
        
        this.setCor(c);
        this.setPorta1(p1);
        this.setPorta2(p2);
        this.setPorta3(p3);
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public int getPorta1(){
        return this.porta1;
    }
    
    public void setPorta1(int p) {
        this.porta1 = p;
    }
    
    public int getPorta2(){
        return this.porta2;
    }
    
    public void setPorta2(int d) {
        this.porta2 = d;
    }
    
    public int getPorta3(){
        return this.porta3;
    }
    
    public void setPorta3(int o) {
        this.porta3 = o;
    }
        
    public void pinta(String s){
        
        cor = s;
    }
    
    public int aberta(){
        
        return 1;
    }
    
    public int fechada(){
        
        return 0;
    }
    
   
    public int quantasPortasEstaoAbertas(){
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
