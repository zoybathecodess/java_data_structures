import java.util.Arrays;
public class sorting {
    public static void bubbleSort(int [] arr){
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-2-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j]; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int []arr){
   
        for(int i=0; i<arr.length;i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
             
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        Arrays.sort(arr);

        printArray(arr);
    }
}
