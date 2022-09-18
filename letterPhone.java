import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterPhone {

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        String input  = "234567";
        // System.out.println(input.charAt(0));
        hm.put("0","0");
        hm.put("1","1");
        hm.put("2","abc");
        hm.put("3","def");
        hm.put("4","ghi");
        hm.put("5","jkl");
        hm.put("6","mno");
        hm.put("7","pqrs");
        hm.put("8","tuv");
        hm.put("9","wxyz");
        List<String> temp = new ArrayList<>();
       genLetterPhone(input, hm,0,temp);
       // System.out.println(String.valueOf(hm.get(String.valueOf(input.charAt(0)))));
    }

    private static void genLetterPhone(String input, Map<String, String> hm, int idx, List<String> temp) {
            if (temp.size() == input.length()){
                System.out.println(temp);
                return;
            }

            for(int i =0;i < String.valueOf(hm.get(String.valueOf(input.charAt(idx)))).length();i++){
                String mappedString = String.valueOf(hm.get(String.valueOf(input.charAt(idx))));
                //System.out.println(mappedString);
                temp.add(String.valueOf(mappedString.charAt(i)));
                genLetterPhone(input,hm,idx+1,temp);
                temp.remove(temp.size()-1);
            }
    }
}
