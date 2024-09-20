/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

public class Main {
    public static void main(String[] args) {
        String word = "basketball";

        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
        System.out.println(letter);
        }
        


    }
}
// In order to make this work I had to use the help of google and gemini. I had to find out how to make java recognize that each letter of the word "basketball" was equal to a numberical value. In order to do this I had to use the word.charAt function so the loop knew to count each letter at a certain numerical value. The letter b for example would be the number 0 as it is the first letter in the word basketball whereas the letter k would be a numberical value of 3 since the string starts at numberical value 0 and ends at 9. The loop starts at 0 and ends at 9 therefore it will print out the first letter of basketball which is "b" and end at the letter "l"