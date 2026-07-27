class Solution {
    public int romanToInt(String s) {
        
        int total = 0;

        for(int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));

            
            if(i + 1 < s.length()) {
                int next = getValue(s.charAt(i + 1));

                if(current < next) {
                    total -= current; 
                } else {
                    total += current; 
                }
            } else {
                total += current;
            }
        }

        return total;
    }

    public int getValue(char ch) {
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        return 0;
    }
}