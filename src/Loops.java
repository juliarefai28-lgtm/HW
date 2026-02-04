//class
public class Loops {
// main method
    public static void main(String[] args){
    new Loops();
    }
//constructor that calls the methods in order
    public Loops(){
        countUp();
        countByThrees();
        countDown();
        nestedLoop();
    }
// Method#1 loop that prints number 1 to 5
    public void countUp(){
        for (int i=1; i<=5;i++) {
            System.out.println(i);
        }
    }
    //Method#2 loop that prints number 3-15 by 3's
    public void countByThrees(){
        for (int i=3;i<=15;i+=3) {
            System.out.print(i+" ");
        }
    }
    //Method#3 loop that prints numbers from 10-1 by 1's
    public void countDown(){
        System.out.println( " ");
        for (int i=10; i>=1; i--) {
            System.out.print(i+", ");
        }
        System.out.println(" ");
        System.out.println("Happy Loop Year");
    }
    //Method#4 nested loop that prints a triangle where each row shoes the number repeated that many times
    public void nestedLoop() {
        for (int i = 1; i < 6; i=i+1) {
            System.out.println(" ");
            for (int x = 1; x <= i; x=x+1) {
                System.out.print( i+ " ");
            }
        }
    }
    
    }
