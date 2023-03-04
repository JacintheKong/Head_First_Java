package chap01;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1 || beerNum == 2) {
                word = "bottle";
            } else {
                word = "bottles";
            }
            beerNum--;
            System.out.println(beerNum + " " + word + " of beer on the wall.");

            if (beerNum > 0) {
                System.out.println("Take one down. Pass it around.");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}