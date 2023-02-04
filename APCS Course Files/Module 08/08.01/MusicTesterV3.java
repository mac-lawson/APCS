
/**
 * Tester class for Music.javas
 *
 * @author Mac Lawson
 * @version 2/3/23
 */
public class MusicTesterV3
{
    
public static void sortMusicLibraryByTitle(Music[] library) {
    int n = library.length;
    for (int i = 1; i < n; ++i) {
        Music key = library[i];
        int j = i - 1;
        while (j >= 0 && library[j].getTitle().compareTo(key.getTitle()) > 0) {
            library[j + 1] = library[j];
            j = j - 1;
        }
        library[j + 1] = key;
    }
}

public static void sortMusicLibraryByYear(Music[] library) {
    int n = library.length;
    for (int i = 1; i < n; ++i) {
        Music key = library[i];
        int j = i - 1;
        while (j >= 0 && library[j].getYear() > key.getYear()) {
            library[j + 1] = library[j];
            j = j - 1;
        }
        library[j + 1] = key;
    }
}

public static void sortMusicLibraryByArtist(Music[] library) {
    int n = library.length;
    for (int i = 1; i < n; ++i) {
        Music key = library[i];
        int j = i - 1;
        while (j >= 0 && library[j].getArtist().compareTo(key.getArtist()) > 0) {
            library[j + 1] = library[j];
            j = j - 1;
        }
        library[j + 1] = key;
    }
}

public static void binarySearchByYear(Music[] array, int year) {
    System.out.println("\tSearch Results");

    System.out.println("-----------------------");
    int first = 0;
    int last = array.length - 1;
    int mid = 0;
    boolean found = false;
    while (first <= last) {
    mid = (first + last) / 2;
    if (array[mid].getYear() < year) {
    first = mid + 1;
    } else if (array[mid].getYear() == year) {
    System.out.println(array[mid].getTitle());
    found = true;
    break;
    } else {
    last = mid - 1;
    }
    }
    if (!found) {
    System.out.println("Element is not found!");
    } else {
    int left = mid - 1;
    int right = mid + 1;
    while (left >= 0 && array[left].getYear() == year) {
    System.out.println(array[left].getTitle());
    left--;
    }
    while (right < array.length && array[right].getYear() == year) {
    System.out.println(array[right].getTitle());
    right++;
    }
    }
}
public static void binarySearchByArtist(Music[] array, String artist) {
        System.out.println("\tSearch Results");

    System.out.println("-----------------------");
int first = 0;
int last = array.length - 1;
int mid = 0;
boolean found = false;
while (first <= last) {
mid = (first + last) / 2;
int comparison = array[mid].getArtist().compareTo(artist);
if (comparison < 0) {
first = mid + 1;
} else if (comparison == 0) {
System.out.println(array[mid].getTitle());
found = true;
break;
} else {
last = mid - 1;
}
}
if (!found) {
System.out.println("Element is not found!");
} else {
int left = mid - 1;
int right = mid + 1;
while (left >= 0 && array[left].getArtist().equals(artist)) {
System.out.println(array[left].getTitle());
left--;
}
while (right < array.length && array[right].getArtist().equals(artist)) {
System.out.println(array[right].getTitle());
right++;
}
}
}

public static void binarySearchByTitle(Music[] array, String title) {
    System.out.println("\tSearch Results");

    System.out.println("-----------------------");
int first = 0;
int last = array.length - 1;
int mid = 0;
boolean found = false;
while (first <= last) {
mid = (first + last) / 2;
int comparison = array[mid].getTitle().compareTo(title);
if (comparison < 0) {
first = mid + 1;
} else if (comparison == 0) {
System.out.println(array[mid].getTitle()  + " by " + array[mid].getArtist());
found = true;
break;
} else {
last = mid - 1;
}
}
if (!found) {
System.out.println("Element is not found!");
} else {
int left = mid - 1;
int right = mid + 1;
while (left >= 0 && array[left].getTitle().equals(title)) {
System.out.println(array[left].getTitle() + " by " + array[left].getArtist());
left--;
}
while (right < array.length && array[right].getTitle().equals(title)) {
System.out.println(array[right].getTitle() + " by " + array[right].getArtist());
right++;
}
}
}
    // print the entire array
public static void printMusicLibrary(Music[] library) {
    for (Music music : library) {
        System.out.println(music.toString());
    }
}

public static void createArray(Music[] musicLibrary) {
    musicLibrary[0] = new Music("Pieces of You",1994, "Jewel");
    musicLibrary[1] = new Music("Pieces",1994, "Jewel");

    musicLibrary[2] = new Music("Jagged Little Pill",1995,"Alanis Morissette");
    musicLibrary[3] = new Music("What If It's You", 1995,"Reba McEntired");
    musicLibrary[4] = new Music("Misunderstood",2001,"Pink");
    musicLibrary[5] = new Music("Laundry Service",2001,"Shakira");
    musicLibrary[6] = new Music("Taking the Long Way",2006,"Dixie Chicks");
    musicLibrary[7] = new Music("Under My Skin",2004,"Avril Lavigne");
    musicLibrary[8] = new Music("Let It Go",2002,"Avril Lavigne");
    musicLibrary[9] = new Music("Let It Go",2007,"Tim McGraw");
    musicLibrary[10] = new Music("White Flag",2004,"Dido"); 
}

    public static void main (String[] args) {
        Music[] musicLibrary = new Music[11];

        createArray(musicLibrary);
        System.out.println("Original Array");
        printMusicLibrary(musicLibrary);
        sortMusicLibraryByArtist(musicLibrary);
        System.out.println("Searching for music by Jewel");
        binarySearchByArtist(musicLibrary, "Jewel");
        createArray(musicLibrary);
        System.out.println("Searching for music by Mark");
        binarySearchByArtist(musicLibrary, "Mark");
        createArray(musicLibrary);
        sortMusicLibraryByYear(musicLibrary);
        System.out.println("Searching for music in 1995");

        binarySearchByYear(musicLibrary, 1995);
        createArray(musicLibrary);
        System.out.println("Searching for music in 5555");

        binarySearchByTitle(musicLibrary, "Let It Go");


    }
}

