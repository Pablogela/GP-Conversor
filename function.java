package com.gpinformatica.gp.conversor;

import javax.swing.JOptionPane;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    //ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
    ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();

    public void ConvertirMonedas(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras"},
                "Seleccion")).toString();
        switch (opcion) {
            case "De Pesos a Dolar":
                monedas.ConvertirPesosADolares(Minput);
                break;
            case "De Pesos a Euro":
                monedas.ConvertirPesosAEuros(Minput);
                break;
            case "De Pesos a Libras":
                monedas.ConvertirPesosALibras(Minput);
                break;
        }

    }

    public void ConvertirTemperaturas(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije el tipo de temperatura al cual Convertir los ºCelcius", "Grados",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Celcius a Fahrenheit", "Celcius a Kelvin"},
                "Seleccion")).toString();
        switch (opcion) {
            case "Celcius a Fahrenheit":
                temperaturas.ConvertirCelsiusAFahrenheit(Minput);
                break;
            case "Celcius a Kelvin":
                temperaturas.ConvertirCelsiusAKelvin(Minput);
        }

    }

}
