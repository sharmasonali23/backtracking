import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



//https://leetcode.com/problems/permutations-ii/

public class generateUniquePermutations {

    public static void main(String[] args) {
           int a[] = new int[]{1,1,2,3};
           List<Integer> temp = new ArrayList<>();
           Map<Integer, Integer> hm = new HashMap<>();
           for(int i=0;i<a.length;i++){
               hm.put(a[i],hm.getOrDefault(a[i],0)+1);
           }
           System.out.println(hm);
           int farr[] = new int[hm.size()];
           int k=0;
           for(Map.Entry<Integer, Integer>entry : hm.entrySet()){
               farr[k++] = entry.getKey();
           }

           genUniquePermutations(a,farr,temp , hm);
    }

    private static void genUniquePermutations(int[] a, int[] farr, List<Integer> temp , Map<Integer, Integer>hm) {
            if (temp.size()==a.length){
                System.out.println(temp);
                return;
            }

            for(int i=0;i<farr.length;i++){
                if(hm.get(farr[i])>0){
                    hm.put(farr[i],hm.getOrDefault(farr[i],0)-1);
                    temp.add(farr[i]);
                    genUniquePermutations(a,farr,temp,hm);
                    hm.put(farr[i],hm.getOrDefault(farr[i],0)+1);
                    temp.remove(temp.size()-1);
                }
            }
    }
}
