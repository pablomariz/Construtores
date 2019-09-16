
public class MainTemperatura {
    
    public static void main(String [] args){
        
        Temperatura celsius = new Temperatura();
        double valor = 100;
        double resultado;
        
        resultado = celsius.converterParaCelsius(valor);
        
        Temperatura fahrenheit = new Temperatura();
        double fvalor = 40;
        double rFinal;
        
        rFinal = fahrenheit.converterParaFahrenheit(fvalor);
        
        System.out.println(valor + " graus Fahrenheit é o mesmo que " + resultado + " graus Celsius.");  
        System.out.println(fvalor + " graus Celsius é o mesmo que " + rFinal + " graus Fahrenheit.");
        
    }
}
