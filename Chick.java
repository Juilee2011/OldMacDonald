public class Chick implements Animal 
{
    private String sound1;
    private String sound2;
    private String type;
    private int randomSounds = (int)(Math.random()*2 + 1);

    public Chick(String sound1)
    {
        this.sound1 = sound1;
    }
    public Chick(String sound1, String sound2, String type)
    {
        this.sound1 = sound1;
        this.sound2 = sound2;
        this.type = type;
    }
    public String getSound()
    {
        if (randomSounds == 1)
        {
            return sound1;
        }
        if (randomSounds == 2)
        {
            return sound2;
        }
        return sound1;
    }
    public String getType()
    {
        return type;
    }

}
