class Codex{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr_copy=arr;
        System.out.print("Elements in copy of array:");
        for(int i=0;i<arr_copy.length;i++){
            System.out.print(arr_copy[i]+" ");
        }
    }
}