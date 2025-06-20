import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}

public class SearchFunction {

    public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = Integer.parseInt(scanner.nextLine());
        Product[] productArray = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();

            productArray[i] = new Product(id, name, category);
        }

        Product[] sortedArray = Arrays.copyOf(productArray, productArray.length);
        Arrays.sort(sortedArray, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        while (true) {
            System.out.println("\n1. Linear Search\n2. Binary Search\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            if (choice == 3) {
                System.out.println("Exiting...");
                scanner.close();
                return;
            }

            System.out.print("Enter product name to search: ");
            String name = scanner.nextLine();

            int index = -1;

            if (choice == 1) {
                index = linearSearch(productArray, name);
            } else if (choice == 2) {
                index = binarySearch(sortedArray, name);
            } else {
                System.out.println("Invalid choice.");
                continue;
            }

            if (index != -1) {
                System.out.println("Product Found: " +
                        (choice == 1 ? productArray[index] : sortedArray[index]));
            } else {
                System.out.println("Product not found.");
            }
        }
    }
}
