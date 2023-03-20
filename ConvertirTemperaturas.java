package com.gpinformatica.gp.conversor;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {

    public void ConvertirCelsiusAFahrenheit(double valor) {
        double gradoFahrenheit = (valor * 1.8) + 32;
        gradoFahrenheit = (double) Math.round(gradoFahrenheit * 1000) / 100;
        JOptionPane.showMessageDialog(null, "Equivale a " + gradoFahrenheit + " grados Fahrenheit");
    }

    public void ConvertirCelsiusAKelvin(double valor) {
        double gradoKelvin = (valor + 273.15);
        gradoKelvin = (double) Math.round(gradoKelvin * 1000) / 100;
        JOptionPane.showMessageDialog(null, "Equivale a " + gradoKelvin + " grados Kelvin");
    }
}
