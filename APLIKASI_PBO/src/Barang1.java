import AplikasiJavaBerbasisOOP.Log_in;

class Barang1 extends Log_in {

    protected String KoBarang;
    protected String NaSupplier;
    protected String TaSimpan;
    protected String NaBarang;
    protected String JeBarang;
    protected String SaBarang;
    protected int HaSatuan;
    protected int Stk;

    @Override
    public void tampil() {
        System.out.println("Kode Barang : " + KoBarang);
        System.out.println("NamaSupplier : " + NaSupplier);
        System.out.println("Tanggal Simpan : " + TaSimpan);
        System.out.println("Nama Barang : " + NaBarang);
        System.out.println("Jenis Barang : " + JeBarang);
        System.out.println("Satuan Barang : " + SaBarang);
        System.out.println("Harga Satuan : " + HaSatuan);
        System.out.println("Stok : " + Stk);
    }
}