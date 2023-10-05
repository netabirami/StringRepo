
    import java.util.Scanner;

    public class GetCharacterAtIndex {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Input the index
            System.out.print("Enter an index: ");
            int index = scanner.nextInt();

            // Check if the index is valid
            if (index >= 0 && index < inputString.length()) {
                // Get the character at the specified index
                char characterAtIndex = inputString.charAt(index);

                // Output the result
                System.out.println("Original String = " + inputString);
                System.out.println("The character at position " + index + " is " + characterAtIndex);
            } else {
                System.out.println("Invalid index. The index should be between 0 and " + (inputString.length() - 1));
            }
        }
    }

