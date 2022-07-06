
    		int N = 510;
		int dp[][] = new int[N][N];
		int INF = (int)1e9 + 10;
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				dp[i][j] = INF;
				if(i == j)
				{
					dp[i][j] = 0;
				}
			}
		}
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i = 0; i < m; i++)
		{
			int u = in.nextInt();
			int v = in.nextInt();
			int w = in.nextInt();
			dp[u][v] = w;
		}
		
		for(int k = 1; k <= n; k++)
		{
			for(int u = 1; u <= n; u++)
			{
				for(int v = 1; v <= n; v++)
				{
					if(dp[u][k] != INF && dp[k][v] != INF)
					{
						dp[u][v] = Math.min(dp[u][v], dp[u][k] + dp[k][v]);
					}
				}
			}
		}
















