class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
         List<List<Integer>> redList = new ArrayList<>();
        List<List<Integer>> blueList = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            redList.add(new ArrayList<Integer>());
            blueList.add(new ArrayList<Integer>());
        }
        for(int[] edge : redEdges) {
            redList.get(edge[0]).add(edge[1]);
        }
        for(int[] edge : blueEdges) {
            blueList.get(edge[0]).add(edge[1]);
        }
        int[] result = new int[n];
        for(int i = 1 ; i < result.length ; i++) {
            result[i] = -1;
        }
        BFS(result, redList, blueList);
        return result;
    }
    private int BFS(int[] result, List<List<Integer>> redList, List<List<Integer>> blueList) {
        Queue<List<Integer>> level = new ArrayDeque<>();
        level.offer(Arrays.asList(0, 0));
        level.offer(Arrays.asList(0, 1));
        boolean[][] visited = new boolean[redList.size()][2];
        int step = 0;
        while(!level.isEmpty()) {
            int size = level.size();
            for(int i = 0 ; i < size ; i++) {
                List<Integer> curList = level.poll();
                int curIndex = curList.get(0);
                int curColor = curList.get(1);
                visited[curIndex][curColor] = true;
                if(result[curIndex] == -1) {
                    result[curIndex] = step;
                } else if(step < result[curIndex]) {
                    result[curIndex] = step;
                }
                List<Integer> redNeighbours = redList.get(curIndex);
                List<Integer> blueNeighbours = blueList.get(curIndex);
                if(curColor == 1) {
                    for(int neighbour : redNeighbours) {
                        if(!visited[neighbour][0]) {
                            level.add(Arrays.asList(neighbour, 0));
                        }
                    }
                } else {
                    for(int neighbour : blueNeighbours) {
                        if(!visited[neighbour][1]) {
                            level.add(Arrays.asList(neighbour, 1));
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}