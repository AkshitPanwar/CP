import java.util.*;
import java.io.*;
	// for codechef and atcoder and spoj
	public class Main {
		BufferedReader br;
		StringTokenizer st;
		public Main() { // constructor
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong () {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		static void sort(int[] arr) {
	        int n = arr.length;
	        Random rnd = new Random();
	        for(int i = 0; i < n; ++i) {
	            int tmp = arr[i];
	            int randomPos = i + rnd.nextInt(n - i);
	            arr[i] = arr[randomPos];
	            arr[randomPos] = tmp;
	        }
	        Arrays.sort(arr);
	   }
		static void sort(long[] arr) {
	        int n = arr.length;
	        Random rnd = new Random();
	        for(int i = 0; i < n; ++i) {
	            long tmp = arr[i];
	            int randomPos = i + rnd.nextInt(n - i);
	            arr[i] = arr[randomPos];
	            arr[randomPos] = tmp;
	        }
	        Arrays.sort(arr);
	   }
		static long gcd(long a, long b) {
			if(b == 0) {
				return a;
			}
			return gcd(b, a % b);
		}
		static int dir[][] = {{1, 0}, {-1, 0}, {0 ,1}, {0, -1}};
		static long mod = 998244353;
		
		static boolean isPrime(long n){
    		if(n <= 1){
    			return false;
    		}
    		else if(n == 2){
    			return true;
    		}
    		else if(n % 2 == 0){
    			return false;
    		}
 
    		for(long i = 3; i * i <= n; i += 2){
    			if(n % i == 0){
    				return false;
    			}
    		}
    		return true;
    	}
		
		static class Pair
		{
			int x;
			int y;
			Pair(int x, int y)
			{
				this.x = x;
				this.y = y;
			}
		}
		
	public static void main(String[] args) throws Exception{
		
		Main in = new Main();
		PrintWriter out = new PrintWriter(System.out);
		
		
		
		out.flush();		
		out.close();
	}
}
