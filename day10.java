public class day10{
    public int removeElement(int[] num,int val){

int k=0;
for(int i=0;i<num.length;i++){
    if(num[i]!=val){
        num[k]=num[i];
        k++;

    }
    
}
return k;

    }
    public static void main(String[] args){
    int[] num={3,2,4,2,3};
    int val=3;
    day10 obj=new day10();
    int k = obj.removeElement(num, val);

System.out.println("k = " + k);

for (int i = 0; i < k; i++) {
    System.out.print(num[i] + " ");
}
    



}

}
