package linkedlist;
// Her bir elemanımızın veri yapısını oluşturuyoruz.
class Eleman{
    int sayi ;
    Eleman ileri;    
    public Eleman(int sayi){
        this.sayi = sayi;
        this.ileri = null;
    }
}

// Elemanlarımızı Tek Yönlü Bağlı Listede tutuyoruz.
public class LinkedList {
    Eleman bas; // Baştaki elemanı tutuyoruz.
    Eleman son; // Sondaki elemanı tutuyoruz.
    
    public LinkedList(){
        bas=null; // ilk başta boş tanımlıyoruz.
        son=null;         
    }
    
    public void basaEkle(Eleman yeni){
        // Eğer hiç eleman yoksa yeni gelen Eleman hem başı hem sonu gösteriyor.
        if(bas==null){ 
            bas = yeni ;
            son = yeni ;           
        }
        // Eğer daha önceden eleman varsa yeni gelen eleman başı gösteriyor ve artık baş o oluyor.
        else {
            yeni.ileri = bas ;
            bas = yeni ;
        }
    }
    
    public void sonaEkle(Eleman yeni){
        // Eğer hiç eleman yoksa yeni gelen Eleman hem başı hem sonu gösteriyor.
        if(bas==null){
            bas = yeni ;
            son = yeni ;            
        }
        else {
        // Eğer daha önceden eleman varsa yeni gelen eleman sonu gösteriyor ve artık son o oluyor.
            son.ileri = yeni ;
            son = yeni ;
        }
    }
        
    /* Bu metod ile birlikte liste içinde aradığımız elemana kadar gidip o elamanı bulduktan sonra 
    hemen arkasına eklemek istediğimiz elemanı ekliyoruz.
    */
    public void arayaEkle(Eleman yeni,int aranan){
        Eleman gecici = bas ;
        while(gecici.ileri!=null){
            if(gecici.sayi==aranan){
                yeni.ileri = gecici.ileri ;
                gecici.ileri = yeni ;
                break;
            }
            else {
                gecici = gecici.ileri ;
            }
            
        }
    // Eğer sondaysa aradığmız eleman sona ekleme yapıyoruz.
        if(gecici == son && gecici.sayi == aranan){
            son.ileri = yeni ;
            son = yeni;
        }
    }
    
    // baş bir sonraki elemanı gösterdiğinde o elemanı artık kaybetmiş(silmiş) oluyoruz.
    public void bastanSil(){
        bas = bas.ileri ;
        if(bas == null){
            son = null ;
        }        
    }
    
     /*
    Son'dan önceki elemanı son yaparak sondaki elemanı silmiş oluyoruz.
    Sondan önceki elemanada gezinme yaparak gidiyoruz.
    */
    public void sondanSil(){
        Eleman gecici = bas ;
        Eleman once = null;
        while(gecici != son){
           once = gecici ;
           gecici = gecici.ileri;
        }        
        if(once == null){
            bas = null;
        }
        else {
            once.ileri = null ;
            son = once ;
        }
    }
        
    /*
    Aradığımız elemanı bulduğumuzda öncesinde bulunan elemanla aradığımız elemanın bir sonraki elemanı
     arasındaki bağlantıyı yaparak aradığımız elemanı silmiş oluyoruz.
    */
    public void arananSil(int aranan){
        Eleman yedek = bas ;
        Eleman once = null ;
        
        while(yedek!=null){
            if(yedek.sayi == aranan){
                break;
            }
            else {
                once = yedek ;
                yedek = yedek.ileri;
            }
        }
        if(once == null){
            bas = bas.ileri;
        }
        else if(once !=null){
            once.ileri = yedek.ileri;
        }
    }
    
    /*
    Eğer her yeni gelen eleman sıralı bir şekilde eklensin istiyorsak(Küçükten büyüğe)
    Bu şekilde bir yol izlememiz gerekmekte.
    */
    void siraliEkleyelim(Eleman yeni){
        if(bas == null){
            bas = yeni;
        }
        else {
            Eleman yedek = bas;
            Eleman once = null ;
            
            // Gezinme işleminde kullandığımız 'yedek' değişkeni boş olmadığı ve yeni gelen sayımız bir önceki elemandan büyük olduğu sürece
            // bu döngü içerisine girecek.
            while(yedek!=null && yedek.sayi < yeni.sayi){
                if(yedek.sayi < yeni.sayi){
                    once = yedek ;
                    yedek = yedek.ileri;
                }
                else break ;
            }
            if (once == null){
                yeni.ileri = yedek ;
                bas = yeni ;
            }
            
            // Eğer daha önceden bir eleman varsa yeni gelen elemanın ilerisi artık bir önceki elemanın ilerisini gösterecek
            // bir önceki elemanın ileriside artık yeni eleman olacağından dolayı bir nevi 'araya ekleme' olacak.
            else {
                yeni.ileri = once.ileri ;
                once.ileri = yeni;
            }
        }
    }
    
    // Burada ilk elemandan başlayıp son eleman boş olana kadar gezinip tek tek hepsini bir String'e atıyoruz.
    String listele(){
        Eleman yedek = bas;
        String liste = "";
        while(yedek!=null){
            liste = liste + yedek.sayi + "-->";
            yedek = yedek.ileri ;            
        }
        return liste;
    }

    public static void main(String[] args) {
       LinkedList liste = new LinkedList(); // Liste sınıfından liste adında nesne oluşturuyoruz.
       Eleman a = new Eleman(5); // Yeni bir eleman oluşturup 
       liste.basaEkle(a); // 'başa ekleme' yapıyoruz.
       a = new Eleman(9); // yeni bir eleman daha oluşturup 'sona ekleme' yapıyoruz.
       liste.sonaEkle(a);
       a = new Eleman(35); // yeni bir eleman oluşturup hangi elemandan sonra ekleneceğini belirtip 'araya ekleme' yapıyoruz.
       liste.arayaEkle(a, 5);
       liste.sondanSil(); // sondaki elemanı siler.
        System.out.println(liste.listele()); // listelemizdeki tüm elemanları konsol'a basar.
        
    }
    
}
