/**
 * @author Dhafa Aryanda
 *Link : https://drive.google.com/file/d/1FX6oA4xAtm2KUy3EBfW2dA3sxItxAvxn/view?usp=sharing
 */

public class Haji extends Tabungan
{
    // ketentuan syarat
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINIMUM = 500000;
    private double SETORAN_MINIMUM = 100000;

    public Haji(String nama, long noRekening, double saldoAwal){
        super(nama, noRekening);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if (saldoAwal >= SALDO_AWAL_MINIMUM) {
            super.setSaldo(saldoAwal);
        }else
            System.out.println("Maaf, saldo anda tidak boleh kurang dari " + SALDO_AWAL_MINIMUM);
    }

    @Override
    public void tarikUang(double jumlahPenarikan) {
        if (jumlahPenarikan >= (0.1 * super.getSaldo())) {
            super.tarikUang(jumlahPenarikan + 5000);
        }else {
            super.tarikUang(jumlahPenarikan);
        }
    }
}
