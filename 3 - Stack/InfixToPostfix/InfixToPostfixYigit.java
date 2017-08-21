package stack;

class InfixToPostfixYigit {
    int max;
    int top;
    char [] a;
    public InfixToPostfixYigit(int max) {
    this.max = max ;
    a = new char[max];
    top = -1;
    }
    boolean bosmu(){
        return top==-1;
    }
    boolean push(char x){
        if(top>= max){
            System.out.println("Yığıt dolu");
            return false;
        }
        else {
            a[++top] = x ;
            return true;
        }
    }
    
    char pop(){
        if(top <0){
            System.out.println("Yığıt boş");
            return 0;
        }
        else {
            char x = a[top--];
            return x ;
        }
    }    
}
