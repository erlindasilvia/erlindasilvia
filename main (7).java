import java.util.Scanner;


public class Main {
public static void main(String[]args){
    
    String nama_barang;
    int jumlah_barang, harga_barang, total_harga;
    Scanner in = new Scanner(System.in);
    double diskon = 0.025;
    double total_bayar;
    System.out.println("Program kasir sederhana");
    System.out.println("-----------------------");
    System.out.println("Masukan data berikut");
    System.out.println("\nNama Barang= ");
    nama_barang = in.nextLine();
    System.out.println("\nJumlah Barang= ");
    jumlah_barang = in.nextInt();
    if(jumlah_barang <=10) {
        System.out.println("\nHarga Barang=  ");
        harga_barang = in.nextInt();
        if (harga_barang<100000) {
    System.out.println("Anda mendapatkan diskon 2,5%");
    total_harga = jumlah_barang * harga_barang;
        System.out.println("Total Harga= "+ total_harga);
        diskon = total_harga * diskon;
        total_bayar = total_harga - diskon;
        System.out.println("Total Bayar= "+ total_bayar);
        
        System.out.println("-------------------------");
        System.out.println("Nota Belanja");
        System.out.println("-------------------------");
        System.out.println("Nama Barang =" + nama_barang);
        System.out.println("Jumlah Barang =" + jumlah_barang);
        System.out.println("Harga Barang =" + harga_barang);
        System.out.println("Total Harga="+ total_harga);
        System.out.println("Total Bayar ="+ total_bayar);
        System.out.println("-------------------------");
        System.out.println("TERIMA KASIH & SELAMAT BELANJA LAGI");
    }
    }
    }
}