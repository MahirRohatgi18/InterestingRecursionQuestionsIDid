class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> subset = new ArrayList();
        generateSubset(1,9,new ArrayList(),subset,k,n);
        return subset;
    }

    void generateSubset(int start ,int end,List<Integer> current , List<List<Integer>> subset, int k , int target){
        if (target == 0 && current.size()==k){
            subset.add(new ArrayList(current));
            return;
        }
        for(int i = start; i <= end ; i++){
            current.add(i);
            // tree is generated according to DFS
            generateSubset(i+1,end,current,subset,k,target-i); // Target is subtracted from current value of i
            current.remove(current.size()-1);
        }
     } 
}
