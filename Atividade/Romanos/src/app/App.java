package app;

import model.ConversorDeAlgorismosRomanos;

public class App {
    public static void main(String[] args) {
        ConversorDeAlgorismosRomanos conversorDeAlgorismosRomanos = new ConversorDeAlgorismosRomanos("ii");
        System.out.println(conversorDeAlgorismosRomanos.ConverterDoisAlgoritmosRomanosParaDecimal());
    }
}
