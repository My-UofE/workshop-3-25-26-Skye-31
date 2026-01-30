public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 
 
        // Using switch
        switch(number) {
            case 1:
                System.out.println("uno"); break; // don't forget the break after each case!
            case 2:
                System.out.println("dos"); break;
            case 3:
                System.out.println("tres"); break;
            case 4:
                System.out.println("cuatro"); break;
            case 5:
                System.out.println("cinco"); break;
            default: System.out.println("Sorry I do not know that!");
        }
    }
}
