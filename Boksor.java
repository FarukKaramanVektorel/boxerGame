public class Boksor {
    String ad;
    int guc;
    int saglik;
    int siklet;
    double kacinma;

    public Boksor(String ad, int guc, int health, int siklet, double kacinma) {
        this.ad = ad;
        this.guc = guc;
        this.saglik = health;
        this.siklet = siklet;
        this.kacinma = kacinma;
    }

    public int hit(Boksor rakip) {
        System.out.println("------------");
        System.out.println(this.ad + " => " + rakip.ad + " " +  this.guc + " hasar vurdu.");
        if (rakip.kacinma()) {
            System.out.println(rakip.ad + " gelen hasarı savurdu.");
            return rakip.saglik;
        }
        if (rakip.saglik - this.guc < 0)
            return 0;
        return rakip.saglik - this.guc;
    }
    public boolean kacinma() {
        double rastgeleDeger = Math.random() * 100;  //0.0 to 99.9
        return rastgeleDeger <= this.kacinma;
    }
}
