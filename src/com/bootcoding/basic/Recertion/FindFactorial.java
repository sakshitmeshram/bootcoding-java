package com.bootcoding.basic.Recertion;

public class FindFactorial {

        public int factorial(int num){

            if(num==1){
                return 1;
            }
            return num*factorial(num-1);
        }

    public static void main(String[] args) {
        FindFactorial f1 = new FindFactorial();

        System.out.println(f1.factorial(5));
    }
}
