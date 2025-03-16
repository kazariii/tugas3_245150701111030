public class PengirimanBarang {
    String namaPengirim;
    String alamatTujuan;
    double jarak=10;
    double berat;
    double biayaDasar = 10000;
    double biayaAwal;
    double diskon;
    double biayaPengiriman;
    double biayaTambahan;

    PengirimanBarang(){}

    void separator(){
        System.out.println("====================");
    }

    void setNamaPengirim(String namaPengirim){
        this.namaPengirim = namaPengirim;
    }
    void setAlamatTujuan(String alamatTujuan){
        this.alamatTujuan = alamatTujuan;
    }
    double setBerat(double berat){
        return this.berat = berat;
    }
    double setBiayaAwal(){
        this.biayaAwal = this.biayaDasar*this.berat;
        return this.biayaAwal;
    }
    

    PengirimanBarang(String namaPengirim, String alamatTujuan, double berat){
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaAwal = this.biayaDasar * this.berat;
        ;
    }

    public double hitungOngkir(double diskonPersen){
        this.diskon = diskonPersen;
        biayaPengiriman = (biayaAwal + biayaTambahan) - (0.1 * (biayaAwal + biayaTambahan));
        return biayaPengiriman;
    }

    public double hitungOngkir (double diskonPersen, double biayaTambahan){
        this.diskon = diskonPersen;
        this.biayaTambahan = biayaTambahan;
        biayaPengiriman = (biayaAwal + biayaTambahan) - (0.1 * (biayaAwal + biayaTambahan));
        return biayaPengiriman;
    }

    public double hitungOngkir (int jarak){
        if(jarak>50){
            this.jarak = jarak;
            biayaPengiriman = (biayaAwal + biayaTambahan) + (0.1 * (biayaAwal + biayaTambahan));
            return biayaPengiriman;
        }
        else{
            this.jarak=jarak;
            biayaPengiriman = (biayaAwal + biayaTambahan) + (0.05 * (biayaAwal + biayaTambahan));
            return biayaPengiriman;
        }
    }


    public void displayInfoLogistik(){
        System.out.println("Nama: "+this.namaPengirim);
        System.out.println("Alamat: "+this.alamatTujuan);
        System.out.println("Jarak: "+this.jarak);
        System.out.printf("Berat: %.1f\n",this.berat);
        System.out.printf("Biaya Awal: %.2f\n",this.biayaAwal);
        System.out.printf("Biaya Tambahan: %.2f\n",this.biayaTambahan);
        System.out.printf("Diskon: %.0f\n",this.diskon);
        System.out.printf("Ongkir: %.2f\n",this.biayaPengiriman);
        separator();
    }

}
