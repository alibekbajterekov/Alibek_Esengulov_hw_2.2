public class Samsung extends MobilePhone implements Printable {
    public int headPhones;

    public Samsung(Integer calls, int headPhones) {
        super(calls);
        this.headPhones = headPhones;
    }

    public int getHeadPhones() {
        return headPhones;



    }


    @Override
    public void print() {
        System.out.println(" Samsung used: " + getHeadPhones() + " HeadPhones ");

    }
}

