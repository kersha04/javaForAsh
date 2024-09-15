package Models.Animals;

import Models.Caretakers.ICaretaker;
import Models.IAnimalSanctuaryObject;

// an animal is an abstract idea. It can be any number of things, no? So we'll make this abstract. It should adhere to our IAnimal and IAnimalSanctuary interfaces, meaning,
// if there is a method in one of those interfaces, this, or one of its child classes MUST provide an implementation of that method
public abstract class Animal implements IAnimal, IAnimalSanctuaryObject // we can remove this IAnimalSanctuaryObject from here because we get it from the interface, but I left it here to show how we can implement multiple interfaces
{
    // these are our private variables. We can set these values, or get these values using the methods below
    private boolean isAnimalFed = false;
    private String animalName;
    private int animalAge;
    // a caretaker is an object that is specific to our application. We define it, and we use it how we choose
    private ICaretaker animalCaretaker;

    // abstract methods are used to say hey interface, I don't know what the answer is here, but I guarantee that my child will
    // in this case, we know all animals have a type, but that is specific to the animal, so it is defined in the child animal class of rat/snake/etc
    @Override
    public abstract AnimalType getAnimalType();
    // samesies. all animals make sounds (or at least, they do in our sanctuary), but these sounds are different from animal to animal so our abstract animal class says, hey, ask the concrete for this info
    @Override
    public abstract String getSoundThisAnimalMakes();

    // these overrides just mean that we are overriding our interface, or in our children classes, our parent class (this class)
    // this method returns a type. This method returns a boolean
    // our boolean to return in this case is the variable isAnimalFed
    @Override
    public boolean getIsAnimalFed()
    {
        return isAnimalFed;
    }

    // setter methods are the opposite of the getMethods. This method has a boolean parameter, that means, we will pass in a boolean argument whereever we call this method
    // that value isFed that we pass in is set to the isAnimalFed. You can try this in the main method if you want to see it by printing a get, calling the set with an opposite value, then printing a get again and seeing it change
    @Override
    public void setIsAnimalFed(boolean isFed)
    {
        this.isAnimalFed = isFed;
    }

    // these next methods are very similar to those above. Get methods get a value
    @Override
    public String getAnimalName()
    {
        return animalName;
    }

    // and set methods set a value. always make sure you have a value set before you call the get
    @Override
    public void setAnimalName(String name)
    {
        animalName = name;
    }

    // sometimes we only need a get. like, we know what the species of the animal is, and that won't ever change (probably)
    @Override
    public String getAnimalSpecies()
    {
        // this gets the name of the class, which is a string value, and returns it.
        // if we call this from Rat, it returns rat. if we call it from... actually, just look at the main method, you'll see I'm not lying
        // we could absolutely not use this trickery, and sometimes we shouldn't. I did here so that I would not have to make this yet another abstract method that each child would have to provide an implementation to. Less maintenance. Neat right?
        return this.getClass().getSimpleName();
    }

    @Override
    public int getAnimalAge()
    {
        return animalAge;
    }

    @Override
    public void setAnimalAge(int age)
    {
        animalAge = age;
    }

    @Override
    public ICaretaker getAnimalCaretaker()
    {
        return animalCaretaker;
    }

    @Override
    public void setAnimalCaretaker(ICaretaker caretaker)
    {
        animalCaretaker = caretaker;
    }

    // here we can see the use of all our getters in action to print an animal.
    // but wait! we aren't defining the sound the animal makes in this class. How will that change. what is this trickery.
    // lets go to a concrete animal, such as rat, to find out!
    @Override
    public void printMe()
    {
        System.out.println("Animal Friend - " + this.getAnimalName());
        System.out.println("Species - " + this.getAnimalSpecies());
        System.out.println("Age - " + this.getAnimalAge());
        System.out.println("Type - " + this.getAnimalType());
        System.out.println(String.format("The %s goes %s", getAnimalSpecies(), getSoundThisAnimalMakes()));
        getAnimalCaretaker().printMe();
    }
}
