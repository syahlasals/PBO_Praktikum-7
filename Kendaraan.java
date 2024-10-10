abstract class Kendaraan  {
    protected String jenisKendaraan;
    protected double kecepatan;
    protected String merk;

    public Kendaraan(String jenisKendaraan, double kecepatan, String merk) {
        this.jenisKendaraan = jenisKendaraan;
        this.kecepatan = kecepatan;
        this.merk = merk;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tampilInfo() {
        System.out.println(
            "Kendaraan : " + jenisKendaraan +
            "\nMerk : " + merk +
            "\nKecepatan : " + kecepatan + " km/jam");
    }
}