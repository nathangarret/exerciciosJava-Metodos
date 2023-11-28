package org.example;

public class _7 {
    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double temperaturaCelsius = 100;
        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " graus Celsius equivalem a: " + temperaturaFahrenheit + " graus Fahrenheit.");
    }
}
