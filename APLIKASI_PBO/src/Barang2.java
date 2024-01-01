import AplikasiJavaBerbasisOOP.Log_in;

class Barang2 extends Log_in {

    protected String KBarang;
    protected String NSupplier;
    protected String TSimpan;
    protected String NBarang;
    protected String JBarang;
    protected String SBarang;
    protected int HSatuan;
    protected int St;

    @Override
    public void tampil() {
        System.out.println("Kode Barang : " + KBarang);
        System.out.println("NamaSupplier : " + NSupplier);
        System.out.println("Tanggal Simpan : " + TSimpan);
        System.out.println("Nama Barang : " + NBarang);
        System.out.println("Jenis Barang : " + JBarang);
        System.out.println("Satuan Barang : " + SBarang);
        System.out.println("Harga Satuan : " + HSatuan);
        System.out.println("Stok : " + St);
    }
}