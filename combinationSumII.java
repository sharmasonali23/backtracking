import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII {

    public static void main(String[] args) {
           int a[]= new int[]{10,1,2,7,6,1,5};
           Arrays.sort(a);
           int target = 8;
           List<Integer> temp = new ArrayList<>();
           genCombinaionSumTwo(a,0,target,temp);
    }

    private static void genCombinaionSumTwo(int a[], int idx, int target, List<Integer> temp) {
                if(target==0){
                    System.out.println(temp);
                    return;
                }


            for(int i=idx ;i<a.length;i++) {
                if(i>idx && a[i]==a[i-1]) continue;
                if (a[i] > target) {
                    break;
                }
                temp.add(a[i]);
                genCombinaionSumTwo(a, idx + 1, target - a[i], temp);
                temp.remove(temp.size() - 1);

            }

    }
}
