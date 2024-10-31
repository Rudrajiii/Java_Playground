package JAVA;

import java.util.Arrays;
import java.util.HashSet;

public class merge_two_array {
    public static void main(String[] args){
        int[] a = {0 , 1 , 2 , 9 , 8 , 4  , 3};
        int[] b = {0 , 11 , 2 , 10 , 8 , 5  , 7};
        int m = a.length;
        int n = b.length;
        int[] r = new int[m + n];
        int k = 0;
        for(int i = 0 ; i < m ; i++){
            r[k] = a[i];
            k++;
        }
        for(int i = 0 ; i < n ; i++){
            r[k] = b[i];
            k++;
        }
        Arrays.sort(r);
        HashSet<Integer> map = new HashSet<>();
        for(int j : r){
            map.add(j);
        }
        System.out.println(map);
    }
}
