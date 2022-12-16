
/**
 * Write a description of class fizzBuzz here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class FizzBuzz
{
    public static void main(String[] args){
        int count = 0;
        for(int i = 0; i <100; i++){
            count++;
            if (count % 3 == 0 && count % 5 == 0){
                System.out.println("fizz-buzz");
            }
            else if(count % 3 == 0 && count % 5 != 0){
                System.out.println("fizz");
            }
            else if(count % 3 != 0 && count % 5 == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(count);
            }
        }
    }
}
