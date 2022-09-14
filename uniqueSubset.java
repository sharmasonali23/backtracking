import java.util.ArrayList;
import java.util.List;

public class uniqueSubset {
    static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
           int arr []= new int[]{1,2,3};

           List<Integer> temp = new ArrayList<>();
           genUniqueSubset(arr , 0 , ans , temp);
           for (int i=0;i<ans.size();i++){
               System.out.println(ans.get(i));
           }
    }

    private static void genUniqueSubset(int[] arr, int idx , List<List<Integer>> ans , List<Integer> temp)  {
            if (idx == arr.length){
                System.out.println(temp);
                ans.add(temp);
                return;
            }

            genUniqueSubset(arr,idx+1,ans, temp);
            temp.add(arr[idx]);
            genUniqueSubset(arr, idx+1 , ans , temp);
            temp.remove(temp.get(temp.size()-1));

    }
}
