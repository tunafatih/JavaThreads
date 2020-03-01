/**
*
* Fatih Tuna    fatih.tuna2@ogr.sakarya.edu.tr
* 1 Mayıs 2019
* <p>
* Birler basamağının toplandığı sınıf
* </p>
*/
package odev4.pkg1;


public class Birler implements Runnable{
    String data;
    
    public Birler(String data){
        this.data = data;
    }
    
    @Override
    public void run() {
      int birlerToplam = 0;
        for(int i=3;i<data.length();i=i+6){
          birlerToplam += Integer.parseInt(data.substring(i,i+1));
        }
        
    }
    
}

