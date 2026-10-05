public class TestFarm 
{
    public static void main (String [] args)
    {
        Cow cow = new Cow("moo", "Cow");
        System.out.println("The " + cow.getType() + "goes " + cow.getSound());

        Chick chick = new Chick("cheep", "cluck", "Chick");
        System.out.println("The " + chick.getType() + "goes " + chick.getSound());

        //Pig pig = new Pig("oink", "Pig")
        //System.out.println("The " + pig.getType() + "goes " + pig.getSound());
    }
    
}
