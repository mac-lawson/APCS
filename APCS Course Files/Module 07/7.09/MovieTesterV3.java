/**
 * Purpose: Movie Class
 *
 * @author  Mac Lawson
 * @version 1-19-23
 *
 */

class MovieTesterV3 {
    public static Movie[] movieArray = {
        new Movie("The Shawshank Redemption", 1994, "Warner Bros."),
        new Movie("The Godfather", 1972, "Paramount Pictures"),
        new Movie("The Dark Knight", 2008, "Warner Bros."),
        new Movie("The Godfather: Part II", 1974, "Paramount Pictures"),
        new Movie("The Lord of the Rings: The Return of the King", 2003, "New Line Cinema"),
        new Movie("The Good, the Bad and the Ugly", 1966, "United Artists"),
        new Movie("Schindler's List", 1993, "Universal Pictures"),
        new Movie("The Lord of the Rings: The Fellowship of the Ring", 2001, "New Line Cinema"),
        new Movie("Forrest Gump", 1994, "Paramount Pictures"),
        new Movie("Inception", 2010, "Warner Bros.")
    };

    public static void printArray(Movie[] movieArray) {
        for (Movie movie : movieArray) {
            System.out.println(movie);
        }
    }

    public static void sortByTitle(Movie[] movieArray, int order) {
        for (int i = 0; i < movieArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < movieArray.length; j++) {
                if (order == 1) {
                    if (movieArray[j].getTitle().compareTo(movieArray[minIndex].getTitle()) < 0) {
                        minIndex = j;
                    }
                } else {
                    if (movieArray[j].getTitle().compareTo(movieArray[minIndex].getTitle()) > 0) {
                        minIndex = j;
                    }
                }
            }
            Movie temp = movieArray[i];
            movieArray[i] = movieArray[minIndex];
            movieArray[minIndex] = temp;
        }
    }

    public static void sortByYear(Movie[] movieArray, int order) {
        for (int i = 0; i < movieArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < movieArray.length; j++) {
                if (order == 1) {
                    if (movieArray[j].getYear() < movieArray[minIndex].getYear()) {
                        minIndex = j;
                    }
                } else {
                    if (movieArray[j].getYear() > movieArray[minIndex].getYear()) {
                        minIndex = j;
                    }
                }
            }
            Movie temp = movieArray[i];
            movieArray[i] = movieArray[minIndex];
            movieArray[minIndex] = temp;
        }
    }

    public static void sortByStudio(Movie[] movieArray, int order) {
        for (int i = 0; i < movieArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < movieArray.length; j++) {
                if (order == 1) {
                    if (movieArray[j].getStudio().compareTo(movieArray[minIndex].getStudio()) < 0) {
minIndex = j;
}
} else {
if (movieArray[j].getStudio().compareTo(movieArray[minIndex].getStudio()) > 0) {
minIndex = j;
}
}
}
Movie temp = movieArray[i];
movieArray[i] = movieArray[minIndex];
movieArray[minIndex] = temp;
}
}
public static void main(String[] args) {
    // Print the array without sorting
    System.out.println("Original Array:");
    printArray(movieArray);

    // Sort by title in ascending order
    System.out.println("\nSorted by Title (Ascending):");
    sortByTitle(movieArray, 1);
    printArray(movieArray);

    // Sort by title in descending order
    System.out.println("\nSorted by Title (Descending):");
    sortByTitle(movieArray, 0);
    printArray(movieArray);

    // Sort by year in ascending order
    System.out.println("\nSorted by Year (Ascending):");
    sortByYear(movieArray, 1);
    printArray(movieArray);

    // Sort by year in descending order
    System.out.println("\nSorted by Year (Descending):");
    sortByYear(movieArray, 0);
    printArray(movieArray);

    // Sort by studio in ascending order
    System.out.println("\nSorted by Studio (Ascending):");
    sortByStudio(movieArray, 1);
    printArray(movieArray);

    // Sort by studio in descending order
    System.out.println("\nSorted by Studio (Descending):");
    sortByStudio(movieArray, 0);
    printArray(movieArray);
}

}
