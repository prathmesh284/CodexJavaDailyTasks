class Codex{
    public static void main(String[] args) {
        int a;
        a=0;
        Codex.check(a);
        a=1;
        Codex.check(a);
        a=-1;
        Codex.check(a);
    }   
    static void check(int a){
        if(a==0){
            System.out.println("Zero value="+a);
        }else if (a>0) {
            System.out.println("Positive number="+a);
        }else{
            System.out.println("Negative number="+a);
        }
    }
}