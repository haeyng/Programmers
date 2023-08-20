class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
	    //문자열 비교는 == 대신 equals 사용
		if (ineq.equals(">")) {        	        
            if(eq.equals("=")){
                return n>=m ? 1 : 0;
            }else if(eq.equals("!")){
                return n>m ? 1 : 0;
            }
		} else if (ineq.equals("<")) {		          
            if(eq.equals("=")){
                return n<=m ? 1 : 0;
            }else if(eq.equals("!")){
                return n<m ? 1 : 0;
            }
        }//if     
        return 0;
    }
}
