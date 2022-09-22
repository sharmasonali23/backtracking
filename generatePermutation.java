import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class generatePermutation {

    public static void main(String[] args) {
            int arr []= new int[]{1,8,17};
            int vis[]= new int[arr.length];
            List<Integer> temp = new ArrayList<>();
            genpermutation(arr , vis , temp);
    }

    private static void genpermutation(int[] arr, int[] vis , List<Integer>temp) {
            if (temp.size() == arr.length){
                System.out.println(temp);
                return;
            }

            for(int i=0;i<arr.length;i++){
                 if (vis[i]==0){
                     if(temp.size()>0){
                         int lastInsertedElement = temp.get(temp.size()-1);
                         double perfectSquare =  Math.sqrt(lastInsertedElement+arr[i]);
                         if(Math.floor(perfectSquare)*Math.floor(perfectSquare)==lastInsertedElement+arr[i]){
                             temp.add(lastInsertedElement);
                             temp.add(arr[i]);
                             vis[i]=1;
                         }
                         temp.add(lastInsertedElement);
                     }else {
                         temp.add(arr[i]);
                         vis[i]=1;
                     }
                     genpermutation(arr ,  vis , temp);
                     temp.remove(temp.size()-1);
                     vis[i]=0;
                 }
            }
    }
}
