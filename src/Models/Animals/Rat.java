package Models.Animals;

public class Rat extends Animal
{
    @Override
    public AnimalType getAnimalType()
    {
        return AnimalType.Mammal;
    }

    // hey this was used in the Animal class, right? This is the joy of polymorphism.
    // we define and use this in the abstract class, but this here animal is the one actually providing the implementation
    // this saves us a lot of code. Try adding a dog class, or a cat or w/e.
    // How easy is it? You basically just need to copy paste, then change the animalType and the sound it makes. Don't believe me? Check out the snake
    // without doing it this way, each of our animals would be as long/longer than the animal class is. this is quite a time savings, and makes maintenance much easier
    @Override
    public String getSoundThisAnimalMakes()
    {
        String ANIMAL_SOUND = "squeak";
        return ANIMAL_SOUND + " " + ANIMAL_SOUND.repeat(1);
    }
}
