class Codex{
    public static void main(String[] args) {
        char a='A';
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
            }
            System.out.println();
            a++;
        }
    }
}
