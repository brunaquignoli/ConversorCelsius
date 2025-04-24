/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

/**
 *
 * @author bruna
 */
public class ConversorControle {
    
    public static String converter(String tempcelsius){
        double tempfahr = modelo.ConversorTemperatura.converter(Double.parseDouble(tempcelsius));
        return Double.toString(tempfahr);
    }
    
    public static String converterK(String tempcelsius) {
        double tempkel = modelo.ConversorTemperatura.converterK(Double.parseDouble(tempcelsius));
        return Double.toString(tempkel);
    }
}
