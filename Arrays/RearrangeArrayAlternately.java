class Solution {
    public static void rearrange(int arr[]) {
        Arrays.sort(arr); //menatory
        int n = arr.length;
        int min = 0, max = n-1;
        int  m = arr[n-1]+1;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                arr[i]+= (arr[max--]%m)*m;
            }else{
                arr[i]+= (arr[min++]%m)*m;
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = arr[i]/m;
        }
    }
}
