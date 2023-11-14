import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine(); // Read user input
        String name = userName.toUpperCase().replaceAll("\\s", "");
        int total = 0;
        int subTotal = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            int castAscii = (int) c;

            if ((castAscii - 64) % 9 == 0) {
                castAscii = 9;
                total += castAscii;
                System.out.println(castAscii);
            } else {
                castAscii = (castAscii - 64) % 9;
                total += castAscii;
                System.out.println(castAscii);
            }
            System.out.println("tatal: " + (total));
        }
        String totalString = "" + total;
        while (subTotal > 9) {
            int sum = 0;
            

        }

        // for (int i = 0; i < totalString.length(); i++) {
        // char c = totalString.charAt(i);
        // subTotal += c * 1;
        // }
        // System.out.println("subTotal" + (subTotal));
    }
}
