package tests;

import model.ConversorDeAlgorismosRomanos;

import static org.junit.jupiter.api.Assertions.*;

class ConversorDeAlgorismosRomanosTest {
    ConversorDeAlgorismosRomanos conversorDeAlgorismosRomanos = new ConversorDeAlgorismosRomanos("v");
    @org.junit.jupiter.api.Test
    void test_para_um_unico_algorismo_romano() {

        assertEquals(5,conversorDeAlgorismosRomanos.conveterUmAlgorismoRomanoParaDecimal(conversorDeAlgorismosRomanos.getNumRomano()));
        conversorDeAlgorismosRomanos.setNumRomano("");
        assertThrows(IllegalArgumentException.class,()-> {
            conversorDeAlgorismosRomanos.conveterUmAlgorismoRomanoParaDecimal(conversorDeAlgorismosRomanos.getNumRomano());
        });
    }

    @org.junit.jupiter.api.Test
    void test_para_dois_algorismos_romanos(){
        conversorDeAlgorismosRomanos.setNumRomano("iv");
        assertEquals(4,conversorDeAlgorismosRomanos.ConverterDoisAlgoritmosRomanosParaDecimal());
        conversorDeAlgorismosRomanos.setNumRomano("ee");
        assertThrows(IllegalArgumentException.class,()-> {
            conversorDeAlgorismosRomanos.conveterUmAlgorismoRomanoParaDecimal(conversorDeAlgorismosRomanos.getNumRomano());
        });
    }
}