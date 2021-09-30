
package tugasadt;

import java.util.Scanner;

public class Nomor2 {
    static class karyawan{
        String nama;
        String jabatan;
        Alamat alamat = new Alamat();
        Penghasilan penghasilan = new Penghasilan();
        
    }
    
    static class Alamat{
        String jalan;
        String kota;
        String provinsi;
    }
    
    static class Penghasilan{
        double gaji;
        double tunjanganTransport;
        double tunjanganMakan;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        karyawan arr[] = new karyawan[5];
        int i;
        for (i = 0; i < arr.length; i++){
            arr[i] = new karyawan();
            
            System.out.println("Masukan Nama : ");
            arr[i].nama = scan.next();
            
            System.out.println("Masukan Jabatan : ");
            arr[i].jabatan = scan.next();
            
            System.out.println("Masukan Nama Jalan : ");
            arr[i].alamat.jalan = scan.next();
            
            System.out.println("Masukan Nama Kota : ");
            arr[i].alamat.kota = scan.next();
            
            System.out.println("Masukan Nama Provinsi : ");
            arr[i].alamat.provinsi = scan.next();
            
            System.out.println("Masukan Gaji : ");
            arr[i].penghasilan.gaji = scan.nextDouble();
            
            System.out.println("Masukan Tunjangan Transport : ");
            arr[i].penghasilan.tunjanganTransport = scan.nextDouble();
            
            System.out.println("Masukan Tunjangan Makan : ");
            arr[i].penghasilan.tunjanganMakan = scan.nextDouble();
        }
        
        for (i = 0; i < arr.length; i++){
            System.out.println("Nama : "+ arr[i].nama);
            System.out.println("Jabatan : "+ arr[i].jabatan);
            System.out.println("Kota : "+ arr[i].alamat.kota);
            System.out.println("Provinsi : "+ arr[i].alamat.provinsi);
            System.out.println("Jalan : "+ arr[i].alamat.jalan);
            System.out.println("Gaji : "+ arr[i].penghasilan.gaji);
            System.out.println("Tunjangan Transport : "+ arr[i].penghasilan.tunjanganTransport);
            System.out.println("Tunjangan Makan : "+ arr[i].penghasilan.tunjanganMakan);
        }
    }
}
