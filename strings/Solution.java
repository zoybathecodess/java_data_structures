public class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            //skip spaces
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            //if index goes out of bound, break
            if(i<0) break;
            int end = i;

            //traverse through the string(backwards)
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }

            
            String word = s.substring(i+1, end+1);

            if(result.length()>0){
            result.append(" ");
            }


            result.append(word);
        }
    return result.toString();


    }


public static void main(String[] args) {
    Solution obj = new Solution();
    String s = " amazing coding skills ";
    System.out.println(obj.reverseWords(s));
    }
}