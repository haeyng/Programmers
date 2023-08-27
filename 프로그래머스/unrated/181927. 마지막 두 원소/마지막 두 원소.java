import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        	
		int lastIndex = num_list.length-1;	
        
		int [] answer = Arrays.copyOf(num_list, lastIndex +2);	
		
			if(num_list[lastIndex] > num_list[lastIndex-1]) {	
                
				answer[lastIndex+1] = num_list[lastIndex] - num_list[lastIndex-1];
				
			}else if(num_list[lastIndex] <= num_list[lastIndex-1]) {
				answer[lastIndex+1] = 2 * num_list[lastIndex];						
			}			
		     
        return answer;
    }
}