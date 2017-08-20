package doublylinkedlist;
// Her bir elemanımızın veri yapısını oluşturuyoruz.
class Eleman{
    int sayi ;
    Eleman ileri;
    Eleman geri ;
    public Eleman(int sayi){
        this.sayi = sayi;
        this.ileri = null;
        this.geri = null;
    }
}
public class DoublyLinkedList {
// Elemanlarımızı Çift Yönlü Bağlı Listede tutuyoruz.
    Eleman bas ;
    Eleman son ;

    public DoublyLinkedList() {
    // ilk başta boş olarak tanımlıyoruz.
    bas = null ;
    son = null ;
    }
    
    public void basaEkle(Eleman yeni){
        // Eğer hiç eleman yoksa yeni gelen Eleman hem başı hem sonu gösteriyor.
        if(bas == null){
            bas = yeni ;
            son = yeni ;
        }
        else {
        // Eğer varsa yeni gelen elemanın ilerisi başı, başın gerisi yeni elemanı , baş'ta artık yeni elemanı göstererek başa ekleme yapmış oluyoruz.
            yeni.ileri = bas ;
            bas.geri = yeni ;
            bas = yeni ;
        }
    }
    
    public void sonaEkle(Eleman yeni){
        // Eğer hiç eleman yoksa yeni gelen Eleman hem sonu hem başı gösteriyor.
        if(bas == null){
            bas = yeni ;
            son = yeni ;
        }
        else {
        // Eğer varsa yeni gelen elemanın gerisi sonu, sonun ilerisi yeni elemanı , son'da artık yeni elemanı göstererek sona ekleme yapmış oluyoruz.    
            yeni.geri = son ;
            son.ileri = yeni ;
            son = yeni ;
        }
    }
    
    public void bastanSil(){
        // Eğer baştaki elemanın ilerisi boşsa tek eleman varsa bas == son'dur bu yüzden sonu null yaparak tek elemanı siliyoruz.
        if(bas.ileri == null){
            son = null;
        }
        else {
        // Eğer bir çok eleman varsa , baştak elemanın ilerisinin gerisi artık 'null' gösterecek ve baş bir sonraki elemanı gösterdiğinde o
        // elemanı kaybetmiş(silmiş) olacağız.
            bas.ileri.geri = null;
            bas = bas.ileri;
        }
    }
    
    public void sondanSil(){
        // Eğer baştaki elemanın ilerisi boşsa tek eleman varsa bas == son'dur bu yüzden başı null yaparak tek elemanı siliyoruz.
        if(bas.ileri == null){
            bas = null ;
        }
        else {
        // Tek eleman değilse son elemanın gerisinin ilerisi artık 'null' gösterecek. 
        // Bu sebeble son bir önceki elemanı gösterdiğinde sondan silme işlemini gerçekleştirmiş olacağız.(Bağı kopartma işlemi yapıyoruz.)
            son.geri.ileri = null;
            son = son.geri;
        }
    }
    
    public void arayaEkle(int nereye,Eleman ekleneceksayi){
        /*
        Bu metod ile birlikte liste içinde aradığımız elemana kadar gidip o elamanı bulduktan sonra 
        hemen arkasına eklemek istediğimiz elemanı ekliyoruz.
        */
        Eleman yedek = bas;
        while(yedek.sayi != nereye){
            yedek = yedek.ileri ;
            if(yedek == null){
                System.out.println("Hiç Eleman yok");
            }
        }
        if (yedek == son){
            ekleneceksayi.ileri = null ;
            son = ekleneceksayi;
        }
        else {
            ekleneceksayi.ileri = yedek.ileri ;
            yedek.ileri.geri = ekleneceksayi;
        }
        ekleneceksayi.geri = yedek ;
        yedek.ileri = ekleneceksayi ;
    }
    
    public void girilenSil(int aranan) {
        // Aranan elemana kadar gezinme işlemi yapıp.sonrasında aranan elemanın gerisinin ilerisi artık aranan elemanın ilerisini gösterdiğinde
        // aradığımız elemanı gösteren bağları kopartmış oluyoruz bu sebeble silinmiş/kaybolmuş oluyor.
        Eleman yedek = bas;
        while(yedek.sayi != aranan){
            yedek = yedek.ileri;
            if(yedek == null){
                System.out.println("Boş");
            }
        }
        if (yedek == bas) {
            bas = yedek.ileri ;
        }
        else {
            yedek.geri.ileri = yedek.ileri;
        }
    }
    
    String listele(){
        Eleman yedek = bas;
        String liste = "";
        while (yedek!=null){
            liste = liste + yedek.sayi + "-->";
            yedek = yedek.ileri;
        }
        return liste;
    }
    
    public static void main(String[] args) {
        DoublyLinkedList liste = new DoublyLinkedList(); // Liste sınıfından liste adında nesne oluşturuyoruz.
        Eleman yeni = new Eleman(5); // Yeni bir eleman oluşturuyoruz.
        liste.basaEkle(yeni); // başa ekleme yapıyoruz.
        yeni = new Eleman(6); // yeni bir eleman daha oluşturuyoruz.
        liste.sonaEkle(yeni); // sona ekleme yapıyoruz.
        yeni = new Eleman(12);
        liste.arayaEkle(5, yeni); // Listemizde bulunan 5 elemanından sonraya 12 sayısını eklemek istiyoruz.
        System.out.println(liste.listele());
    }
    
}
