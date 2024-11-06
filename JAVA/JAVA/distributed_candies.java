package JAVA;

public class distributed_candies {
        public int[] distributeCandies(int candies, int num_people) {
            int[] v = new int[num_people];
            int candy = 1 , i = 0;
            while(candies > 0){
                v[i % num_people] += Math.min(candy , candies);
                candies -= candy;
                candy++;
                i++;
            }
            return v;
        }
}
