public class Sony extends MobilePhone implements Printable{
    private static Integer Sounds;

    public Sony(Integer calls, Integer sounds) {
        super(calls);
        Sounds = sounds;
    }

    public static Integer getSounds() {
        return Sounds;
    }

    public Sony (Integer calls){
        super(calls);

    }

    @Override
    public void print() {

    System.out.println("Sony do the best sounds " + getSounds()+" Sounds");
    }
}