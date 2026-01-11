public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={13,1,45,2,54,78};
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
