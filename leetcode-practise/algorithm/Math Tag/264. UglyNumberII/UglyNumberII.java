class Solution {
    //1.DP Solution TC: O(n) SC: O(n)
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        //分别记录下2、3和5的倍数的将要进行下一步比较的值
        int index2=0,index3=0,index5=0;
        arr[0]=1;
        for(int i=1;i<n;i++){
            //比较下一个最小的值是2、3还是5的倍数
            arr[i]=Math.min(arr[index2]*2,Math.min(arr[index3]*3,arr[index5]*5));
            //更新2、3和5的倍数的当前值
            if(arr[i]==arr[index2]*2)
                index2++;
            if(arr[i]==arr[index3]*3)
                index3++;
            if(arr[i]==arr[index5]*5)
                index5++;
        }
        return arr[n-1];
    }
}