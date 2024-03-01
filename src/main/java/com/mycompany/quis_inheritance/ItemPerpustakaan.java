/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis_inheritance;

/**
 *
 * @author User
 */
public abstract class ItemPerpustakaan {
    protected String judul;
    protected boolean tersedia;

    public ItemPerpustakaan(String judul) {
        this.judul = judul;
        this.tersedia = true; // Secara default, setiap item baru tersedia
    }

    public void pinjam() {
        if (tersedia) {
            tersedia = false;
            System.out.println(judul + " berhasil dipinjam.");
        } else {
            System.out.println(judul + " saat ini tidak tersedia.");
        }
    }

    public void kembalikan() {
        tersedia = true;
        System.out.println(judul + " telah dikembalikan.");
    }

    public abstract void display(); // Metode abstrak untuk ditentukan oleh subclass
}

