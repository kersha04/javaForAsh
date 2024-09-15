package Models.Caretakers;

import Models.Animals.AnimalType;
import Models.IAnimalSanctuaryObject;

import java.util.ArrayList;

public class Caretaker implements ICaretaker, IAnimalSanctuaryObject
{
    ArrayList<AnimalType> animalTypeSpecialty;
    String caretakerName;

    // you can create a constructor for your objects to instantiate them with.
    // If you don't, you will automatically get an empty constructor, and just need to set each of the fields (class level variables) that the object relies on using your getters and setter methods
    public Caretaker(String caretakerName, ArrayList<AnimalType> animalTypeCaresFor)
    {
        // we need to use 'this' here before caretakerName because the parameter name (caretakerName) is the same as our local variable name of caretakerName.
        // This explicitly differentiates them for the compiler
        this.caretakerName = caretakerName;
        // since the parameter and class level variable names are different, we are good without this keyword
        animalTypeSpecialty = animalTypeCaresFor;
    }
    @Override
    public String getCaretakerName()
    {
        return caretakerName;
    }

    @Override
    public void setCaretakerName(String name)
    {
        caretakerName = name;
    }

    @Override
    public void addAnimalTypeSpecialty(AnimalType animalType)
    {
        this.animalTypeSpecialty.add(animalType);
    }

    @Override
    public ArrayList<AnimalType> getAnimalTypeSpecialty()
    {
        return animalTypeSpecialty;
    }

    @Override
    public void printMe()
    {
        System.out.println("\nAnimal Friend's caretaker - " + this.getCaretakerName());
        String[] specialties = new String[this.getAnimalTypeSpecialty().size()];

        for(int i = 0; i < this.getAnimalTypeSpecialty().size(); i++)
        {
            specialties[i] = this.getAnimalTypeSpecialty().get(i).name();
        }
        System.out.print("Specialties - ");
        System.out.println(String.join(", ", specialties));
    }
}
