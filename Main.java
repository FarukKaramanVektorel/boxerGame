public class Main {
    public static void main(String[] args) {
        Boksor ahmet = new Boksor("Ahmet", 15, 100, 90, 60);
        Boksor ali = new Boksor("Ali", 10, 85, 90, 50);
        Musabaka mac = new Musabaka(ahmet, ali, 90, 100);
        mac.roundBasla();
    }
}
