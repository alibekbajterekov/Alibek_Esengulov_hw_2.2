public abstract class Model implements Printable {
    Integer calls;

    public Model(Integer calls) {
        this.calls = calls;
    }

    public Integer getCalls() {
        return calls;
    }

    public void setCalls(Integer calls) {
        this.calls = calls;
    }
}
