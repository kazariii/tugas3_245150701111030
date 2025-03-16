public class Main {
    public static void main(String[] args) {
        PengirimanBarang barang1 = new PengirimanBarang();
        barang1.setNamaPengirim("Asep");
        barang1.setAlamatTujuan("Jalan Watumujur II No 18");
        barang1.setBerat(1.5);
        barang1.setBiayaAwal();

        barang1.hitungOngkir(10.0); //Menghitung biaya pengiriman setelah diskon persentase dari biaya dasar.
        barang1.displayInfoLogistik();

        PengirimanBarang barang2 = new PengirimanBarang();
        barang2.setNamaPengirim("Adit");
        barang2.setAlamatTujuan("Fakultas Ilmu Komputer Gedung F");
        barang2.setBerat(2.5);
        barang2.setBiayaAwal();

        barang2.hitungOngkir(10.0, 5000); //Menghitung biaya pengiriman setelah diskon persentase ditambah biaya tambahan. 
        barang2.displayInfoLogistik();

        PengirimanBarang barang3 = new PengirimanBarang();
        barang3.setNamaPengirim("Denis");
        barang3.setAlamatTujuan("Fakultas Ilmu Komputer Gedung G");
        barang3.setBerat(5.0);
        barang3.setBiayaAwal();

        barang3.hitungOngkir(70); //Menghitung biaya pengiriman berdasarkan jarak (>50 KM)
        barang3.displayInfoLogistik();

        PengirimanBarang barang4 = new PengirimanBarang();
        barang4.setNamaPengirim("Robert");
        barang4.setAlamatTujuan("Fakultas Hukum");
        barang4.setBerat(5.0);
        barang4.setBiayaAwal();

        barang4.hitungOngkir(25); //Menghitung biaya pengiriman berdasarkan jarak (>50 KM)
        barang4.displayInfoLogistik();

        //Menghitung biaya pengiriman dengan overload constructor
        PengirimanBarang barang5 = new PengirimanBarang("Rusdi", "Fakultas Kedokteran", 3.0);
        barang5.hitungOngkir(10.0);
        barang5.displayInfoLogistik();
    }
}
