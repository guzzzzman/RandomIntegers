// Jose Guzman
// October 19, 2023
// Created a method that runs random ints and finds the min, max, and sum
// File name: RandomIntegers.java
// To Compile in terminal type: javac RandomIntegers.java
// To Run in terminal type: java RandomIntegers
public class RandomIntegers
{
    public static int randint(int min, int max)
    {
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static void main(String[] args)
    {
        int smallest = 0, num = 0, largest = 0;
        double sum = 0;

        System.out.println("Generating 11 random numbers between 20 to 50:");
        for (int i = 0; i < 11; i++)
        {
            num = randint(20, 50);
            System.out.print(num + " ");
            sum += num;

            if (i == 0) // true the first time we go through the loop
            {
            	//make smallest and largest equal to the first number
                smallest = num;
                largest = num;
            }
            else
            {
                if (num < smallest)//if any number is less than the smallest,
                    smallest = num;//then that number is the new smallest
                if (num > largest)
                    largest = num;
            }
        }

        System.out.println("\nSmallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        System.out.println("Sum of numbers: " + sum);
    }
}
/*
Generating 11 random numbers between 20 to 50:
30 22 44 41 39 21 20 46 28 32 21
Smallest number: 20
Largest number: 46
Sum of numbers: 344.0
*/