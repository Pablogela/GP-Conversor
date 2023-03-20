package com.gpinformatica.gp.conversor;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

    public void ConvertirPesosADolares(double valor) {
        double monedaDolar = valor / 360;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $ " + monedaDolar + " USD");
    }

    public void ConvertirPesosAEuros(double valor) {
        double monedaEuro = valor / 360;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $ " + monedaEuro + " EUR");
    }

    public void ConvertirPesosALibras(double valor) {
        double monedaLibra = valor / 360;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $ " + monedaLibra + " LIB");
    }    
    
}
