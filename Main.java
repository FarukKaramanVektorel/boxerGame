public class Main {
    public static void main(String[] args) {
        Boksor marc = new Boksor("Ahmet", 15, 100, 90, 60);
        Boksor alex = new Boksor("Ali", 10, 85, 90, 50);
        Musabaka r = new Musabaka(marc, alex, 90, 100);
        r.roundBasla();
    }
}
