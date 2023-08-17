class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab;
        String ba;
        
        ab = Integer.toString(a) + Integer.toString(b);
        ba = Integer.toString(b) + Integer.toString(a);
        if (Integer.valueOf(ab)>Integer.valueOf(ba)) {
        	answer = Integer.valueOf(ab);
		}else{
			answer = Integer.valueOf(ba); 
		} // if      
        
        return answer;
    }
}