package stack;

// Yeni bir stack(yığıt) oluşturuyoruz.
public class Stack {
    int kapasite ;
    int []s ;     // Dizi şeklinde tutacağız.
    int ust ;     // üst adında bir değişken tutup bununla sınırlarımızı belirleyip/kontrol edeceğiz.  

    public Stack(int kapasite) {
    this.kapasite = kapasite;
    s = new int[kapasite]; // dışarıdan girilen boyutla dizimizi oluşturduk.
    ust = -1 ; // sınırımızı -1 tutuyoruz ilk başta.
    }
    
    // Yığıtımızın dolu olup olmadığını bu şekilde kontrol ediyoruz.
    // Burada amacağımız eğer -1=-1 olmadığı sürece dolu olacak.
    boolean dolumu(){
        if(ust==kapasite-1){
            return true;
        }
        else return false;
    }
    
    // Eğer tüm ekleme ve çıkarma işlemlerinin sonunda üst değişkenimiz hala -1 'i gösteriyorsa boştur.
    boolean bosmu(){
        return ust==-1;
    }
    
    // sınırımızı bir arttırıp gelen elemanı dizinin indisine ekliyoruz.(Eğer stack dolu değilse..)
    void push(int x){
        if(!dolumu()){
            ust = ust + 1 ;
            s[ust] = x;
        }
    }
    
    // Eğer stack dolu ise(boş değilse) sınırı azaltıp en tepedeki değeri bize göstermesini söylüyoruz.
    int pop(){
        if(!bosmu()){
            ust = ust - 1 ;
            return s[ust+1];
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
