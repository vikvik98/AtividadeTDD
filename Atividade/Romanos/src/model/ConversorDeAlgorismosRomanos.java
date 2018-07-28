package model;

public class ConversorDeAlgorismosRomanos {

    String numRomano;

    public ConversorDeAlgorismosRomanos(String numRomano) {
        this.numRomano = numRomano.toLowerCase();
    }

    public int conveterUmAlgorismoRomanoParaDecimal(String caracter){
        if ("i".equals(caracter)) {
            return 1;
        } else if ("v".equals(caracter)) {
            return 5;
        } else if ("x".equals(caracter)) {
            return 10;
        } else if ("l".equals(caracter)) {
            return 50;
        } else if ("c".equals(caracter)) {
            return 100;
        } else if ("d".equals(caracter)) {
            return 500;
        } else if ("m".equals(caracter)) {
            return 1000;
        }else{
            throw new IllegalArgumentException("Romano inválido: " + caracter);
        }
    }

    public int ConverterDoisAlgoritmosRomanosParaDecimal(){
        int valorDecimal = 0;
        if(this.numRomano.charAt(0) < this.numRomano.charAt(1)){
            valorDecimal = conveterUmAlgorismoRomanoParaDecimal(String.valueOf(this.numRomano.charAt(1))) - conveterUmAlgorismoRomanoParaDecimal(String.valueOf(this.numRomano.charAt(0)));
        }
        if (this.numRomano.charAt(0) >= this.numRomano.charAt(1)){
            valorDecimal = conveterUmAlgorismoRomanoParaDecimal(String.valueOf(this.numRomano.charAt(0))) + conveterUmAlgorismoRomanoParaDecimal(String.valueOf(this.numRomano.charAt(1)));
        }
        return valorDecimal;
    }

    public String getNumRomano() {
        return numRomano;
    }

    public void setNumRomano(String numRomano) {
        this.numRomano = numRomano;
    }
}
