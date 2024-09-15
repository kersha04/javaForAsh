// this is the package our caretakers are located in. this is what we would import if we needed to use caretaker
package Models.Caretakers;

// these are our own models. we import them when we need to use them. the ide is usually smart enough to figure this out
import Models.Animals.AnimalType;
import Models.IAnimalSanctuaryObject;
// we import ArrayList from the java libraries because we need to use it. We do not need to import things like string, int, etc
import java.util.ArrayList;

public interface ICaretaker extends IAnimalSanctuaryObject
{
    public String getCaretakerName();
    public void setCaretakerName(String name);
    public void addAnimalTypeSpecialty(AnimalType animalType);
    public ArrayList<AnimalType> getAnimalTypeSpecialty();
}
