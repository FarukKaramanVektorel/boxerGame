public class Musabaka {
    Boksor boksor1;
    Boksor boksor2;
    int minSiklet;
    int maxSiklet;

    public Musabaka(Boksor boksor1, Boksor f2, int minSiklet, int maxSiklet) {
        this.boksor1 = boksor1;
        this.boksor2 = f2;
        this.minSiklet = minSiklet;
        this.maxSiklet = maxSiklet;
    }

    public void roundBasla() {
        int raund = 1;
        if (sikletKontrolEt()) {
            while (boksor1.saglik > 0 && boksor2.saglik > 0) {
                if (roundKontrol(raund)) {
                    break;
                }
                System.out.println("======== " + raund + ". ROUND ===========");
                boksor2.saglik = boksor1.hit(boksor2);
                if (kazanan()) {
                    break;
                }
                boksor1.saglik = boksor2.hit(boksor1);
                if (kazanan()) {
                    break;
                }
                spiker();
                raund++;
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean sikletKontrolEt() {
        return (boksor1.siklet >= minSiklet && boksor1.siklet <= maxSiklet) && (boksor2.siklet >= minSiklet && boksor2.siklet <= maxSiklet);
    }

    public boolean kazanan() {
        if (boksor1.saglik == 0) {
            System.out.println("Maçı Kazanan : " + boksor2.ad);
            return true;
        } else if (boksor2.saglik == 0) {
            System.out.println("Maçı Kazanan : " + boksor2.ad);
            return true;
        }
        return false;
    }

    public boolean roundKontrol(int raund) {
        if (raund == 6) {
            System.out.print("Toplamda oynanan round: " + raund);
            if (boksor1.saglik < boksor2.saglik) {
                System.out.print("\nMaçı Kazanan : " + boksor2.ad);
                return true;
            } else if (boksor2.saglik < boksor1.saglik) {
                System.out.print("\nMaçı Kazanan : " + boksor1.ad);
                return true;
            } else {
                System.out.println("Maç Berabere Bitti");
                return true;
            }
        }

        return false;
    }


    public void spiker() {
        System.out.println("------------");
        System.out.println(boksor1.ad + " Kalan Can \t:" + boksor1.saglik);
        System.out.println(boksor2.ad + " Kalan Can \t:" + boksor2.saglik);
    }
}
