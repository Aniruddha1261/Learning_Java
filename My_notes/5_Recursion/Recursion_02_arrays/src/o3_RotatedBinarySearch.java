import javax.xml.stream.events.StartDocument;
import java.awt.image.renderable.RenderableImage;

public class o3_RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(RotatedBinarySearch(arr, 2, 0, arr.length - 1));
    }

    // Case no 1: if arr[start] <= arr[mid]
      // if key >= arr[start] && key <= arr[mid]
             // end = mid - 1
      // else
             // start = mid + 1

    // Case no 2: if arr[start] !< mid
      // if key >= arr[mid] && key <= arr[end]
             // start = mid + 1

    //Case no 3:
             // end = mid -1

    static int RotatedBinarySearch(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if (arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return RotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                return RotatedBinarySearch(arr, target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return RotatedBinarySearch(arr, target, mid + 1, end);
        }
        return RotatedBinarySearch(arr, target, start, mid - 1);
    }
}
