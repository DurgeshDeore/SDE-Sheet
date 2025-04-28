class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.contains(target-num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
