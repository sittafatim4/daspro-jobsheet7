import java.util.Scanner;
public class Mahasiswa12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jml = 1;
    String nama = "";
    String jenisKelamin = "";
    String output = "";
    
     while (jml <= 30){
        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();
        jml++;
        System.out.print("Masukkan jenis kelaminmu : ");
        jenisKelamin = sc.nextLine();
        if (jenisKelamin.equalsIgnoreCase("P")) {  
        output += nama;
     }
    }  System.out.printf("Mahasiswa Perempuan : %s \t",output);
    }
}