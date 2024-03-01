/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quis_inheritance;

/**
 *
 * @author User
 */
public class Quis_Inheritance {

    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman Java", "Intan", 500);
        Majalah majalah = new Majalah("Teknologi Informasi", 5);
        DVD dvd = new DVD("Java Basic", 120);

        buku.display();
        buku.pinjam();
        buku.kembalikan();

        majalah.display();
        majalah.pinjam();

        dvd.display();
    }
}
