/*
 * Mac Lawson
 * 4/12/23
 * Item tester class
 */

public class ItemTester {
    public static void main(String[] args) {
        // Create an array of items
        Item[] items = {
                new Item("Chewbacca Mask", 1281, 19.99, 24),
                new Item("Harry Potter Wand", 3942, 9.99, 10),
                new Item("Star Wars T-Shirt", 8271, 14.99, 30),
                new Item("Marvel Comics Backpack", 7520, 29.99, 12),
                new Item("Rainbow Loom Kit", 5412, 7.99, 20),
                new Item("Fidget Spinner", 6732, 3.99, 50),
                new Item("Rubik's Cube", 9021, 5.99, 18),
                new Item("Nintendo Switch", 6209, 299.99, 6),
                new Item("Nerf Gun", 1562, 24.99, 8),
                new Item("Pikachu Plush Toy", 4759, 12.99, 15)
        };

        // Print the unsorted array
        System.out.println("Unsorted array:\n");
        printItems(items);

        // Sort the array by product number
        sortByProductNumber(items, true);
        System.out.println("\nArray sorted by product number in ascending order:\n");
        printItems(items);

        // Sort the array by product name
        sortByName(items, false);
        System.out.println("\nArray sorted by product name in descending order:\n");
        printItems(items);

        // Sort the array by price
        sortByPrice(items, true);
        System.out.println("\nArray sorted by price in ascending order:\n");
        printItems(items);

        // Sort the array by quantity
        sortByQuantity(items, false);
        System.out.println("\nArray sorted by quantity in descending order:\n");
        printItems(items);
    }

    public static void printItems(Item[] items) {
        System.out.printf("%-20s %-10s %-10s %s\n", "Product Name", "Product Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public static void sortByProductNumber(Item[] items, boolean ascending) {
        int n = items.length;
        for (int i = 1; i < n; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? items[j].getProductNumber() > key.getProductNumber() :
                    items[j].getProductNumber() < key.getProductNumber())) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }
    }

    public static void sortByName(Item[] items, boolean ascending) {
        int n = items.length;
        for (int i = 1; i < n; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? items[j].getName().compareTo(key.getName()) < 0 :
                    items[j].getName().compareTo(key.getName()) > 0)) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }
    }

public static void sortByPrice(Item[] items, boolean ascending) {
    int n = items.length;
    for (int i = 1; i < n; i++) {
        Item key = items[i];
        int j = i - 1;
        while (j >= 0 && (ascending ? items[j].getPrice() > key.getPrice() :
                items[j].getPrice() < key.getPrice())) {
            items[j + 1] = items[j];
            j--;
        }
        items[j + 1] = key;
    }
}

public static void sortByQuantity(Item[] items, boolean ascending) {
    int n = items.length;
    for (int i = 1; i < n; i++) {
        Item key = items[i];
        int j = i - 1;
        while (j >= 0 && (ascending ? items[j].getQuantity() > key.getQuantity() :
                items[j].getQuantity() < key.getQuantity())) {
            items[j + 1] = items[j];
            j--;
        }
        items[j + 1] = key;
    }
}

}

