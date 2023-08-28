public class BinarySearch {
    public static int search(int lo, int hi, int val, int[] arr){
        if(lo > hi){
            return -1;
        }
        int mid = (lo + hi)/2;
        if(arr[mid] > val) return search(lo, mid - 1, val, arr);
        if(arr[mid] < val) return search(mid + 1, hi, val, arr);
        return mid;
    }
}
