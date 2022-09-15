package Introducao_programacao_orientada_objetos.ex04.util;

public class CurrencyConverter {

    public static double dollarConverter(double dollarPrice, double amount) {
        double total = amount * dollarPrice;
        return total += total * 0.06;
    }
}
