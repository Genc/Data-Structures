package stack;

// Bu yapıda Bir öğrencinin Adını ve Numarasını tutan yapı.
// Bir önceki stack yapısı ile hemen hemen aynı değişiklik gösteren tek yanı bu bir sabit dizi değil :)

class Ornek{
    int no ;
    String ad;

    public Ornek(int no,String ad) {
    this.no = no ;
    this.ad = ad ;
    }
}

public class Stack2 {
	
    Ornek [] d ;
    int ust ;
    int N;

    public Stack2(int N) {
    this.N = N ;
    d = new Ornek[N];
    ust = -1;
    }
    
    boolean dolumu(){
        return ust==N-1;
    }
    boolean bosmu(){
        return ust==-1;
    }
    
    void push(Ornek o){
        if(!dolumu()){
            ust = ust +1 ;
            d[ust] = o ;
        }
    }
    
    Ornek pop(){
        if(!bosmu()){
            ust = ust - 1 ;
            return d[ust+1];
        }
        return null;
    }
    
    public static void main(String[] args) {
        Stack2 y = new Stack2(5);
        Ornek o = new Ornek(1,"Ömer");
        y.push(o);
        o = new Ornek(2,"Faruk");
        y.push(o);
        o = new Ornek(3,"Genç");
        y.push(o);
        o = y.pop();
        System.out.println(o.no + " " + o.ad);
    }
}
