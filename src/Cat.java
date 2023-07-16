public class Cat extends Animal implements ILand {

    // Members

    private int numberOfLegs;

    // Constructor

    public Cat(boolean isMammals, boolean isCarnivorous, int mood ){
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
        System.out.println("meow~");
    };

    //implements abstract method from Animal
    @Override
    public void sayHello(int mood){
        if (mood == MOOD_HAPPY){
            System.out.println("purr, purr");
        }
        else if (mood == MOOD_SCARE){
            System.out.println("hiss");
        }
        else {
            System.out.println("meow~");
        }
    };
}
