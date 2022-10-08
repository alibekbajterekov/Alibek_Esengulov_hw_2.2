public class Motorola extends MobilePhone implements Printable {
    private int details;

    public int getDetails() {
        return details;
    }

    public Motorola(Integer calls, int details) {
        super(calls);
        this.details = details;
    }

    public Motorola (Integer calls){
        super(calls);
    }

    @Override
    public void print() {
        System.out.println("Motorola do the best details " + getDetails()+ " details");

    }
}
