import AplikasiJavaBerbasisOOP.Log_in;

class Barang extends Log_in {

    protected String KodeBarang;
    protected String NamaSupplier;
    protected String TanggalSimpan;
    protected String NamaBarang;
    protected String JenisBarang;
    protected String SatuanBarang;
    protected int HargaSatuan;
    protected int Stok;

    @Override
    public void tampil() {
        System.out.println("Kode Barang : " + KodeBarang);
        System.out.println("NamaSupplier : " + NamaSupplier);
        System.out.println("Tanggal Simpan : " + TanggalSimpan);
        System.out.println("Nama Barang : " + NamaBarang);
        System.out.println("Jenis Barang : " + JenisBarang);
        System.out.println("Satuan Barang : " + SatuanBarang);
        System.out.println("Harga Satuan : " + HargaSatuan);
        System.out.println("Stok : " + Stok);
    }
}