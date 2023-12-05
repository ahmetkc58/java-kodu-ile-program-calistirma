package ders2__workingWithFiles;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dosya_çalıştırma {

    public static void main(String[] args) throws InterruptedException {
        Process process = null;//işletim sisteminde bi işlem yapak istersek bu classı kullanmamız gerekmekte  
        try {
            process = Runtime.getRuntime().exec("notepad students3");
        } catch (IOException ex) {
            System.out.println("hata mesajınız:" + ex);
        }
        process.waitFor();// bu kod açılan pencerenin kapatılmasını bekler pencere kapatıldığında kodun devamını çalıştırır
        System.out.println("program penceresi kapatılmıştır");

        //  System.out.println("Çıkış kodu: " + process.exitValue());
    }
}
