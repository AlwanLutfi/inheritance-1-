class BangunDatar {
    double luas;
    double keliling;

    public double luasbangun() {
        return luas;
    }

    public double kelilingbangun() {
        return keliling;
    }
}

class Persegi extends BangunDatar {
    double sisi;

    public void setPersegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luasbangun() {
        return sisi * sisi;
    }

    @Override
    public double kelilingbangun() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;
    double pi = 22 / 7;

    public void setLingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luasbangun() {
        return pi * jariJari * jariJari;
    }

    @Override
    public double kelilingbangun() {
        return 2 * pi * jariJari;
    }
}

public class hitung {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        persegi.setPersegi(3);
        lingkaran.setLingkaran(7);
        System.out
                .println(" Luas persegi: " + persegi.luasbangun() + ", Keliling persegi: " + persegi.kelilingbangun());
        System.out.println(
                "  Luas lingkaran: " + lingkaran.luasbangun() + ", Keliling persegi: " + lingkaran.kelilingbangun());
    }
}
