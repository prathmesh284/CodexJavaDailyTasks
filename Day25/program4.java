class Codex{
    public static void main(String[] args) {
        int a=3;char ch='D',ch1;
        for(int i=1;i<=4;i++){
            ch1=ch;
            if(a>0){
                for(int j=a;j>0;j--){
                    System.out.print("  ");
                }
                a--;
            }
            for(int k=1;k<=i;k++){
                System.out.print(ch1+" ");
                ch1++;
            }
            System.out.println();
            ch--;
        }
    }
}