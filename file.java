package com.company;

import java.io.*;
import java.util.concurrent.ForkJoinPool;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;



public class file {
   /* protected static void  write(File file) throws Exception {
        FileOutputStream fos =new FileOutputStream(file);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String name="admin";
        byte[]names=name.getBytes();

        bos.write(names);
        bos.flush();
        bos.close();
        fos.close();



        int i = 0;
        while ((i = bis.read()) != -1) {
            System.out.print((char) i);
        }

    }*/
    protected static void read(File file) throws Exception {
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);

        int a = 0;
        while ((a = bis.read()) !=-1) {
                                    System.out.print((char) a);
                                 }
        bis.close();
        fis.close();

    /*protected static void write()throws Exception{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter your first name");
        String name = br.readLine();
        JOptionPane.showMessageDialog(null,name);
    }*/
    }
}