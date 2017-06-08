/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JProgressBar;

/**
 *
 * @author jquesadaabeijon
 */
public class HiloProgreso extends Thread {

    JProgressBar barra;
    private static final int intervalo = 25;

    public HiloProgreso(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        int minimo = barra.getMinimum();
        int maximo = barra.getMaximum();

        Runnable ejecutor = () -> {
            int valorActual = barra.getValue();
            barra.setValue(valorActual + 1);
        };

        for (int i = minimo; i < maximo; i++) {
            try {
                EventQueue.invokeAndWait(ejecutor);
                Thread.sleep(intervalo);
            } catch (InterruptedException | InvocationTargetException ex) {
            }
        }
    }

}
