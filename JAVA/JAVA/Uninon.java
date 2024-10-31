package JAVA;
import java.util.ArrayList;
//todo Union of 2 Array
public class Uninon {
    public static void main(String[] args) {
        int[] arr1 = {1 , 1 , 2 , 3 , 4 , 5};
        int[] arr2 = {2 , 3 , 4 , 4 , 5 ,6 , 7};
        ArrayList<Integer> union = new ArrayList<>();
        int s1 = arr1.length;
        int s2 = arr2.length;
        int i = 0;
        int j = 0;
        while(i < s1 && j < s2){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < s1){
            if(union.get(union.size() - 1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j < s2){
            if(union.get(union.size() - 1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        for(int k = 0 ; k < union.size() ; k++){
            System.out.println(union.get(k));
        }
    }
}
