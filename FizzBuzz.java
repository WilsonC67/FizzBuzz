public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            String message = "";

            if (i % 3 == 0 && i % 5 == 0) {
                message = "FizzBuzz";
            } else if (i % 5 == 0) {
                message = "Buzz";
            } else if (i % 3 == 0) {
                message = "Fizz";
            }

            // if (i % 3 == 0 && i % 5 == 0) {
            //     System.out.println("FizzBuzz");
            // } else if (i % 3 == 0) {
            //     System.out.println("Fizz");
            // } else if (i % 5 == 0) {
            //     System.out.println("Buzz");
            // } else {
            //     System.out.println(i);
            // }


            switch(message) {
                case "FizzBuzz":
                    System.out.println(message);
                    break;
                
                case "Fizz":
                    System.out.println(message);
                    break;
                
                case "Buzz":
                    System.out.println(message);
                    break;

                default:
                    System.out.println(i);
                    break;
            }
        }
    }   
}