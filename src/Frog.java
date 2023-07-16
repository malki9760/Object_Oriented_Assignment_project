public class Frog extends Animal implements ILand, IWater {

    // Members

    private int numberOfLegs;

    // Constructor

    public Frog(boolean isMammals, boolean isCarnivorous, int mood){
        super(isMammals, isCarnivorous, mood);
        this.numberOfLegs = 4;
    }

    // Getters

    //implements IWater interface
    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }

    //implements ILand interface
    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    //Methods

    //implements abstract method from Animal
    @Override
    public void sayHello(int mood){
        if (mood == MOOD_HAPPY){
            System.out.println("quack quack quack");
        }
        else if (mood == MOOD_SCARE){
            System.out.println("plop into the water");
        }
    };
}
