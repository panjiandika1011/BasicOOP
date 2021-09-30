
package tugasadt;

import java.util.Scanner;

public class Nomor3 {
    static class pasien{
        String nama;
        String alamat;
        int telepon;
        int usia;
        int gender;
        String keluhanPenyakit;
        boolean BPJS;
    }
    
    static void inputData(int i, pasien[] arr){
        Scanner scan = new Scanner (System.in);
        
        arr[i] = new pasien();
        
        System.out.println("Masukan Nama : ");
        arr[i].nama = scan.next();
        
        System.out.println("Masukan Alamat : ");
        arr[i].alamat = scan.next();
        
        System.out.println("Masukan No. Telepon : ");
        arr[i].telepon = scan.nextInt();
        
        System.out.println("Masukan Usia : ");
        arr[i].usia = scan.nextInt();
        
        System.out.println("Masukan Gender (Pria = 0, Wanita = 1) : ");
        arr[i].gender = scan.nextInt();
        
        System.out.println("Masukan Keluhan Penyakit : ");
        arr[i].keluhanPenyakit = scan.next();
        
        System.out.println("Apakah Sudah Memiliki BPJS ? (true = punya, false = tidak) :");
        arr[i].BPJS = scan.nextBoolean();

    }
    
    public static int hitungUsiaPasienKurangDariX(int umur, boolean BPJS, int cariUsia){
        int counter = 0;
        if(umur < cariUsia && BPJS == true){
            counter = 1;
        }return counter;
    }
    
    public static int menghitungSisa(int jum){
        int sisa = 10 - jum;
        return sisa;
    }
    
    static void printData(int i, pasien[] arr){
        System.out.println("==============");
        System.out.println("Nama : "+ arr[i].nama);
        System.out.println("Alamat : "+ arr[i].alamat);
        System.out.println("Telepon : "+ arr[i].telepon);
        System.out.println("Usia : "+arr[i].usia);
        System.out.println("Gender : "+ arr[i].gender);
        System.out.println("Keluhan : "+arr[i].keluhanPenyakit);
        System.out.println("BPJS : "+ arr[i].BPJS);
        System.out.println("==============");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        char ulang;
        int jumlah = 0;
        
        pasien[]arr = new pasien[10];
        
        for(int i= 0; i < arr.length; i++){
            inputData(i, arr);
            
            do{
                System.out.println("Ingin melanjutkan Input ? (Y/N)");
                ulang = scan.nextLine().charAt(0);
            }while(ulang != 'Y' && ulang != 'N');
            System.out.println("===================");
            jumlah++;
            
            if(ulang == 'N'){
                break;
            }
        }
        
        if(jumlah == 10){
            System.out.println("Maaf, Pasien kebanyakan.");
            System.out.println("");
        }
        
        
        System.out.println("Batas umur yang dicari : ");
        int cariUsia = scan.nextInt();
        
        System.out.println("Nama Pasien : ");
        String cariNama = scan.next();
        
        System.out.println("");
        
        int sisa = menghitungSisa(jumlah);
        int totalUmur = 0;
        
        for(int i=0; i<jumlah; i++){
            int hitungUmur = hitungUsiaPasienKurangDariX(arr[i].usia, arr[i].BPJS, cariUsia);
            totalUmur = totalUmur + hitungUmur;
            if(arr[i].nama.equals(cariNama)){
                printData(i, arr);
            }
        }
        
        System.out.println("===========");
        System.out.println("Jumlah Pasien : "+jumlah);
        System.out.println("Yang Tersedia Tinggal : "+sisa);
        System.out.println("Pasien di bawah umur : "+cariUsia +" tahun  dan yang menggunakan BPJS ada : "+ totalUmur);
        
    }
}
