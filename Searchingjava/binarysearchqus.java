package Searchingjava;

public class binarysearchqus {
    //Qus 1:Find the Square root

    static int findSquareRoot(int x){
        int st = 0,end = x;
        int ans = -1;
        while(st<=end){
            int mid = st + (end - st)/2;
            int val = mid * mid;
            if(val == x){
                return mid;
            }
            else if(val<x){
                st = mid + 1;
                ans = mid;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 24;
        System.out.println(findSquareRoot(x));

    }
}

////Qus 1:Find the first occurrence of a given element x,given that the given Array is sorted.If no occurrence of x is found then return -1.
//static int findOccurrences(int[] a,int x){
//    int n = a.length;
//    int st = 0,end = n-1;
//    int fo =-1;
//    while(st<=end){
//        int mid = st + (end-st)/2;
//        if(x==a[mid]){
//            fo = mid;
//            end = mid-1;
//        } else if (x < a[mid]) {
//            end = mid - 1;
//
//        }
//        else{
//            st = mid + 1;
//        }
//    }
//    return fo;
//}
//public static void main(String[] args) {
//    int[] a = {5,5,5,6,7,5};
//    int x = 5;
//    System.out.println(findOccurrences(a,x));
//
//}
//}
