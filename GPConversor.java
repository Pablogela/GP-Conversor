package com.gpinformatica.gp.conversor;

import javax.swing.JOptionPane;

public class GPConversor {

    public static void main(String[] args) {

        function monedas = new function();
        function grados = new function();

        boolean flag = true;
        while (flag) {

            String opciones = (JOptionPane.showInputDialog(null, "Selleccione una opcion", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea converir: ");
                    if (ValidarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingrese el valor de la temperatura que deseas convertir");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        grados.ConvertirTemperaturas(Minput);
                        
                        int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

            }

        }

    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
