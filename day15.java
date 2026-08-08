import java.util.*;
public class day15 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }

        }
        return result;
        
    }
    public static void main(String[] args) {
        day15 solution = new day15();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
        
    }
}