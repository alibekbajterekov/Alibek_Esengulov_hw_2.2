public class Iphone extends Model implements Printable{
    private Integer displays;

    public Iphone(Integer calls, Integer displays) {
        super(calls);
        this.displays = displays;
    }

    public Integer getDisplays() {
        return displays;
    }

    public void setDisplays(Integer displays) {
        this.displays = displays;
    }

    @Override
    public void print() {
        System.out.println(" Iphone displays: "+ getDisplays()+"  was calls: " + getCalls());

    }
}
