/**
 * @author Dhafa Aryanda
 *Link : https://drive.google.com/file/d/1FX6oA4xAtm2KUy3EBfW2dA3sxItxAvxn/view?usp=sharing
 */

import java.util.Scanner;

public class testTabungan {
    public static void main(String[] args) {
        //Variabel
        String nama;
        long noRekening, min = 100001, max = 300001;
        double saldoAwal, uang, penarikan;
        String restart;
        mainMenu();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Pilihan anda: ");
        int pilih = userInput.nextInt();

        if (pilih == 1) {
            System.out.println("Untuk mendaftar tabungan Bisnis anda" +
                    " diminta mengisi form berikut!");
            System.out.println("\n~Data Pendaftar~");
            System.out.print("Masukkan nama anda: ");
            userInput.nextLine();
            nama = userInput.nextLine();

            noRekening = (long) (min + Math.random() * (max - min));
            System.out.print("Masukkan saldo awal anda: ");
            saldoAwal = userInput.nextInt();
            Bisnis user = new Bisnis(nama, noRekening, saldoAwal);
            System.out.println("Anda terdaftar dengan data sebagai berikut!\n");
            System.out.println("Nama: " + nama);
            System.out.println("Nomor rekening: " + noRekening);
            System.out.println("Saldo awal: " + saldoAwal);
            System.out.println("Anda akan diarahkan ke Menu Tabungan Bisnis");
            do {
                restart = "t";
                menuBisnis();
                System.out.print("Pilihan anda: ");
                int pilihmenu = userInput.nextInt();
                if (pilihmenu == 1) {
                    System.out.println("Saldo anda saat ini: " + user.getSaldo());
                    System.out.print("Simpan uang: ");
                    uang = userInput.nextInt();
                    user.simpanUang(uang);
                    System.out.println("Anda menyimpan sebanyak " + uang);
                    System.out.println("Saldo anda: " + user.getSaldo());
                    System.out.println("Kembali ke menu Bisnis? (y/t)");
                    restart = userInput.next();
                }
                if (pilihmenu == 2) {
                    System.out.println("Saldo anda saat ini: " + user.getSaldo());
                    System.out.print("Tarik uang: ");
                    penarikan = userInput.nextInt();
                    user.tarikUang(penarikan);
                    System.out.println("Anda menarik sebanyak " + penarikan);
                    System.out.println("Saldo anda: " + user.getSaldo());
                    System.out.println("Kembali ke menu Bisnis? (y/t)");
                    restart = userInput.next();
                }
                if (pilihmenu == 3) {
                    System.out.println("Anda keluar");
                } else
                    System.out.println("Program berhenti");
            } while (restart.equals("y") || restart.equals("Y"));
        }
        else if (pilih == 2) {
            System.out.println("Untuk mendaftar tabungan Haji anda" +
                    " diminta mengisi form berikut!");
            System.out.println("\n~Data Pendaftar~");
            System.out.print("Masukkan nama anda: ");
            userInput.nextLine();
            nama = userInput.nextLine();
            noRekening = (long) (min + Math.random() * (max - min));
            System.out.print("Masukkan saldo awal anda: ");
            saldoAwal = userInput.nextInt();
            Haji user = new Haji(nama, noRekening, saldoAwal);
            System.out.println("Anda terdaftar dengan data sebagai berikut!\n");
            System.out.println("Nama: " + nama);
            System.out.println("Nomor rekening: " + noRekening);
            System.out.println("Saldo awal: " + saldoAwal);
            System.out.println("Anda akan diarahkan ke Menu Tabungan Haji");
            do {
                restart = "t";
                menuHaji();
                System.out.print("Pilihan anda: ");
                int pilihmenu = userInput.nextInt();
                if (pilihmenu == 1) {
                    System.out.println("Saldo anda saat ini: " + user.getSaldo());
                    System.out.print("Simpan uang: ");
                    uang = userInput.nextInt();
                    user.simpanUang(uang);
                    System.out.println("Anda menyimpan sebanyak " + uang);
                    System.out.println("Saldo anda: " + user.getSaldo());
                    System.out.println("Kembali ke menu Haji? (y/t)");
                    restart = userInput.next();
                }
                if (pilihmenu == 2) {
                    System.out.println("Saldo anda saat ini: " + user.getSaldo());
                    System.out.print("Tarik uang: ");
                    penarikan = userInput.nextInt();
                    user.tarikUang(penarikan);
                    System.out.println("Anda menarik sebanyak " + penarikan);
                    System.out.println("Saldo anda: " + user.getSaldo());
                    System.out.println("Kembali ke menu Bisnis? (y/t)");
                    restart = userInput.next();
                }
                if (pilihmenu == 3) {
                    System.out.println("Anda keluar");
                } else
                    System.out.println("Program berhenti");
            } while (restart.equals("y") || restart.equals("Y"));
        }


        }
        private static void mainMenu () {
            System.out.println("+===================================+");
            System.out.println("|           APLIKASI TABUNGAN       |");
            System.out.println("|           1. Bisnis               |");
            System.out.println("|           2. Haji                 |");
            System.out.println("|           3. Exit                 |");
            System.out.println("+===================================+");
        }

        private static void menuBisnis () {
            System.out.println("+===================================+");
            System.out.println("|            Menu Bisnis            |");
            System.out.println("|            1. Simpan Uang         |");
            System.out.println("|            2. Tarik tunai         |");
            System.out.println("|            3. Exit                |");
            System.out.println("+===================================+");
        }

        private static void menuHaji () {
            System.out.println("+===================================+");
            System.out.println("|            Menu Haji              |");
            System.out.println("|            1. Simpan Uang         |");
            System.out.println("|            2. Tarik tunai         |");
            System.out.println("|            3. Exit                |");
            System.out.println("+===================================+");
        }
    }


