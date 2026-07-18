class Solution {
    public int search(int arr[], int x) {
        
        for(int idx=0;idx<arr.length;idx++){
            if(arr[idx]==x){
                return idx;
            }
        }
       return -1;
        
    }
}
