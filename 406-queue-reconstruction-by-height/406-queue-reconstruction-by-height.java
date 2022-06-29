class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]> (){
            public int compare(int[] p1,int[] p2){
                return p1[0]!=p2[0]?p2[0]-p1[0]:p1[1]-p2[1];
            }
        });
        List<int[]> res=new ArrayList<>();
        for(int[] cur:people){
            res.add(cur[1],cur);
        }
        return res.toArray(new int[people.length][]);
    }
}