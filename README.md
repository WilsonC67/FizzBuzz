# FizzBuzz

## What is this project?
FizzBuzz is a very simple program that prints all numbers from 1 to 100 (inclusive), but with a twist! 

For each number between the range, it will print "Fizz" if the number is divisible by 3, and "Buzz" if the number is divisible by 5, and "FizzBuzz" if the number is divisible by 15 (which is divisible by both 3 and 5).

In the code, it will check in this order: 

If the number is divisible by 15, it will set the value of the String to "FizzBuzz".

If the number is divisible by 3, it will set the value of the String to "Fizz".

If the number is divisible by 5, it will set the value of the String to "Buzz".

If the number is not divisible by 3, 5, or 15, it will just print the number. 

After checking the divisibility of the number, the code uses a switch statement to check the value of the String and prints the corresponding message.

In this project, this code is an alternative to the switch statement:
```Java
if (i % 3 == 0 && i % 5 == 0) {
    System.out.println("FizzBuzz");
    } else if (i % 3 == 0) {
        System.out.println("Fizz");
    } else if (i % 5 == 0) {
        System.out.println("Buzz");
    } else {
        System.out.println(i);
    }
```

It looks ugly though, and IMO it's much more satisfying to use a switch statement.