package stack;

// infix ifadeyi postfix'e dönüştürme.
public class InfixToPostfix {
    // öncelik adında bir değilken tanımlıyoruz ve '+ ya da -' ise önceliği 1
    // '* yada /' ise önceliği 2, '^' üst alma ise önceliği 3 diyerek önceliklerimizi belirtiyoruz.
    int oncelik(char ch){
        switch(ch){
            case '+' :
            case '-' : return 1;
            case '*' :    
            case '/' : return 2;
            case '^' : return 3;
        }
        return -1;
    }
    String infixToPostfix(String ifade){
        String sonuc = "";
        InfixToPostfixYigit y = new InfixToPostfixYigit(200);
        
        /*
        200 boyutlu bir yığıt oluşturup girilen ifadenin sonana kadar gidip okumaya başlıyoruz.
        ifademizin ilk başını alıp bir karaktere atıyoruz sonra bu karakter eğer sayı yada harfse sonuc ifademize yazdırıyoruz.
        eğer parantez açma varsa hiç bir koşulama bakılmadan direk stack'e ekleme yapıyoruz.
        eğer parantez kapatma varsa çıkarma işlemine başlıyoruz.Taki parantez açma görene kadar.
        */        
        
        for (int i = 0; i < ifade.length(); i++) {
            char c = ifade.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sonuc+=c;
            }
            else if(c=='('){
                y.push(c);
            }
            else if (c==')'){
                char ust = y.pop();
                y.push(ust);
                while(!y.bosmu() && ust != '('){
                    sonuc += y.pop();
                    ust = y.pop();
                    y.push(ust);
                }
                ust = y.pop();
                y.push(ust);
                if(!y.bosmu() && ust != '('){
                    return "yanlış operatör";
                }
                else y.pop();
            }
            else { //bir operatör varsa
                char ust = y.pop();
                y.push(ust);
                while(!y.bosmu() && oncelik(c) <= oncelik(ust)){
                    sonuc += y.pop();
                    ust = y.pop();
                    y.push(ust);
                }
                
                y.push(c);
            }
        }
        while(!y.bosmu()){
            sonuc += y.pop();
        }
        
        return sonuc;
    }
    public static void main(String[] args) {
		
        InfixToPostfix d = new InfixToPostfix();
        String sonuc = "(a+b)*(c*(d-e))";
        System.out.println(d.infixToPostfix(sonuc));
    }
}
