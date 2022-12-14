package homework11.App;
import java.util.Set;
public class RoboCat extends Pet{
    private Species spec= Species.ROBOCAT;

    public RoboCat(Species species, String nickname, int trickLevel) {
        species = spec;
        nickname = super.getNickname();
        trickLevel = super.getTrickLevel();
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        species = spec;
        nickname = super.getNickname();
        age = super.getAge();
        trickLevel = super.getTrickLevel();
        habits = super.getHabits();
    }

    public RoboCat() {
        this(Species.UNKNOWN, "RoboCat", 60);
    }
    public Species getSpec() {
        return spec;
    }

    public void setSpec(Species spec) {
        this.spec = spec;
    }


    @Override
    public void respond() {
        System.out.printf("I'm %s\n",this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Ups! I do something");
    }

    @Override
    public String toString() {
        return "RoboCat{" +
                "spec=" + spec +
                '}';
    }
}
