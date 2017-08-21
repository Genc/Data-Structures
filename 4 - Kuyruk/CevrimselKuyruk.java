package kuyruk;

// Kuyruk ile aynı yapıda. Bu sefer sabit dizi şeklinde bir veri yapısı tanımladım.

class CevrimselKuyruk {
    int [] dizi ;
    int bas,son,N;
    
    CevrimselKuyruk(int N){
		
        dizi = new int[N];
        this.N = N;
        bas = son = 0 ;
    }
    
    // eğer baştaki elaman ile sondaki elemanın bir sonraki elemanının toplam boyut ile modundan kalan sayılar eşitse kuyruk doludur.
    // bu demek oluyorki kapasite taşmasın. Yani 5 = 5 olduysa doludur.
    boolean dolu(){
        return bas==(son+1)%N;
    }
    
    // baştaki ve sondaki değişkenler aynı yeri gösteriyorsa boştur(0==0)
    boolean bos(){
        return bas==son;
    }
    
    // Ekleme yaparken dolu olup olmadığını kontrol edip dizinin sonuna ekleme yapıyoruz ve sonu 1 arttırıyoruz. 
    void Ekle(int d){
        if(!dolu()){
            dizi[son] = d;
            son = (son+1)%N;
        }
    }
    
    // Silme işlemi yaparken eğer boş değilse dizinin başı artık bir sonraki elemanı gösterecek bu şekilde baştaki elemanı silmiş oluyoruz.
    int sil(){
        int sonuc = 0;
        if(!bos()){
            sonuc = dizi[bas];
            bas = (bas+1) % N ;            
        }
        return sonuc ;
    }
}
