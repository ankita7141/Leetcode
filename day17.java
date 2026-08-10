public class day17{
    public static int countMatch(String[][] items,String rulekey,String rulevalue){
        int count=0;
        for(int i=0;i<items.length;i++){
            if(rulekey.equals("type") && items[i][0].equals(rulevalue)){
                count++;
            }
            else if(rulekey.equals("color") && items[i][1].equals(rulevalue)){
                count++;
            }
            else if(rulekey.equals("name") && items[i][2].equals(rulevalue)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String[][] items={
            {"phone","blue","pixel"},
            {"computer","silver","lenovo"},
            {"phone","gold","iphone"},
            {"computer","gold","macbook"}
        };
        System.out.println(countMatch(items,"color","gold"));
    }
}