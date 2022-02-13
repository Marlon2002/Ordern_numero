/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crear;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Archivo {
       public static void save(ArrayList<Integer> numeros) throws IOException {
 
        String file = "numeros.txt";
 
        try {
            File file1= new File(file);
            FileWriter escribir= new FileWriter(file1,true);
            PrintWriter imprimir=new PrintWriter(escribir);   
            imprimir.print(numeros);
            imprimir.close();

            System.out.println("Guardado");
 
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se guardo");
        }
 
    }
    
    public static void order(){
        File fileO = new File("orden.txt");
        try{fileO.createNewFile();}catch (Exception ex) {}
        
        ArrayList<String> lines = new ArrayList<>();
        try(Scanner s = new Scanner(new File("numeros.txt")).useDelimiter(",")){
            while(s.hasNext()){
                lines.add(s.next());
            }
        }catch (Exception e) {
            System.out.println("Error.... "+e.getMessage());
        }
        ArrayList<Integer> result = getInteger(lines);
        Collections.sort(result);
        try{
            FileWriter writerO = new FileWriter(fileO);
            writerO.write(result.toString());
            writerO.flush();
            writerO.close();
        }catch (Exception ex) {
            
        }
    }

    public static ArrayList<Integer> getInteger(ArrayList<String>stringArray){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : stringArray){
            try{
                result.add(Integer.parseInt(stringValue.trim()));
            }catch (Exception ex) {
            }
        }
        return result;
    }
}
