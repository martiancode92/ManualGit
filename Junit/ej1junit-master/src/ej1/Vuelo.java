/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author 203p21
 */
public class Vuelo {

    int nVuelo;
    String nombre;
    int totTur;
    int ocuTur;
    int totBus;
    int ocuBus;

    public Vuelo(int totTur, int ocuTur, int totBus, int ocuBus) {
        this.totTur = totTur;
        this.ocuTur = ocuTur;
        this.totBus = totBus;
        this.ocuBus = ocuBus;
    }

    public boolean ventaBilletes(int numBilletes, int tipoPlaza) {
        boolean hayBilletes;
        if (tipoPlaza == 1) {
            if (totTur - ocuTur >= numBilletes) {
                hayBilletes = true;
                ocuTur += numBilletes;
            } else {
                hayBilletes = false;
            }
        } else {
            if (totBus - ocuBus >= numBilletes) {
                hayBilletes = true;
                ocuBus += numBilletes;
            } else {
                hayBilletes = false;
            }
        }
        return hayBilletes;
    }

}
