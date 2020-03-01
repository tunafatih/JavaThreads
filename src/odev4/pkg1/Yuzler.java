/**
*
* Fatih Tuna    fatih.tuna2@ogr.sakarya.edu.tr
* 1 Mayıs 2019
* <p>
* Yuzler basamağının toplandığı sınıf
* </p>
*/
package odev4.pkg1;

public class Yuzler implements Runnable{
    String data;
    
    public Yuzler(String data){
        this.data = data;
    }
    
    @Override
    public void run() {
      int yuzlerToplam = 0;
        for(int i=1;i<data.length();i=i+6){
          yuzlerToplam += Integer.parseInt(data.substring(i,i+1));
        }
        
    }
    
}
