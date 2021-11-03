package main;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class instrumentMain{
    public static void main(String[] args) {
        instrumentMain m = new instrumentMain();
        System.out.println("==========================");
        System.out.println("---Fetching Data Ibanez---");
        m.GenerateIbanez("D:/RYAN/Kuliah/coding/Java/UTS/UTSGuitar/database/ibanez.txt");
  
        System.out.println("");
        System.out.println("==========================");
        System.out.println("---Fetching Data Taylor---");
        m.GenerateTaylor("D:/RYAN/Kuliah/coding/Java/UTS/UTSGuitar/database/taylor.txt");

        System.out.println("");
        System.out.println("==========================");
        System.out.println("---Fetching Data Yamaha---");
        m.GenerateYamaha("D:/RYAN/Kuliah/coding/Java/UTS/UTSGuitar/database/yamaha.txt");

        Scanner scan = new Scanner(System.in);
        System.out.println("ingin memilih prdouct yang mana?");
        String pesanan = scan.next();
        System.out.println ( pesanan+ " Akan diproses Terima Kasih");

    }

    public void GenerateIbanez (String path){
        File file = new File(path);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<ibanez> listIbanez = new ArrayList<ibanez>();

        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
                String[] data = line.split(",");

                ibanez i = new ibanez();
                i.setTypeGuitar(data[0]);
                i.setJumlahString(Integer.parseInt(data[1]));
                i.setBahan(data[2]);
                i.setNameIbanez(data[3]);
                i.setColourIbanez(data[4]);
                i.setPriceIbanez(Double.parseDouble(data[5]));

                listIbanez.add(i);
             }

        } catch (IOException ex){
             System.out.println("File " +file.getName()+ " tidak ditemukan..!!");
             System.out.println("Error: " +ex.getMessage());
        }

        for (ibanez i : listIbanez){
            System.out.println("=======================");
            System.out.println("Type Alat Musik Gitar : " +i.getNameIbanez() );
            System.out.println("Jumlah Senar : " +i.getJumlahString());
            System.out.println("Bahan Gitar : " +i.getBahan());
            System.out.println("Nama Gitar : " +i.getNameIbanez());
            System.out.println("Warna Gitar : " +i.getColourIbanez() );
            System.out.println("Harga : "+i.getPriceIbanez());
            System.out.println("");
        }

    }

    public void GenerateTaylor (String path){
        File file = new File(path);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<taylor> listTaylor = new ArrayList<taylor>();

        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
                String[] data = line.split(",");

                taylor t = new taylor();
                t.setTypeGuitar(data[0]);
                t.setJumlahString(Integer.parseInt(data[1]));
                t.setBahan(data[2]);
                t.setNameTaylor(data[3]);
                t.setColourTaylor(data[4]);
                t.setPriceTaylor(Double.parseDouble(data[5]));

                listTaylor.add(t);
             }

        } catch(IOException ex){
             System.out.println("File " +file.getName()+ " tidak ditemukan..!!");
             System.out.println("Error: " +ex.getMessage());
        }
        for (taylor t : listTaylor){
            System.out.println("=======================");
            System.out.println("Type Alat Musik Gitar : " +t.getNameTaylor() );
            System.out.println("Jumlah Senar : " +t.getJumlahString());
            System.out.println("Bahan Gitar : " +t.getBahan());
            System.out.println("Nama Gitar : " +t.getNameTaylor());
            System.out.println("Warna Gitar : " +t.getColourTaylor() );
            System.out.println("Harga : "+t.getPriceTaylor());
        }
    }

    public void GenerateYamaha (String path){
        File file = new File(path);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<yamaha> listYamaha = new ArrayList<yamaha>();

        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while(dis.available() != 0){
                String line = dis.readLine();
                String[] data = line.split(",");

                yamaha y = new yamaha();
                y.setTypeGuitar(data[0]);
                y.setJumlahString(Integer.parseInt(data[1]));
                y.setBahan(data[2]);
                y.setNameYamaha(data[3]);
                y.setColourYamaha(data[4]);
                y.setPriceYamaha(Double.parseDouble(data[5]));

                listYamaha.add(y);
             }

        } catch(IOException ex){
             System.out.println("File " +file.getName()+ " tidak ditemukan..!!");
             System.out.println("Error: " +ex.getMessage());
        }
        for (yamaha y : listYamaha){
            System.out.println("=======================");
            System.out.println("Type Alat Musik Gitar : " +y.getNameYamaha() );
            System.out.println("Jumlah Senar : " +y.getJumlahString());
            System.out.println("Bahan Gitar : " +y.getBahan());
            System.out.println("Nama Gitar : " +y.getNameYamaha());
            System.out.println("Warna Gitar : " +y.getColourYamaha() );
            System.out.println("Harga : "+y.getPriceYamaha());
            System.out.println("");
        }
    }
}

