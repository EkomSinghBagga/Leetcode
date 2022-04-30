class Solution {
    public double[] calcEquation(List<List<String>> e, double[] values, List<List<String>> q) {
    double[] res = new double[q.size()];
        Map<String, String> root = new HashMap<>();
        Map<String, Double> dist = new HashMap<>();
        for (int i = 0; i < e.size(); i++) {
            String r1 = find(root, dist, e.get(i).get(0));
            String r2 = find(root, dist, e.get(i).get(1));
            root.put(r1, r2);
            dist.put(r1, dist.get( e.get(i).get(1)) * values[i] / dist.get( e.get(i).get(0)));
        }
        for (int i = 0; i < q.size(); i++) {
            if (!root.containsKey( q.get(i).get(0)) || !root.containsKey( q.get(i).get(1))) {
                res[i] = -1.0;
                continue;
            }
            String r1 = find(root, dist, q.get(i).get(0));
            String r2 = find(root, dist, q.get(i).get(1));
            if (!r1.equals(r2)) {
                res[i] = -1.0;
                continue;
            }
            res[i] = (double) dist.get(q.get(i).get(0)) / dist.get(q.get(i).get(1));
        }
        return res;
    }
    
    private String find(Map<String, String> root, Map<String, Double> dist, String s) {
        if (!root.containsKey(s)) {
            root.put(s, s);
            dist.put(s, 1.0);
            return s;
        }
        if (root.get(s).equals(s)) return s;
        String lastP = root.get(s);
        String p = find(root, dist, lastP);
        root.put(s, p);
        dist.put(s, dist.get(s) * dist.get(lastP));
        return p;
    }
}