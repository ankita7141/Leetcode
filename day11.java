public class day11{
    public int searchInsert(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        int target=3;
        day11 obj=new day11();
        int i=obj.searchInsert(nums, target);
        System.out.println("The index of the target is: " + i);
    }
}