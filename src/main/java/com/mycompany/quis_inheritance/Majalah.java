/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quis_inheritance;

/**
 *
 * @author User
 */
public class Majalah extends ItemPerpustakaan {
    private int edisi;

    public Majalah(String judul, int edisi) {
        super(judul);
        this.edisi = edisi;
    }

    @Override
    public void display() {
        System.out.println("Majalah: " + judul + ", Edisi: " + edisi);
    }
}

