public class Mobil extends Kendaraan implements Aksi {

    public Mobil(String merk, double kecepatan) {
        super("Mobil", kecepatan, merk);
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil " + merk + " sedang bergerak dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil " + merk + " telah berhenti.");
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 120);
        mobil1.tampilInfo();
        mobil1.bergerak();
        mobil1.berhenti();
    }
}
