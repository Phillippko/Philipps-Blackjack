import java.util.Random;

enum  Names {
    JOHN, ANATOLY, GRIGORY;

    public static Names genName() {
        Names[] values = Names.values();
        Random rand = new Random();
        return values[rand.nextInt(values.length)];
    }
}
enum  Surnames {
    SMITH, PUPKIN;

    public static Surnames genSurname() {
        Surnames[] values = Surnames.values();
        Random rand = new Random();
        return values[rand.nextInt(values.length)];
    }
}
