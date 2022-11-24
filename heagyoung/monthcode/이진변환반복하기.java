import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        int delzero=0;
        int turn=0;
        String no_ze="";
        int len=-1;
        //앗 얘는 주석이 없네요 있는 숫자들중 0을 포함하고 있으면 없애서 없앤만큼 길이가 짧아지니까 그것을 0의 개숫에 더하고
        //길이만큼을 다시 2진수변환해서 앞 순서 반복입니다!
        while(true){
            if(s.equals("1"))
                break;
            no_ze=s.replaceAll("0","");
            turn++;
            delzero+=s.length()-no_ze.length();
            
            len=no_ze.length();
            //System.out.println(no_ze+" "+len);
            s="";
            while(true){                
                if(len%2!=0)
                    s="1"+s;
                else
                    s="0"+s;
                len/=2;
                if(len==0)
                    break;
            }
        }
        answer[0]=turn;
        answer[1]=delzero;
        return answer;
    }
    
}
