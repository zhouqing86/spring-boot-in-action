package com.wendll.helpers;

public class StringHelper {

    public static boolean isPalindrome(String str) {
        if(str == null ){
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString().equals(str);
    }


    public static String removeChar(String str, char c) {
        if(str == null) {
            return null;
        }
        return str.replaceAll(Character.toString(c), "");
    }
}