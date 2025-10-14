package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora{
    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equals("Poción")){
            if (artefacto.getNivelDePoder() >= 80){
                artefacto.setPoder(100);
            } else {
                artefacto.sumarPoder(20);
            }
        }

    }
}
