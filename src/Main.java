/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = 1 + random.nextInt(4);
        //System.out.println(number);
        Movie myMovie = Movie.randomMovie(number);
        myMovie.plot();
    }
}
