public class day13{
    public int singlenumber(int[] nums){
        int result=0;
        for(int i=0;i<nums.length;i++){
result=result^nums[i];

        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        day13 obj=new day13();
        int result=obj.singlenumber(nums);
        System.out.println("Single number is: " + result);
    }
}