package Models.Animals;

import Models.Caretakers.ICaretaker;
import Models.IAnimalSanctuaryObject;

public interface IAnimal extends IAnimalSanctuaryObject
{
    public AnimalType getAnimalType();
    public boolean getIsAnimalFed();
    public void setIsAnimalFed(boolean isFed);
    public String getAnimalSpecies();
    public String getAnimalName();
    public void setAnimalName(String name);
    public int getAnimalAge();
    public void setAnimalAge(int age);
    public ICaretaker getAnimalCaretaker();
    public void setAnimalCaretaker(ICaretaker caretaker);
    public String getSoundThisAnimalMakes();
}
