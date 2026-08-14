import java.util.*;
public class day20{
    public void movezeros(int[] nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        while(index<nums.length){
            nums[index]=0;
            index++;

        }
    }
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        day20 obj=new day20();
        obj.movezeros(nums);
        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
    }
}