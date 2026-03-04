package com.example.installer;

import com.example.ru1.Ru1Service;
import com.example.ru2.Ru2Service;
import com.example.ru3.Ru3Service;

public class MainApplication {

    public static void main(String[] args) {

        Ru1Service ru1 = new Ru1Service();
        Ru2Service ru2 = new Ru2Service();
        Ru3Service ru3 = new Ru3Service();

        System.out.println(ru1.getMessage());
        System.out.println(ru2.getMessage());
        System.out.println(ru3.getMessage());

        System.out.println("Installer Completed Successfully!");
    }
}
