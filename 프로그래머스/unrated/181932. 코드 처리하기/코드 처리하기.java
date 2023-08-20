class Solution {
    public String solution(String code) {
        
        String answer = "";
        int idx = 0;
        int mode=0;
        String ret="";
        
        for (idx = 0; idx < code.length(); idx++) {		
        	if (mode == 0) {
        		if(!(code.charAt(idx)=='1')) {
        			if(idx%2==0) ret = ret + code.charAt(idx);
        		}else if (code.charAt(idx)=='1') {
        			mode=1;
        		}//if
        	} else if (mode == 1) {
        		if (!(code.charAt(idx)=='1')) {
        			if (idx%2==1) ret = ret + code.charAt(idx); 
        		} else if (code.charAt(idx)=='1') {
        			mode=0;
                }//if		
        	}else if (ret.equals(null)){
        		ret="EMPTY";
        	}      
        }//for
         return ((ret != "")? ret : "EMPTY");
    }
}