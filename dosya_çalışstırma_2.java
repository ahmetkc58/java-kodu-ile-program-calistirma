/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders2__workingWithFiles;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class dosya_çalışstırma_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec("spotify.exe");// bir dosya dedğilde program çalıştıracaksak bu şekilde çalıştırıyoruz
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            process.waitFor();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}
