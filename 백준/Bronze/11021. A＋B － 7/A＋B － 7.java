import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); 			
		int sum = 0;
		int num = 1;		
		for (int i = 0; i < n; i++) {			
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			sum = Integer.parseInt(stk.nextToken()) + Integer.parseInt(stk.nextToken());						
			bw.write("Case #"+ num++ +": "+sum+"\n");
		}	
		bw.flush();
		bw.close();		
	}
}
