/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis_inheritance;

/**
 *
 * @author User
 */
public class DVD extends ItemPerpustakaan {
    private int durasi; // Durasi dalam menit

    public DVD(String judul, int durasi) {
        super(judul);
        this.durasi = durasi;
    }

    @Override
    public void display() {
        System.out.println("DVD: " + judul + ", Durasi: " + durasi + " menit");
    }
}

