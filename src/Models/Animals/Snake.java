package Models.Animals;

public class Snake extends Animal
{
    @Override
    public AnimalType getAnimalType()
    {
        return AnimalType.Reptile;
    }

    @Override
    public String getSoundThisAnimalMakes()
    {
        String ANIMAL_SOUND = "hiss";
        return ANIMAL_SOUND + " " + ANIMAL_SOUND.repeat(2);
    }
}
