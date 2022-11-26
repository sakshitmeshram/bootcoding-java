package com.bootcoding.basic.leetcode;

public class PowerOfFour {

    public boolean findPower(int n){

        if(n==1){
            return true;
        }



        return false;







/*

        int con = 4 ;
        int i =1;

        while(i<=n){

            if(n == 1 || n==4){
                return true;
            }


            con = 4 *con;



            if(con == n){
                return true;
            }

            i++;
        }

        return false;
*/

    }

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();

        int n = 1;

        System.out.println(powerOfFour.findPower(n));

    }

}
