package com.psi.helloworld;

import org.apache.commons.lang3.StringUtils;

public class Basicjava {
    static int sum;
    public static void main (String args[]){
        String myName=" Vichka";
        String love="I Love Java Programming";
        double[] mynum={3.2,9.1,8,5.2,6.1};
        String lower= love.toLowerCase();
        int length= love.length();
        String[] splited = love.split(" ");
        System.out.println("Lower Case is:"+ lower);
        System.out.println("Length is:"+length);
        System.out.println(splited[0]);
        System.out.println(splited[1]);
        System.out.println(splited[2]);
        System.out.println(splited[3]);

        for (int i=0;i<splited.length;i++){
            System.out.print( splited[i]);
        }
        System.out.println();
        System.out.println("\n SubString: "+love.substring(7,11));
        System.out.println(StringFormat.reverseString(love));
        System.out.println(StringUtils.reverse(love));
        for (int i=0;i<mynum.length;i++) {
            System.out.println("Array: "+mynum[i]);
        }
    }

}
