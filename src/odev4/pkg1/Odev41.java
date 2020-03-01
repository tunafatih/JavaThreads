/**
*
* Fatih Tuna    fatih.tuna2@ogr.sakarya.edu.tr
* 1 Mayıs 2019
* <p>
* Main Dosyası
* </p>
*/




package odev4.pkg1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Odev41 {
     public static String DosyaOku(String fileName)throws Exception // Dosya okuma metodu
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(fileName))); 
    return data; 
  } 
 
    public static void main(String[] args) throws Exception {
        
        
        
        String data = DosyaOku("Sayilar.txt");
        long baslangic1 = System.nanoTime();
        int birlerToplam = 0;
        for(int i=3;i<data.length();i=i+6){
          birlerToplam += Integer.parseInt(data.substring(i,i+1));
        }
        int onlarToplam = 0;
        for(int i=2;i<data.length();i=i+6){
          onlarToplam += Integer.parseInt(data.substring(i,i+1));
        }
        int yuzlerToplam = 0;
        for(int i=1;i<data.length();i=i+6){
          yuzlerToplam += Integer.parseInt(data.substring(i,i+1));
        }
        int binlerToplam = 0;
        for(int i=0;i<data.length();i=i+6){
          binlerToplam += Integer.parseInt(data.substring(i,i+1));
        }
        long bitis1 = System.nanoTime();
        double sure1 = (bitis1-baslangic1)/1000000.0;
        System.out.println("Sonuc: " + binlerToplam + "" + yuzlerToplam + "" + onlarToplam + "" + birlerToplam);
       
        
        ExecutorService havuz = Executors.newFixedThreadPool(4);
        long baslangic = System.nanoTime(); 
        havuz.execute(new Birler(data));
        havuz.execute(new Onlar(data));
        havuz.execute(new Yuzler(data));
        havuz.execute(new Binler(data));
        havuz.shutdown();
        while(!havuz.isTerminated()){ }
        long bitis = System.nanoTime();
        double sure = (bitis-baslangic)/1000000.0;
        
        
       
        System.out.println("\nSeri Hesaplanma Süresi " + sure1 + " milisaniye.");
        System.out.println("\nParalel Hesaplanma Süresi " + sure + " milisaniye.");

        
    }
    
}
