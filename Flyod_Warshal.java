IT HELPS TO CALCULATE SHORTEST PATH BETWEEN ANY PAIR OF NODES

ALGO :-

TAKE A dis[][] MATRIX --- dis[i][j] stores min distance bw i and j

INITIALLY if there is a direct edge from i to j then, initialize dis[i][j] by that distance

NOW FROM K = 1, K = N
CONSIDER ANY PAIR (i, j) NOW THE MINIMUM WEIGHT FROM i to j WILL BE PASSING THROUGH SOME VERTICES.
THIS IS THE WHOLE MAIN COCNEPT

K = 1 MEANS FOR EVERY PAIR (i,j) WE CAN PASS THROUGH 1.
K = 2 MEANS FOR EVERY PAIR (i,j) WE CAN PASS THROUGH 1,2
K = 3 MEANS FOR EVERY PAIR (i,j) WE CAN PASS THROUGH 1,2,3
.....
K = N MEANS FOR EVERY PAIR (i,j) WE CAN PASS THROUGH 1,2,3,...N.

let k = p;
then dp[i][j] = min distance i to j when we can pass through 1 to p - 1.
Now, just see if we can pass through p then can we minimise the distance.
dp[i][j] = Math.min(dp[i][j], dp[i][p] + dp[p][j]).

T.C. -> O(N * N * N)
-> It can handle negative weights but cannot handle negative cycles.

CODE :-
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

