class Solution {
    public int solution(int[] num_list) {
		int a = 1;
		int b = 0;
		int answer = 0;
        
		for (int i = 0; i < num_list.length; i++) {
			a = a * num_list[i];
			b = b + num_list[i];					
		} //for		
        
		if(a<b*b) answer = 1;
		else answer = 0;
        
        return answer;
    }
}