public class Main {

    public static void main(String[] args) {
        Sony sony = new Sony(325, 100);
        Motorola motorola = new Motorola(100, 250);
        Samsung samsung = new Samsung(400, 2);
        sony.print();
        motorola.print();
        samsung.print();

        Model Mi = createObject("Mi");
        Model Nokia = createObject("Nokia");
        Model Iphone = createObject("Iphone");
        Mi.print();
        Nokia.print();
        Iphone.print();


    }

    public static Model createObject(String classname) {
        switch (classname) {
            case "Mi":
                Mi mi = new Mi(32, 25);
                return mi;
            case "Nokia":
                Nokia nokia = new Nokia(250, 13);
                return nokia;
            case "Iphone":
                Iphone iphone = new Iphone(1, 1);
                return iphone;
        }
        return null;
    }
}