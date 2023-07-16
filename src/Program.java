public class Program {
    public static void main(String[] args) {
        Animal[] animals = { new Frog(false, false, 0), new Cat(true, true, 0), new Dog(true, true, 1)};
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
            System.out.println("usually the " + typeOfAnimal + " say hello:");
            animal.sayHello();
            String myMood = animal.getMood() == 0? "happy mood" : animal.getMood() == 1? "scare mood" : "normal mood";
            System.out.println("but now i am in a "+ myMood +" so i am saying hello by say:" );
            animal.sayHello(animal.getMood());
            System.out.println("this is some details about me:");
            if(animal.isMammals())
                System.out.println("the " + typeOfAnimal + " have mammal");
            if(animal.isCarnivorous())
                System.out.println("the " + typeOfAnimal + " is a carnivorous");
            //Check if the animal instance of ILand if so creates a direct conversion
            if (animal instanceof ILand) {
                ILand landAnimal = (ILand) animal;
                System.out.println("the "+typeOfAnimal+" have "+landAnimal.getNumberOfLegs()+" legs");
            }
            //Check if the animal instance of IWater if so creates a direct conversion
            if (animal instanceof IWater) {
                IWater waterAnimal = (IWater) animal;
                if (waterAnimal.hasLaysEggs())
                    System.out.println("the "+typeOfAnimal+" can lay eggs");
                if (waterAnimal.hasGills())
                    System.out.println("the "+typeOfAnimal+" have gills");
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }

    }
}