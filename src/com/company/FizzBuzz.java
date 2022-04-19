package com.company;

public class FizzBuzz {
    Integer number;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    public String fizz(Integer number) {
        if(number % 5 == 0 ) {
            return "fizz";
        }
        else if (number % 3 == 0){
            return "buzz";

        }
        else {
            return "none";
        }


    }
}
