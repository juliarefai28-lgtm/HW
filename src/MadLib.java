public class MadLib {

    // The variables
    public String classmate;
    public String city;
    public String noun;
    public String adjective;
    public String pluralNoun;
    public String pluralAnimal;
    public boolean trueOrFalse;
    public double decimalBiggerThan1;
    public int number1;
    public int number2;
    public int wholeNumberBetween1And4;
    public String miltonTeacher;
    public String miltonDean;
    public char letterGrade;
    public String season;


        public static void main(String[] args) {
            MadLib myStory = new MadLib();
            //main method
        }

        // constructor method
        public MadLib() {

            // Step 3: Defining all the variables
            classmate = "Vedashree";
             city = "Boston";
             noun = "computer";
            adjective = "kind";
            pluralNoun = "pencils";
            pluralAnimal = "tigers";
           trueOrFalse = false;
           decimalBiggerThan1 = 22.2;
            number1 = 7;
           number2 = 8;
           wholeNumberBetween1And4 = 2;
           miltonTeacher = "Ms. Nazarali";
            miltonDean = "Mr.Leanord";letterGrade = 'A';
           season = "summer";

            // Step 4: Copied story text
            String story = "This weekend I am going camping with "
                    + classmate + ". We are going to a campsite in "
                    + city + ". I packed my " + noun + " and "
                    + pluralNoun + ". The forecast is calling for a high of "
                    + decimalBiggerThan1 + " degrees fahrenheit. So it should be a "
                    + adjective + " day! This year, the park rangers have seen "
                    + number1 + " " + pluralAnimal + " which seems kind of dangerous. "
                    + miltonTeacher + " said it's " + trueOrFalse + " that " + pluralAnimal + " eat class "
                    + wholeNumberBetween1And4 + " students in the " + season + ". But, "
                    + miltonDean + " said it actually has only happened "
                    + number2 + " times. Wish us luck! If we survive, we will earn a "
                    + letterGrade + "- in P.E. class.";

            // ending to print story out
            System.out.println(story);
        }
    }





