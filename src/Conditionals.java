public class Conditionals {
    // Constructor
    public Conditionals() {
        int randomInt = (int) (Math.random() * 11); // from 0 to 10

        if (randomInt == 0) {
            System.out.println("Yes of course you will!");
        } else if (randomInt == 1) {
            System.out.println("Never in your life.");
        } else if (randomInt == 2) {
            System.out.println("Cannot tell you now.Too busy");
        } else if (randomInt == 3) {
            System.out.println("Without a doubt.");
        } else if (randomInt == 4) {
            System.out.println("Ask again later.");
        } else if (randomInt == 5) {
            System.out.println("Ummm... no");
        } else if (randomInt == 6) {
            System.out.println("Cannot predict right now.");
        } else if (randomInt == 7) {
            System.out.println("Very doubtful.");
        } else if (randomInt == 8) {
            System.out.println("Yes, definitely.");
        } else {
            System.out.println("No.");
        }
    }

    public static void main(String[] args) {
        String question = "Will I get a dog someday?";
        System.out.println("Question: " + question);

        // Run the Magic Eight Ball
        Conditionals magicEightBall = new Conditionals();
    }
}
