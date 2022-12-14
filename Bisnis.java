/**
 * @author Dhafa Aryanda
 *Link : https://drive.google.com/file/d/1FX6oA4xAtm2KUy3EBfW2dA3sxItxAvxn/view?usp=sharing
 */

public class Bisnis extends Tabungan
{
    // ketentuan syarat
    private double SALDO_AWAL_MINIMUM = 1000000;
    private double SALDO_MINIMUM = 1000000;
    private double SETORAN_MINIMUM = 50000;

    public Bisnis(String nama, long noRekening, double saldoAwal) {
        super(nama, noRekening);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if (saldoAwal >= SALDO_AWAL_MINIMUM) {
            super.setSaldo(saldoAwal);
        }else
            System.out.println("Maaf, saldo anda tidak boleh kurang dari " + SALDO_AWAL_MINIMUM);
    }
}
