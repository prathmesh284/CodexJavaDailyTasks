class Codex{
    public static void main(String[] args) {
        int a;
        a=4;
        Codex.check(a);
        a=1;
        Codex.check(a);
    }
    static void check(int a){
        if(a%2==0){
            System.out.println(a+" is Even");
        }else{
            System.out.println(a+" is Odd");
        }
    }
}
