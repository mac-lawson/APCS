import java.util.Arrays;
import java.util.Scanner;

public class InventoryTester {

    public static void main(String[] args) {
        
        Item[] inventory = new Item[10];
        
        // initializing inventory
        inventory[0] = new Item("Pencil", 123, 0.99, 100);
        inventory[1] = new Item("Pen", 456, 1.49, 50);
        inventory[2] = new Item("Notebook", 789, 2.99, 30);
        inventory[3] = new Item("Highlighter", 101, 1.29, 75);
        inventory[4] = new Item("Eraser", 112, 0.49, 200);
        inventory[5] = new Item("Ruler", 141, 0.99, 100);
        inventory[6] = new Item("Stapler", 235, 3.99, 20);
        inventory[7] = new Item("Sticky Notes", 274, 2.49, 40);
        inventory[8] = new Item("Binder Clips", 309, 0.89, 150);
        inventory[9] = new Item("Tape Dispenser", 377, 4.99, 15);
        
        System.out.println("Inventory before sorting:");
        printInventory(inventory);
        System.out.println();
        
        // Sorting by product number in ascending order
        sortInventoryByNumber(inventory, true);
        System.out.println("Inventory sorted by product number in ascending order:");
        printInventory(inventory);
        System.out.println();
        
        // Sorting by product name in descending order
        sortInventoryByName(inventory, false);
        System.out.println("Inventory sorted by product name in descending order:");
        printInventory(inventory);
        System.out.println();
        
        // Sorting by price in ascending order
        sortInventoryByPrice(inventory, true);
        System.out.println("Inventory sorted by price in ascending order:");
        printInventory(inventory);
        System.out.println();
        
        // Sorting by quantity in descending order
        sortInventoryByQuantity(inventory, false);
        System.out.println("Inventory sorted by quantity in descending order:");
        printInventory(inventory);
    }
    
    // Method to print inventory in a table format
    public static void printInventory(Item[] inventory) {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Product Name", "Product Number", "Price", "Quantity");
        for (Item item : inventory) {
            System.out.printf("%-15s%-15d%-15s%-15d\n", item.getName(), item.getProductNumber(), 
                    item.getPriceFormatted(), item.getQuantity());
        }
    }
    
    // Method to sort inventory by product number using insertion sort
    public static void sortInventoryByNumber(Item[] inventory, boolean ascending) {
        for (int i = 1; i < inventory.length; i++) {
            Item key = inventory[i];
            int j = i - 1;
            while (j >= 0 && (ascending ? inventory[j].getProductNumber() > key.getProductNumber() : 
                inventory[j].getProductNumber() < key.getProductNumber())) {
                inventory[j + 1] = inventory[j];
                j = j - 1;
            }
            inventory[j + 1] = key;
        }
    }
	// Method to sort inventory by product name using selection sort
public static void sortInventoryByName(Item[] inventory, boolean ascending) {
  for (int i = 0; i < inventory.length - 1; i++) {
    int minIdx = i;
    for (int j = i + 1; j < inventory.length; j++) {
      if (ascending ? inventory[j].getName().compareTo(inventory[minIdx].getName()) < 0 :
        inventory[j].getName().compareTo(inventory[minIdx].getName()) > 0) {
        minIdx = j;
      }
    }
    Item temp = inventory[minIdx];
    inventory[minIdx] = inventory[i];
    inventory[i] = temp;
  }
}
// Method to sort inventory by price using merge sort
public static void sortInventoryByPrice(Item[] inventory, boolean ascending) {
    mergeSortByPrice(inventory, 0, inventory.length - 1, ascending);
}

private static void mergeSortByPrice(Item[] inventory, int l, int r, boolean ascending) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSortByPrice(inventory, l, m, ascending);
        mergeSortByPrice(inventory, m + 1, r, ascending);
        mergeByPrice(inventory, l, m, r, ascending);
    }
}

private static void mergeByPrice(Item[] inventory, int l, int m, int r, boolean ascending) {
    int n1 = m - l + 1;
    int n2 = r - m;
    
    Item[] L = new Item[n1];
    Item[] R = new Item[n2];
    
    for (int i = 0; i < n1; i++) {
        L[i] = inventory[l + i];
    }
    for (int j = 0; j < n2; j++) {
        R[j] = inventory[m + 1 + j];
    }
    
    int i = 0, j = 0, k = l;
    while (i < n1 && j < n2) {
        if (ascending ? L[i].getPrice() <= R[j].getPrice() :
                L[i].getPrice() >= R[j].getPrice()) {
            inventory[k] = L[i];
            i++;
        } else {
            inventory[k] = R[j];
            j++;
        }
        k++;
    }
    
    while (i < n1) {
        inventory[k] = L[i];
        i++;
        k++;
    }
    
    while (j < n2) {
        inventory[k] = R[j];
        j++;
        k++;
    }
}

// Method to sort inventory by quantity using selection sort
public static void sortInventoryByQuantity(Item[] inventory, boolean ascending) {
    for (int i = 0; i < inventory.length - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < inventory.length; j++) {
            if (ascending ? inventory[j].getQuantity() < inventory[minIdx].getQuantity() :
                    inventory[j].getQuantity() > inventory[minIdx].getQuantity()) {
                minIdx = j;
            }
        }
        Item temp = inventory[minIdx];
        inventory[minIdx] = inventory[i];
        inventory[i] = temp;
    }
}

}
