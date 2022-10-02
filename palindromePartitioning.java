import java.util.ArrayList;
import java.util.List;

public class palindromePartitioning {


    public static void main(String[] args) {
           String s = "aab";
           List<String> temp= new ArrayList<>();
           genPalindromPartition(s,0,temp);


    }

    private static void genPalindromPartition(String s, int idx, List<String> temp) {
            if(idx == s.length()){
               System.out.print(temp);
               return;
            }

            for(int i=idx ;i<s.length();i++){
                if(isPalindrome(s,idx,i)){
                    temp.add(s.substring(idx,i+1));
                    genPalindromPartition(s,i+1,temp);
                    temp.remove(temp.size()-1);
                }
            }
    }

    private static boolean isPalindrome(String s, int str, int end) {
            while(str<=end){
                if(s.charAt(str++) != s.charAt(end--))
                    return false;
            }

        return true;
    }
}
