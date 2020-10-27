    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan21;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program rata-rata nilai
 * 
 * 
 */
public class RataNilai {
    private final Scanner scanner;
    public RataNilai() {scanner = new Scanner(System.in);}
    
    private String getInput() {return scanner.nextLine();}
    
    private Integer getInteger(String test) {
        Integer temp;
        try {
            temp = Integer.parseInt(test);
        } catch (NumberFormatException ex) {
            System.err.println("Gagal proses, pastikan tidak ada titik, koma"
                    + ", apalagi huruf atau simbol!");
            return null;
        } catch (Exception ex) {
            System.err.println("Gagal proses!");
            return null;
        }
        return temp;
    }
    
    private int start() {
        String input;
        int banyakMHS;
        int totalNilai = 0;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        input = getInput();
        if(getInteger(input)!=null) banyakMHS = getInteger(input);
        else return -1;
        
        for (int i=1; i<=banyakMHS; i++ ) {
            System.out.print("Nilai Mahasiswa ke-".concat(Integer.toString(i)).
                    concat(" : "));
            input = getInput();
            if(getInteger(input)!=null) totalNilai += getInteger(input);
            else return -1;
        }
        
        double rataNilai = (double)totalNilai / (double)banyakMHS;
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah ".
                concat(Double.toString(rataNilai)));
        System.out.println("Developed by : Firman Sahita");
        
        return 0;
    }
    
    public static void main(String[] args) {
        RataNilai program = new RataNilai();
        program.start();
    }
}
