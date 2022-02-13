/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crear;


import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Crear {


    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list= new ArrayList<>();
        while(list.size()<1000000)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            list.add(random);
        }
        System.out.println("Hay: "+list.size()+" numeros en el array");
        Archivo.save(list);
        Archivo.order();
        
    }
    
}
