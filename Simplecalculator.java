
public class Simplecalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit\nchoose: ");
            int choice = sc.nextInt();
            if (choice == 5) break;
            
            System.out.print("Enter two numbers: ");
            double num1 = sc.nextDouble(), num2 = sc.nextDouble();

            if (choice == 1) System.out.println("Result: " + (num1 + num2));
            else if (choice == 2) System.out.println("Result: " + (num1 - num2));
            else if (choice == 3) System.out.println("Result: " + (num1 * num2));
            else if (choice == 4) System.out.println(num2 == 0 ? "Error! Division by zero:");
            else System.out.println("Invalid choice!");

            System.out.print("Continue? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) break;
            }
            sc.close();
    }
}