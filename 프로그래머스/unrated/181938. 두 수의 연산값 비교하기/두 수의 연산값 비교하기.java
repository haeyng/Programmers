class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = a+""+b ;
        
        if (Integer.valueOf(ab)>(2*a*b)){
        	answer = Integer.valueOf(ab);
		} else {
			answer = (2*a*b);
		}     
        
        return answer;
    }
}