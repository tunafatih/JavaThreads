# JavaThreads
Java Threads Üzerine Bir Uygulama

Bu projede eşzamanlılık kullanılarak bir dosyanın okunması ve basamaklarının toplanması, seri ve paralel hesaplamalarda
oluşan zaman farklılığının gösterilmesi işlemleri yapılmıştır. Projede ilk olarak sayilar.txt dosyası okunur. Daha sonra seri toplama için main fonksiyonunda basamakları ayrı ayrı for döngüsü kullanarak toplanır ve geçen süre hesaplanır. Paralel hesaplama için
ayrı ayrı sınıflarda threadler oluşturuldu. Birler, onlar, yüzler, binler basamakları ayrı ayrı sınıflarda paralel olarak toplandı.
Daha sonra bir havuz oluşturarak paralel olarak geçen zamanı hesaplandı ve son olarak ekrana yazdırıldı. Projede küçük
dosyalarda seri toplama süresi daha kısayken dosya büyüdükçe paralel toplama süresi çok daha kısa oluyor.
