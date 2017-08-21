package kuyruk;

// Kuyruk yapımızın bağlı liste tarzında veri yapısını oluşturuyoruz.

class Eleman {
    int sayi ;
    Eleman ileri ;
	
    public Eleman(int sayi) {
    this.sayi = sayi ;
    ileri = null;
    }        
}

public class Kuyruk {
    Eleman bas, son ;
    public Kuyruk() {
    son = bas = null ;    
    }
    
    // Eğer baş null gösteriyorsa boştur.
    boolean bosmu(){
        return bas==null;
    }
    
    
    void ekle(Eleman yeni) {
    // boş değilse ekleme yapıyoruz ( Kuyrukta hep sona eklenir.)
        if(!bosmu()){
            son.ileri = yeni ;
            son = yeni ;
        }
        else {
    // liste boşsa gelen ilk elemanı hem baş hem son yapıyoruz.
            bas = yeni ;
            son = yeni ;
        } 
    }
    
    Eleman cikar(){
        Eleman sonuc = bas ;
        // eğer liste doluysa baş artık bir sonraki elemanı gösterecek bu sayede baştan silmiş olacağız.(Kuyrukta ilk giren ilk çıkar.)
        if(!bosmu()){
            bas = bas.ileri;
        }
        // Eğer liste zaten boşsa sonu null yap.
        if(bas==null) {
            son = null;
        }
        return sonuc ; // baştan çıkan elemanı gösteriyoruz.
    }
    
}