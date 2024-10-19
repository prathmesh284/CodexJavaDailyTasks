class Codex{
    public static void main(String[] args) {
        char ch='A';
        int a=3;
        for(int i=1;i<=4;i++){
            if(a>0){
                for(int k=a;k>0;k--){
                    System.out.print("  ");
                }
                a--;
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
            ch='A';
        }
    }
}