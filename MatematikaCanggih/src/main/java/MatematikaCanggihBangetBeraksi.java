/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author MRvL
 */
public class MatematikaCanggihBangetBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematikaCanggihBanget matematikaCanggihBanget = new MatematikaCanggihBanget();

        int hasilPerkalian = matematikaCanggihBanget.perkalian(5, 3);
        System.out.println("Hasil perkalian         : " + hasilPerkalian);

        int hasilModulus = matematikaCanggihBanget.modulus(7, 3);
        System.out.println("Hasil modulus           : " + hasilModulus);
        
        int hasilPertambahanTiga = matematikaCanggihBanget.pertambahanTiga(2, 4, 6);
        System.out.println("Hasil pertambahan tiga  : " + hasilPertambahanTiga);
    }
}