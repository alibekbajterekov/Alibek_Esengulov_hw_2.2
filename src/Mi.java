public class Mi extends Model implements Printable {
    private Integer zoom;

    public Mi(Integer calls, Integer zoom) {
        super(calls);
        this.zoom = zoom;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public Mi(Integer calls) {
        super(calls);
    }

    @Override
    public void print() {
        System.out.println(" Mi zoom: " + getZoom() +" was calls: " + getCalls());

    }
}
