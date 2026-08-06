public class day12{
    public int[] plusone(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;

        }
        int[] result=new int[digits.length+1];
        result[0]=1;
        return result;
    }
    public static void main(String[] args){
        int[] digits={9,9,9};
        day12 obj=new day12();
        int[] result=obj.plusone(digits);
        System.out.print("Result: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}