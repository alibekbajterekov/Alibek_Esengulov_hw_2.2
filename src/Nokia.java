public class Nokia extends Model implements Printable{
    private Integer bottoms;

    public Nokia(Integer calls, Integer bottoms) {
        super(calls);
        this.bottoms = bottoms;
    }

    public Integer getBottoms() {
        return bottoms;
    }

    public void setBottoms(Integer bottoms) {
        this.bottoms = bottoms;
    }

    public Nokia(Integer calls) {
        super(calls);
    }

    @Override
    public void print() {
        System.out.println(" Nokia Bottoms: "+ getBottoms()+ " was calls "+ getCalls());

    }
}
