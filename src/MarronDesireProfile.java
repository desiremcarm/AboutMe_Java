import java.util.Arrays;

public class MarronDesireProfile {

    // ATTRIBUTES
    private String name;
    private String story;
    private String[] hobbies;
    private String[] foods;
    private String[] funFacts;

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", \n story='" + story + '\'' +
                ", \n hobbies=" + Arrays.toString(hobbies) +
                ", \n foods=" + Arrays.toString(foods) +
                ", \n funFacts=" + Arrays.toString(funFacts) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getHobbies() {
        return Arrays.toString(hobbies);
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getFoods() {
        return Arrays.toString(foods);
    }

    public void setFoods(String[] foods) {
        this.foods = foods;
    }

    public String getFunFacts() {
        return Arrays.toString(funFacts);
    }

    public void setFunFacts(String[] funFacts) {
        this.funFacts = funFacts;
    }
}
