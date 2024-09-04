package Searchingjava;

public class binarysearch {
    //By using Recursive Work
    static boolean recursiveBinarySearch(int[] a,int st,int end,int target){
        if(st>end)return false;
        int mid = st + (end - st)/2;
        if(target == a[mid]){
            return true;
        } else if (target < a[mid]) {
            return recursiveBinarySearch(a,st,mid-1,target);
        }
        else{
            return recursiveBinarySearch(a,mid+1,end,target);
        }

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int target = 0;
        while(target != 10){
            System.out.printf("%d exists in arr %b\n",target,recursiveBinarySearch(a,0,a.length-1,target));
            target++;
        }
    }
}

//public class binarysearch {
//    static boolean binarySearch(int[] a,int target){
//        int n = a.length;
//        int st = 0,end = n-1;
//        while(st<=end){
//            int mid = st + (end - st)/2;
//            if(target == a[mid]){
//                return true;
//            }
//            else if(target < a[mid]){
//                end = mid - 1;
//            }
//            else{
//                st = mid + 1;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
//        int target = 0;
//        while(target != 10){
//            System.out.printf("%d exists in arr %b\n",target,binarySearch(a,target));
//            target++;
//        }
//    }
//}
