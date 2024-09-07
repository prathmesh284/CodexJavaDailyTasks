class Codex{
    public static void main(String[] args) {
        for(int i=4;i>=1;i--){
            char ch1='A';
            char ch2='a';
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(ch1+" ");
                    ch1++;
                }else{
                    System.out.print(ch2+" ");
                    ch2++;
                }
            }
            System.out.println();
        }
    }
}