class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // very similar to the subsets problem , just need a condition here

        // so i will make a subset List that will contain multiple lists

        List<List<Integer>> subsets = new ArrayList<>();

        // now a function for generating the function , will have a range from 1 to n
        // an empty list to add the subsets to 
        // subsets is the main list 
        // K is the no of pairs
        generateSubset(1,n,new ArrayList(),subsets,k);
        return subsets;
    }

    // void because it doesnt need to return anything
    void generateSubset(int start,int n,List<Integer> curr, List<List<Integer>> subsets,int k){
       
       if (curr.size() == k){
        subsets.add(new ArrayList(curr));
        return ; // cause why would you generate more combos if equal to K is found
       }

        for (int i = start; i <=n;i++){
            curr.add(i);
            generateSubset(i+1,n,curr,subsets,k);
            curr.remove(curr.size()-1);

        }

    }
}
