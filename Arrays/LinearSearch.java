class Solution {
    public int search(int arr[], int x) {
        // code here
        for(int idx=1;idx<arr.length;idx++){
            if(arr[idx]==x){
                return idx;
            }
        }
        return -1;
        
    }
}
