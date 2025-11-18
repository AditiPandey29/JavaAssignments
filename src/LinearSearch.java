
import java.util.Scanner;
public class LinearSearch{
    public static int linearSearch(String[] movies, String target){
        for (int i=0;i<movies.length;i++){
    if (movies[i].equalsIgnoreCase(target)){
        return i;
    }
        }
        return -1;
    }

public static void main(String[] args) {
    String[] movies = {"Inception", "Interstellar", "Avatar", "Titanic"};
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the name of movie for search:");
    String search = sc.next();
    int index = linearSearch(movies, search);
    System.out.println(index>=0 ? "Found at index " + index : "Movie not found");
}
}