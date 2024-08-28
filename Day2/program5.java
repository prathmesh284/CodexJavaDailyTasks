class Codex{
    public static void main(String[] args) {
        int i=1;
        while(i<=20){
            if(i%3==0 && i%7==0){
                System.out.println(i+" is divisible by 3 and 7");
            }
            i++;
        }
    }
}