/**
*
* Fatih Tuna    fatih.tuna2@ogr.sakarya.edu.tr
* 1 Mayıs 2019
* <p>
* Binler basamağının toplandığı sınıf
* </p>
*/
package odev4.pkg1;


public class Binler implements Runnable{
    String data;
    
    public Binler(String data){
        this.data = data;
    }
    
    @Override
    public void run() {
      int binlerToplam = 0;
        for(int i=0;i<data.length();i=i+6){
          binlerToplam += Integer.parseInt(data.substring(i,i+1));
        }
        
    }
    
}