public class Motor extends Kendaraan implements Aksi {

    public Motor(String merk, double kecepatan) {
        super("Motor", kecepatan, merk);
    }

    @Override
    public void bergerak() {
        System.out.println("Motor " + getMerk() + " sedang bergerak dengan kecepatan " + getKecepatan() + " km/jam.");
    }

    @Override
    public void berhenti() {
        System.out.println("Motor " + getMerk() + " telah berhenti.");
    }

    public static void main(String[] args) {
        Motor motor1 = new Motor("Yamaha", 80);
        motor1.tampilInfo();
        motor1.bergerak();
        motor1.berhenti();

        motor1.setKecepatan(60);
        System.out.println("Kecepatan baru motor: " + motor1.getKecepatan() + " km/jam.");
        motor1.bergerak();
    }
}
