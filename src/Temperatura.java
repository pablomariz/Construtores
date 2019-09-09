
public class Temperatura {
    
    double converterParaCelsius(double f){
        
        double celsius = (f - 32) / 1.8;
        
        return celsius;
    }
    
    double converterParaFahrenheit(double c){
        
        double fahrenheit = c * 1.8 + 32;
        
        return fahrenheit;
    }
}
