class Solution {
	class Pair {
		int r, c, cost;
		Pair(int r, int c, int cost) {
			this.r = r;
			this.c = c;
			this.cost = cost;
		}
	}
	public int minimumCostPath(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int[][] dist = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
		dist[0][0] = grid[0][0];
		pq.offer(new Pair(0, 0, grid[0][0]));
		int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		while (!pq.isEmpty()) {
			Pair cur = pq.poll();
			if (cur.cost > dist[cur.r][cur.c])
				continue;
			for (int[] d:dir) {
				int nr = cur.r + d[0];
				int nc = cur.c + d[1];
				if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
					int newCost = cur.cost + grid[nr][nc];
					if (newCost < dist[nr][nc]) {
						dist[nr][nc] = newCost;
						pq.offer(new Pair(nr, nc, newCost));
					}
				}
			}
		}
		return dist[n - 1][m - 1];
	}
}
