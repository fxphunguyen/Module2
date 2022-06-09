package search;

public class BinarySearch {
    static int[] arr = {2, 4, 7, 10, 11, 45};

    static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key == arr[mid]) {
                return mid;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(arr, 50));
        System.out.println(binarySearch(arr, 11));
        System.out.println(binarySearch(arr, 90));

    }
}






//B1: lay diem xuat phat va diem ket thuc
// start = 0, end = arr.lengt-1
//B2: tim mid: (start + end)/2
//    int low = 0;
//    int high = arr.length - 1;
//        while (high >= low) {
//                int mid = (low + high) / 2;
//                if (key < arr[mid])
//        high = mid - 1;
//        else if (key == arr[mid])
//        return mid;
//        else
//        low = mid + 1;
//        }
//        return -1;
