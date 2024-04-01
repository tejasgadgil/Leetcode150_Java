class Solution {
    public int[] twoSum(int[] nums, int target) {

        // //brute force
        // //Time complexity: O(N^2)
        // //Space Complexity: O(1)
        // int n = nums.length;
        // for(int i = 0; i < n-1; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};



        //one pass hash map 
        //Time complexity: O(N);
        //Space Complexity: O(N)

        Map<Integer,Integer> numCheck = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++){
            int comp = target - nums[i];
            if (numCheck.containsKey(comp)){
                return new int[] {i, numCheck.get(comp)};
            }
            numCheck.put(nums[i], i);
        }
        return new int[]{};


    }
}
