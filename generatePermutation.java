import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class generatePermutation {

    public static void main(String[] args) {
            int arr []= new int[]{1,2,3};
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
                     vis[i]=1;
                     temp.add(arr[i]);
                     genpermutation(arr ,  vis , temp);
                     temp.remove(temp.size()-1);
                     vis[i]=0;
                 }
            }
    }
}
