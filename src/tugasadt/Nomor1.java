
package tugasadt;

import java.util.Scanner;

public class Nomor1 {
    static class city{
        String nama = "Bandung";
        String provinsi = "Jawa Barat";
        double Latitude = -6.914744;
        double Longitude = 107.609810;
    }
  
    
    public static void main(String[] args) {
        city printCity;
        printCity = new city();
        System.out.println(printCity.nama);
        System.out.println(printCity.provinsi);
        System.out.println(printCity.Latitude);
        System.out.println(printCity.Longitude);
    }
    
}
