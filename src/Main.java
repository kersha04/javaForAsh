// these imports are from our own application. since these are all in a different package, we need to import them to use them.
// basically, if we had dropped all this crap in the main src folder, we could all share a package, and need less imports, but I like tidiness
// you'll notice in the animal class and interface, though, that we do not require importing AnimalType because it is in the same package
import Models.Animals.AnimalType;
import Models.Animals.IAnimal;
import Models.Animals.Rat;
import Models.Animals.Snake;
import Models.Caretakers.Caretaker;
import Models.Caretakers.ICaretaker;

// these are javas stuffs that we need to import to use it. You don't really need to remember these things. Intellij will tell you when you need an import and usually do it for you. You just need to know you need an arraylist, list, etc
import java.util.ArrayList;
import java.util.List;

// this is the main method. It's the start and end of your application.
public class Main
{
    public static void main(String[] args)
    {
        // there is very little reason to build this stuff here other than just for to display how methods and such work
        // we could probably take this as entry from a user through the console, but really, this is all data that would
        // more likely be stored in a db somewhere, and this would be an api rather than a console app.
        // that said, this app is brilliant, and this is what it does

        // we create our Animal. In this case, our animal be a rat
        IAnimal rat = new Rat();
        // animals have names, and we set that name by calling the following method, passing the animalName in as an argument. In this case, a name is a string, and that is "Razzy".
        // we can hover over setAnimalName to see that it returns void, so we aren't expecting anything back
        rat.setAnimalName("Razzy");
        // same here, but with an int, which is a whole number within a certain +- range
        rat.setAnimalAge(4);
        // same here, but with a Caretaker. Caretaker is an object/model that we are defining within our application.
        // we could create a caretaker like we did with our Rat, and then pass that caretaker and pass it in as an argument to the setAnimalCaretaker, but since we don't use it for anything else, I just set it in here.
        rat.setAnimalCaretaker(new Caretaker("Jim",
                new ArrayList<>(List.of(AnimalType.Mammal, AnimalType.Reptile))));
        rat1.printMe();

        System.out.println("---------------------------------------------------------------------------------------------------------");
        // This is what that would look like.
        IAnimal snake = new Snake();
        snake.setAnimalName("Hissy");
        snake.setAnimalAge(42);
        // This is what it would look like if we broke it down further and created the caretaker, then passed it into our snake.
        // This is functionally the same as what we did with the rat, but we really only need to do this if it makes it more readable (favor readability) or we need to modify that caretaker on another line with like, the setName or addSpecialty or something
        ICaretaker snakeCaretaker = new Caretaker("Billy", new ArrayList<>(List.of(AnimalType.Amphibian, AnimalType.Reptile)));
        snake.setAnimalCaretaker(snakeCaretaker);
        snake.printMe();
    }
}