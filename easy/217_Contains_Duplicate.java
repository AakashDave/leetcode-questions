public boolean containsDuplicate(int[] nums) {
  // Solution 1
  /* Using naive approach , two for loops
        TC : O(n^2)
        SC : O(1)  
  */
  for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
      if(nums[i] == nums[j]) return true;
    }
  }
  return false;

  // Solution 2 --> Array.sort() method
  /* TC : O(nlogn) */
  Arrays.sort(nums);
  for(int i=1;i<nums.length;i++){
     if(nums[i]==nums[i-1]) return true;
  }
  return false;

  // Solution 3 --> Using HashSet
  /* TC - O(n)
    SC - O(n) */
  HashSet<Integer> myset = new HashSet<Integer>();
  for(int i=0;i<nums.length;i++){
    if(!myset.add(nums[i])) return true;
  }
return false;
}
