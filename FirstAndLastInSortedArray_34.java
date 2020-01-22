package medium;

public class FirstAndLastInSortedArray_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 6;
		int[] ans = searchRange(nums,target);
		System.out.println(ans[0] + " , " +ans[1]);
	}
	public static int[] searchRange(int[] nums, int target) {
        int first=-1, last=-1;
        int mid,low =0, high = nums.length -1;
        // find first
         while(low<= high){
            mid = low + (high-low)/2;
            if(target == nums[mid]){
                first= (first==-1)? mid:Math.min(first, mid);
                high = mid-1;
            }else if(target < nums[mid]){ //ignore greater side
               high = mid-1; 
            }else{ //ignore lower side
                low = mid+1;
            }
        }
        low =0; high = nums.length -1;
        // find last
         while(low<= high){
            mid = low + (high-low)/2;
            if(target == nums[mid]){
                last= (last==-1)? mid:Math.max(last, mid);
                low = mid+1;
            }else if(target < nums[mid]){ //ignore greater side
               high = mid-1; 
            }else{ //ignore lower side
                low = mid+1;
            }
        }
        
        int[] res = {first, last};
        return res;
    }  
}
