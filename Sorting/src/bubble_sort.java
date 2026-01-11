public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={13,1,45,2,54,78};
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){
            boolean isSwapped=false;
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
