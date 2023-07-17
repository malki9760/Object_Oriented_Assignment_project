public class Program {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(true, true, 1), new Frog(false, false, 0), new Cat(true, true, 1)};
        for (Animal animal : animals) {
            //Check the type of the Animal.
            String typeOfAnimal = "";
            if (animal instanceof Cat) {
                typeOfAnimal = "Cat";
            } else if (animal instanceof Dog) {
                typeOfAnimal = "Dog";
            } else if (animal instanceof Frog) {
                typeOfAnimal = "Frog";
            };
            System.out.println("Hi i am a "+typeOfAnimal);
            System.out.println("usually i say hello:");
            animal.sayHello();
            String myMood = animal.getMood() == 0? "happy mood" : animal.getMood() == 1? "scare mood" : "normal mood";
            System.out.println("but now i am in a "+ myMood +" so i am saying hello by say:" );
            animal.sayHello(animal.getMood());
            System.out.println("this is some details about me:");
            if(animal.isMammals())
                System.out.println("I am a mammal");
            if(animal.isCarnivorous())
                System.out.println("I am a carnivorous");
            //Check if the animal instance of ILand if so creates a direct conversion
            if (animal instanceof ILand) {
                ILand landAnimal = (ILand) animal;
                System.out.println("I am a land animal");
                System.out.println("and i have "+landAnimal.getNumberOfLegs()+" legs");
            }
            //Check if the animal instance of IWater if so creates a direct conversion
            if (animal instanceof IWater) {
                IWater waterAnimal = (IWater) animal;
                System.out.println("I am a water animal");
                if (waterAnimal.hasLaysEggs())
                    System.out.println("and i can lay eggs");
                if (waterAnimal.hasGills())
                    System.out.println("and i have gills");
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
    }
}