/**
 * @author Dhafa Aryanda
 *Link : https://drive.google.com/file/d/1FX6oA4xAtm2KUy3EBfW2dA3sxItxAvxn/view?usp=sharing
 */

public class Tabungan
{
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimum = 0;
    private double setoran_minimum = 0;

    public Tabungan() {

    }

    public Tabungan(String nama, long noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
    }

    protected void setSaldoMinimum(double saldo_minimum) {
        this.saldo_minimum = saldo_minimum;
    }

    protected void setSetoranMinimum(double setoran_minimum) {
        this.setoran_minimum = setoran_minimum;
    }

    public double getSaldo() {
    return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(double uang) {
        if (uang >= setoran_minimum) {
            this.saldo = saldo + uang;

        }else
            System.out.println("Maaf, uang yang disetor kurang dari minimum setoran");
    }

    public void tarikUang(double jumlahPenarikan) {
        if (jumlahPenarikan > 0 && jumlahPenarikan <= saldo && (saldo - jumlahPenarikan) >= saldo_minimum) {
            this.saldo = saldo - jumlahPenarikan;
        }
        else if (jumlahPenarikan > saldo) {
            System.out.println("Saldo anda tidak cukup!");
        }
        else if ((saldo - jumlahPenarikan) < saldo_minimum) {
            System.out.println("Maaf, saldo anda tidak boleh kurang dari saldo minimum");
        }
        else
            System.out.println("Periksa kembali inputan anda");
        }
    }
