public class DistributesChocolates {

    static boolean isDivisionPossible(int[] a,int m,int maxChocolate){
        int numofStudents = 1;
        int chocolate = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]>maxChocolate)return false;
            if(chocolate + a[i]<=maxChocolate){
                chocolate+=a[i];
            }else{
                numofStudents++;
                chocolate = a[i];

            }
        }
        return numofStudents<=m;
    }

    static int distributechocolate(int[] a,int m){
        int n = a.length;
        if(a.length<m)return -1;
        int st = 1,end = (int) 1e9;
        int ans = 0;
        while(st<=end){
            int mid = st + (end - st)/2;

            if(isDivisionPossible(a,m,mid)){
                ans = mid;
                end = mid - 1;
            }else{
                st = mid + 1;
            }

        }
        return ans;
    }


    public static void main(String[] args) {
    int[] a = {12,34,67,90};
    int m = 2;
        System.out.println(distributechocolate(a,m));

    }
}
