import java.util.Scanner;

public class MarronDesireMain {

    final String MENU_MSG = "1️⃣ To see user's story \n" +
            "2️⃣ To see user's favorite foods&hobbies \n" +
            "3️⃣ To see user's fun facts \n" +
            "and 4️⃣ To exit (even thought we're sad to see you go!🥹)";

    // CONST COLORS
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        MarronDesireMain program = new MarronDesireMain();
        program.init();
    }

    /**
     * Calls the function that sets up the user profile
     * @return void
     */
    public void init(){
        settingUpProfile();
    }

    // CREATING MY PROFILE
    /**
     * Sets up the profile with the data provided
     * @return void
     */
    public void settingUpProfile(){

        // NEW PROFILE OBJ
        MarronDesireProfile p = new MarronDesireProfile();

        // SETTING MY NAME
        p.setName("Desire");

        // SETTING MY STORY
        p.setStory("My dream is to program the next robotic generation, I want to be a robo-mom!🤖");

        // SETTING HOBBIES, FUN FACTS & FAVORITE FOOD
        p.setHobbies(createHobbies());
        p.setFunFacts(createFunFacts());
        p.setFoods(createFavFoods());

        // CALLING INIT MENU
        showMenu(p);
    }

    /**
     * Shows the App menu
     * @return void
     */
    public void showMenu(MarronDesireProfile p){
        int option = 0; // Menu option
        Scanner sc = new Scanner(System.in); // Creating scanner

        do {
            // Displaying menu messages
            System.out.println("Choose an option:");
            System.out.println(ANSI_BLUE + MENU_MSG);

            // Checking if the option is a valid int - else, asks a new value
            while(!sc.hasNextInt()){
                System.out.println(ANSI_RED + "⚠️ That value is not valid. Try again");
                sc.next();
            }
            option = sc.nextInt(); // Getting the option

            // Displaying each option's case if the option is valid
            switch (option){
                case 1:
                    System.out.println(ANSI_WHITE + "\n" + p.getStory() + "\n");
                    option = resetMenu(option);
                    break;
                case 2:
                    System.out.println(ANSI_WHITE + "\n" + p.getFoods());
                    System.out.println(ANSI_WHITE + p.getHobbies() + "\n");
                    option = resetMenu(option);
                    break;
                case 3:
                    System.out.println(ANSI_WHITE + "\n" + p.getFunFacts() + "\n");
                    option = resetMenu(option);
                    break;
                case 4:
                    System.out.println(ANSI_WHITE + "\n" + "Thank you for checking this prototype!");
                    break;
                default:
                    break;
            }
        }while(option!=4);

    }

    // HELPERS
    /**
     * Rest menu option variable to 0 after choosing an displaying a valid option
     * @return int
     */
    private int resetMenu(int option){
        return option = 0;
    }

    // GENERATING MY DATA
    /**
     * Sets up the profile data for hobbies, funfacts and favorite foods
     * @return array of strings
     */
    public String[] createHobbies(){
        String[] newHobbies = {"Write✒️", "Sing🎙️", "Study📖", "Play videogames🎮"};
        return newHobbies;
    }

    public String[] createFunFacts(){
        String[] newFunFacts = {"😨: The fear of long words is called Hippopotomonstrosesquippedaliophobia",
        "\n☀️: The Sun makes a sound but we can't hear it",
        "\n🤣: Laughing came before language"};
        return newFunFacts;
    }

    public String[] createFavFoods(){
        String[] newFavFood = {"🧀", "🍨", "🍓"};
        return newFavFood;
    }
}