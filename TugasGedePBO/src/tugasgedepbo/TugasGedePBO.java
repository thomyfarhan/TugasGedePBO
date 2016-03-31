/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasgedepbo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author node06
 */
public class TugasGedePBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.main_menu();
//        Scanner sc = new Scanner(System.in);
//        Double a = sc.nextDouble();
//        try(Writer writer = new OutputStreamWriter(new FileOutputStream("route.json") , "UTF-8")){
//            Gson gson = new GsonBuilder().create();
//            
//            ArrayList<Rute> routes = new ArrayList<>();
//            Rute route = new Rute();
//            route.setAwal(new Stasiun("Bandung","Bandung"));
//            routes.add(route);
//            gson.toJson(routes,writer);
//        } catch (IOException ex) {
//            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        try{
//            Reader reader;
//            reader = new InputStreamReader(new FileInputStream("route.json"));
//            Gson gson = new GsonBuilder().create();
//            Type listType = new TypeToken<ArrayList<Rute>>(){
//            }.getType();
//            ArrayList<Rute> p = gson.fromJson(reader,listType);
//            p.stream().forEach((rute) -> {
//                System.out.println(rute.getAwal().getNamaStasiun());
//            });
//        } catch (IOException ex) {
//            Logger.getLogger(TugasGedePBO.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
