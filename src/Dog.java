public class Dog extends Animal implements ILand {

    // Members

    private int numberOfLegs;

    // Constructor

    public Dog(boolean isMammals, boolean isCarnivorous, int mood ){
        super(isMammals, isCarnivorous, mood);
        this.numberOfLegs = 4;
    }

    // Getters

    //implements ILand interface
    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    //Methods

    @Override
    public void sayHello(){
        System.out.println("wagging their tails");
    };

    //implements abstract method from Animal
    @Override
    public void sayHello(int mood){
        if (mood == MOOD_HAPPY){
            System.out.println("barking loudly");
        }
        else if (mood == MOOD_SCARE){
            System.out.println("whooping sound");
        }
        else {
            System.out.println("wagging their tails");
        }
    };


}
