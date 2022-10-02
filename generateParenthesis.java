import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public static void main(String[] args) {
           int n = 4;
           List<String> temp = new ArrayList<>();
           genParenthesis(n,0,0,temp);

    }

    private static void genParenthesis(int n, int currOpen, int currClose, List<String> temp) {
            if(currOpen==n && currClose==n){
                System.out.println(temp);
                return;
            }

            if(currOpen>n || currClose>n){
                return;
            }

            if(currOpen<n){
                temp.add("(");
                genParenthesis(n,currOpen+1,currClose,temp);
                temp.remove(temp.size()-1);
            }

            if(currClose < currOpen){
                temp.add(")");
                genParenthesis(n,currOpen,currClose+1,temp);
                temp.remove(temp.size()-1);
            }

    }
}
