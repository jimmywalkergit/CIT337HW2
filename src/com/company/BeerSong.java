package com.company;

/**
 * Created by Desktop on 9/25/2016.
 */
public class BeerSong {

    public static void main(String[] args) {
        // write your code here
        //calls beer

        Ninety_Nine_Bottles_of_Beer();


    }

    public static void Ninety_Nine_Bottles_of_Beer(){
        //prints song



        int numBeers = 99;

        while(numBeers >= 1){

            if (numBeers == 1) {
                System.out.print(numBeers + " bottle of beer on the wall, " + numBeers + " bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.\n");
            } else{
                System.out.print(numBeers + " bottles of beer on the wall, " + numBeers + " bottles of beer.\n" +
                        "Take one down and pass it around, " + (numBeers - 1) + " bottles of beer on the wall.\n");
            }



            numBeers -= 1;
        }






    }


}
