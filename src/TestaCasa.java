
public class TestaCasa {
    public static void main(String[] args){
        
        Casa c1 = new Casa();
        c1.cor = "Branca";
        c1.porta1 = c1.aberta();
        c1.porta2 = c1.fechada();
        c1.porta3 = c1.aberta();
        
        
        c1.pinta("amarelo");
        System.out.println("A cor da casa é " + c1.cor);
        
        c1.quantasPortasEstaoAbertas();
        
    }
    
}
