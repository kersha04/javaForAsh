This is a simple program that demonstrates the use of interfaces, abstract classes, classes, methods, variables, etc

This can be done any number of ways, but maybe start with Main. This is the driver of your application, and what executes when you hit go.
That said, what is in the main method is usually pretty basic, and in this instance, it just builds a couple of objects that are then printed to the console

This isn't perfect. There are things that I would like to do here that are not done, but it is not bad for at least explaining here and there
Also, remember, I don't really Java, so I took the path of least resistance in some places because it's been about 7 years since I last Java'd

Most of the code is explained through comments. I know in school they teach comments comments.
At work, we practice commenting through code. That is, very light amounts of comments because the code speaks for itself

Let me know if you have any questions.

From main, maybe check out
IAnimal
Animal
Rat
then maybe the snake just to see how cool inheritance is

ICaretaker
Caretaker

IAnimalSanctuaryObject

I put my models in my models folder, there are other spots for things, but really, professionally, this stuff will likely already be determined by an application you are working in, and you should just follow the pattern
Don't get too caught up in it here.
Maybe check out SOLID principles for other organizational needs.


You mentioned what to put into classes. This is somewhat subjective. Somewhat.
I only want things in my class that have to do with that class specifically. If it doesn't, I break it out
Sometimes you may want to put a private method in a class. This can help with a computation or something. Like maybe, a dyeHair method in the rat class.
You can do this, but I'd ask, is this really pertaining to a rat, or should you instead have a separate "Service" class (you could drop this in a Services folder) and name it something like HairService.
We could then pass the rat to the service to get its hair did rather than making that hair dye a part of the rat object. This makes a lot more sense, right?
Again, sometimes a small private helper method is OK, but testing a private method can be difficult, and really,
if it's a private method, chances are there is a good argument for it to be in another class entirely because it is used by the place it is defined, and not actually a definition of the rat