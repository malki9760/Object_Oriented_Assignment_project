public abstract class Animal {

    // Members

    private boolean isMammals;  //a boolean indicating whether the animal is a mammal.
    private boolean isCarnivorous;  //a boolean indicating whether the animal is carnivorous.
    protected final int MOOD_HAPPY = 0;  // A constant representing a happy mood.
    protected final int MOOD_SCARE = 1; // A constant representing a scared mood.
    private int mood; // An integer representing the current mood of the animal.

    // Constructor

    public Animal(boolean isMammals, boolean isCarnivorous, int mood) {
        setMammals(isMammals);
        setCarnivorous(isCarnivorous);
        setMood(mood);
    }

    // Getters and Setters

    public boolean isMammals(){
        return isMammals;
    };

    public void setMammals(boolean isMammals){
        this.isMammals = isMammals;
    };

    public boolean isCarnivorous(){
        return isCarnivorous;
    };

    public void setCarnivorous(boolean isCarnivorous){
        this.isCarnivorous = isCarnivorous;
    };

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    // Methods

    public void sayHello() {
        // if don't have a usually hello say, say hello according to the animal mood
        sayHello(this.mood);
    }

    //each of the sons have to implements this method
    public abstract void sayHello(int mood) ;
}
