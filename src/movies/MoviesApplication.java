package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    static Movie[] movies;



    public static void viewAllMovies() {
//        Movie[] movies = viewAllMovies();
        for (Movie movie : movies) {
            System.out.println(movie.getName());
        }
        System.out.println();
    }

    public static void viewMoviesByCategory(String category) {
//        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category))
                System.out.println(movie.getName());
        }
        System.out.println();
    }




    public static void main(String[] args) {

        movies = MoviesArray.findAll();


        while(true) {
            System.out.println("What would you like to do?\n");
            System.out.println("0  - exit");
            System.out.println("1  - view all movies");
            System.out.println("2  - view movies in the animated category");
            System.out.println("3  - view movies in the drama category");
            System.out.println("4  - view movies in the horror category");
            System.out.println("5  - view movies in the sci-fi category");



            Input input = new Input();

            int choice = input.getInt();


                switch (choice) {
                    case 0:
                        return; // to get out of switch statement and while loop. "super break"

                    case 1:
                        viewAllMovies();
                        break;
                    case 2:
                        viewMoviesByCategory("animated");
                        break;
                    case 3:
                        viewMoviesByCategory("drama");
                        break;
                    case 4:
                        viewMoviesByCategory("horror");
                        break;
                    case 5:
                        viewMoviesByCategory("scifi");
                        break;
                    default:
                        break;
                }


        }


    }
}
