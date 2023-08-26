class Solution {
    public int solution(int[] num_list) {
		int answer = 0;
		String oddNumber = "";
		String evenNumber = "";
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i]%2==1) {
				oddNumber += Integer.toString(num_list[i]);
			} else {
				evenNumber += Integer.toString(num_list[i]);		
			} //if              
		} //for			
        answer = Integer.valueOf(evenNumber) + Integer.valueOf(oddNumber);
        return answer;
    }
}