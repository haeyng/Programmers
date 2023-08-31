class Solution {
    public int[] solution(int[] arr, int[][] queries) {
     
		for (int i = 0, temp = 0; i < queries.length; i++) {
			temp = arr[queries[i][0]]; 
			arr[queries[i][0]] = arr[queries[i][1]]; 
			arr[queries[i][1]] = temp;
		} // for
        return arr;
    }
}