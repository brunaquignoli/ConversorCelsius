/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bruna
 */
public class ConversorTemperatura {
    
    public static double converter(double celsius){
        return 1.8*celsius + 32.0;
    }
    
    public static double converterK(double celsius) {
        return celsius + 273.15;
    }
}

