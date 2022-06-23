
main()
{
    String str = "ababbababa";
		String pat = "aba";
		String fin = pat + "$" + str;
		
		int z[] = zfunc(fin);
		
		for(int i = 0; i < fin.length(); i++)
		{
			if(z[i] == pat.length())
			{
				out.println(i - pat.length() - 1);
			}
		}
}

 static int[] zfunc(String str)
 {
    	int n = str.length();
		char s[] = str.toCharArray();
		
		int z[] = new int[n];
		
		/* Steps to calculate Z function
		 * First write brute force.
		 * Now think of optimization in z function
		 * only 1 optimization :
		 * Just think of if z[i] = k then to how much characters u can give a kickstart.
		 * (_ _ _ _ _ _) _ (_   _    _   _    _    _ )     _
		 *    1		        i   i+1              i+k-1
		 *  z[i] = k
		 *  so it means that k length from i is equal to prefix of length k starting from 0
		 *  Just see that string i + 1 to to i + k - 1 will be equal to 1 to k - 1 --- YES
		 *  Now, z[i + 1] = z[1] but it might also happen that z[1] is greater than k.
		 *  As we have knowledge that only k length is equal so initially do min(z[1], k)
		 *  
		 *  e.g. -> aaaaaaab(aaaa)ddd See for aaaa z = 4, and z[1] = 6 but z[9] = 3 not 6.
		 *  		0123456789...		
		 *  
		 *  Now, we can check separately that can z[9] can be increase or not.
		 *  e.g. -> aaaa b(aaaa)a here z = 4 so kickstart z[6] = 3 now see extra 'a' at last
		 *  position will also be added. z[6] = 4.
		 *  
		 *  Now, just see how to handle l and r
		 *  
		 *  T.C. -> O(pattern_len + input_string_len)
		 */
		
		int l = 0, r = 0;
		for(int i = 1; i < n; i++)
		{
			if(i <= r)
			{
				z[i] = Math.min(z[i - l], r - i +1);
			}
			
			while(i + z[i] < n && s[z[i]] == s[i + z[i]])
			{
				z[i]++;
			}
			
			if(i + z[i] - 1 > r)
			{
				l = i;
				r = i + z[i] - 1;
			}
		}
		
		return z;
 }
