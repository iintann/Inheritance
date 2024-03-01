/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis_inheritance;

/**
 *
 * @author User
 */
public class Buku extends ItemPerpustakaan {
    private String pengarang;
    private int halaman;

    public Buku(String judul, String pengarang, int halaman) {
        super(judul);
        this.pengarang = pengarang;
        this.halaman = halaman;
    }

    @Override
    public void display() {
        System.out.println("Buku: " + judul + " oleh " + pengarang + ", Halaman: " + halaman);
    }
}