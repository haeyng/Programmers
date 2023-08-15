import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char [] ch = a.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            
            if(Character.isLowerCase(ch[i])){
                ch[i] = Character.toUpperCase(ch[i]);
            }else if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }//if            
            
        }//for
        System.out.print(ch);
        
    }//main
}//class