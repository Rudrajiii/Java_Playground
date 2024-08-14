class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> left_sub_array = new HashSet<>();
        Set<Integer> right_sub_array = new HashSet<>();
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for(int i : nums1){
            nums1Set.add(i);
        }
        for(int i : nums2){
            nums2Set.add(i);
        }

        for(int num : nums1){
            if(!nums2Set.contains(num)){
                left_sub_array.add(num);
            }
        }
        for(int num : nums2){
            if(!nums1Set.contains(num)){
                right_sub_array.add(num);
            }
        }
        List<Integer> leftList = new ArrayList<>(left_sub_array);
        List<Integer> rightList = new ArrayList<>(right_sub_array);

        List<List<Integer>> result = new ArrayList<>();
        result.add(leftList);
        result.add(rightList);

        return result;
    }
}
