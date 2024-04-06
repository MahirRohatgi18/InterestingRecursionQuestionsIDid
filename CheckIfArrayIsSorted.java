public class CheckIfArrayIsSorted {
    public static boolean isSorted(int arr[], int idx){
        if (idx == arr.length-1){
            return true;
        }

        if (arr[idx] < arr[idx+1]){
            // array is sorted till now
           return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }
}
