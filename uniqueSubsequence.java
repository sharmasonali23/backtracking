import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uniqueSubsequence {

    public static void main(String[] args) {
            int arr [] = new int[]{1,1,2,3};
            List<Integer> temp = new ArrayList<>();
            Map<Integer,Integer> hm  = new HashMap<>();

            for (int i=0;i<arr.length;i++){
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
            int farr[] = new int[hm.size()];
            int k=0;
            for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
                int key = Integer.parseInt(String.valueOf(entry.getKey()));
                farr[k++] = key;
        }
            System.out.println(hm);
            generateUniqueSubsequence( 0 ,temp, hm, farr);
    }

    private static void generateUniqueSubsequence( int idx, List<Integer> temp , Map<Integer,Integer>hm, int []farr) {
            if(idx == hm.size()){
                System.out.println(temp);
                return;
            }

            for(int i=0;i<=hm.get(farr[idx]);i++) {
                temp.add(i);
                generateUniqueSubsequence(idx+1,temp,hm, farr);
                temp.remove(temp.get(temp.size()-1));
            }

        }




}
