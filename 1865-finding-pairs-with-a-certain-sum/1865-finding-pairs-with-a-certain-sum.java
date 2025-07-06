class FindSumPairs {
       int [] n1;
       int [] n2;
       HashMap<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.n1 = nums1;
        this.n2 = nums2;
        this.map = new HashMap<>();
        for(int i = 0; i<nums2.length;i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        int old = n2[index];
        int newV = n2[index]+val;
        n2[index] += val;
        map.put(old, map.get(old)-1);
        if(map.get(old) == 0) map.remove(old);

        map.put(newV, map.getOrDefault(newV,0)+1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int i= 0; i<n1.length;i++){
            int rem = tot - n1[i];
             count+=map.getOrDefault(rem, 0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */