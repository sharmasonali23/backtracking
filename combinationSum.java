import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static void main(String[] args) {
            int a[]= new int[]{2,3,7};
            int target = 7;
            List<Integer> temp = new ArrayList<>();
            genCombinationSum(a,0 ,target, temp);

    }

    private static void genCombinationSum(int[] a, int idx,int target, List<Integer> temp) {
            if(idx == a.length ){
                if(target==0) {
                    System.out.println(temp);
                }
                return;
            }

            if(a[idx]<=target){
                temp.add(a[idx]);
                genCombinationSum(a,idx, target-a[idx],temp);
                temp.remove(temp.size()-1);

            }
           genCombinationSum(a,idx+1, target,temp);
    }
}
