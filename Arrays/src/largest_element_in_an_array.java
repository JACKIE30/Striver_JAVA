public class largest_element_in_an_array {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        int max=arr[0];
        for(int num: arr){
            if(num>max) max=num;
        }
        System.out.println(max);
    }
}
