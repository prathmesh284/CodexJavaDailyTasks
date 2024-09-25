class Codex{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print("a ");
                }else{
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }
}