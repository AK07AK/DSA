//import java.util.*;
//public class Marvel {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int idx=0;
//        List<Marvel> list = new ArrayList<>();
//
//        while(sc.hasNext())
//        {
//            int movieId=sc.nextInt();
//            String movieName = sc.next();
//            double budget = sc.nextDouble();
//            double boxOffice = sc.nextDouble();
//            int rating = sc.nextInt();
//            Marvel marvel = new Marvel(movieId,movieName,budget,boxOffice,rating);
//            list.add(marvel);
//        }
//        Marvel[] arr = new Marvel[list.size()];
//
//        for (Marvel marvel : list) {
//            arr[idx++] = marvel;
//        }
//        double budget = sc.nextDouble();
//        double boxOffice = sc.nextDouble();
//
//        double avgRating = findAverageRating(arr,budget);
//        if(avgRating>0)
//        {
//            System.out.println(avgRating);
//        }
//        else {
//            System.out.println("There are no movies with the given condition");
//        }
//
//        Marvel[] resultMovies = searchMovieByBoxOffice(arr, boxOffice);
//        if (resultMovies != null) {
//            for (Marvel movie : resultMovies) {
//                System.out.println(movie.getMovieId());
//            }
//        } else {
//            System.out.println("No such movies");
//        }
//
//    }
//    private int movieId;
//    private String movieName;
//    private double budget;
//    private double boxOffice;
//    private int rating;
//
//    public Marvel(int movieId, String movieName, double budget, double boxOffice, int rating) {
//        this.movieId = movieId;
//        this.movieName = movieName;
//        this.budget = budget;
//        this.boxOffice = boxOffice;
//        this.rating = rating;
//    }
//    public int getMovieId()
//    {
//        return movieId;
//    }
//    public int getRating()
//    {
//        return rating;
//    }
//    public double getBudget()
//    {
//        return budget;
//    }
//    public String getMovieName()
//    {
//        return movieName;
//    }
//    public void setMovieId(int movieId)
//    {
//        this.movieId=movieId;
//    }
//    public void setMovieName(String movieName)
//    {
//        this.movieName=movieName;
//    }
//    public void setBudget(double budget)
//    {
//        this.budget=budget;
//    }
//    public void setBoxOffice(double boxOffice)
//    {
//        this.boxOffice=boxOffice;
//    }
//    public void setRating(int rating)
//    {
//        this.rating=rating;
//    }
//
//    public static double findAverageRating(Marvel[] arr, double budget) {
//        double sum = 0;
//        int ct = 0;
//
//        for (var marvel : arr) {
//            if (marvel.budget > budget) {
//                sum += marvel.rating;
//                ct++;
//            }
//        }
//        return sum / ct;
//    }
//
//    public static Marvel[] searchMovieByBoxOffice(Marvel[] arr, double boxOffice) {
//        List<Marvel> list = new ArrayList<>();
//        int count = 0;
//
//        for (var marvel : arr) {
//            if (marvel.boxOffice < boxOffice) {
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            return null;
//        }
//        Marvel[] filteredMovies = new Marvel[count];
//        int index = 0;
//        for (var movie : arr) {
////            if (movie < boxOffice) {
//                filteredMovies[index++] = movie;
//            }
//        }
//
//        for (int i = 0; i < filteredMovies.length - 1; i++) {
//            for (int j = 0; j < filteredMovies.length - i - 1; j++) {
//                if (filteredMovies[j].movieId < filteredMovies[j + 1].movieId) {
//                    Marvel temp = filteredMovies[j];
//                    filteredMovies[j] = filteredMovies[j + 1];
//                    filteredMovies[j + 1] = temp;
//                }
//            }
//        }
//        return filteredMovies;
//    }
//}
//
//
