public class Arrays {
    public static void main(String args[]){
        int min,max=0;
        int[] arr = new int[10];
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for(int i : arr){
            arr[i]++;
        }
        for(int i : arr){
            System.out.println(i);
        }
        for (int i: arr1){
            if (i > max ){
                max = i;
            }
        }
        System.out.println(max);
    }
    int[] arr1 = new int[10];

}
