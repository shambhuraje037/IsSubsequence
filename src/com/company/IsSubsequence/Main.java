package com.company.IsSubsequence;

public class Main {

    public static boolean subsequence(String s, String t){
        int s_pointer = 0;
        int t_pointer = 0;
        if(s.length() == 0) return true;

        while(t_pointer< t.length()){
            if(t.charAt(t_pointer) == s.charAt(s_pointer)){
                s_pointer++;
                if(s.length() == s_pointer) return true;
            }
            t_pointer++;
        }
        return false;
    }

    public static void main(String[] args) {
    String s="axcl";
    String t=" abxdc";

        System.out.println(subsequence(s,t));
    }
}
