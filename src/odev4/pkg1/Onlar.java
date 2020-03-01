/**
*
* Fatih Tuna    fatih.tuna2@ogr.sakarya.edu.tr
* 1 Mayıs 2019
* <p>
* Onlar basamağının toplandığı sınıf
* </p>
*/
package odev4.pkg1;

public class Onlar implements Runnable{
    String data;
    
    public Onlar(String data){
        this.data = data;
    }
    
    @Override
    public void run() {
      int onlarToplam = 0;
        for(int i=2;i<data.length();i=i+6){
          onlarToplam += Integer.parseInt(data.substring(i,i+1));
        }
        
    }
    
}