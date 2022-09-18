//https://www.scaler.com/academy/mentee-dashboard/class/9277/homework/problems/142/?navref=cl_pb_nv_tb

import java.util.ArrayList;
import java.util.List;

public class generateCombination {

    public static void main(String[] args) {
           int A = 5;
           int B = 3;
           List<Integer> temp = new ArrayList<>();
           genCombination(A, B , 1 , temp);
    }

    private static void genCombination(int a, int b, int idx, List<Integer> temp) {
            if(temp.size()==b){
                System.out.println(temp);
                return;
            }

            for(int i=idx ;i<=a;i++){
                temp.add(i);
                genCombination(a , b ,temp.get(temp.size()-1)+1 , temp);
                temp.remove(temp.size()-1);
            }
    }
}
