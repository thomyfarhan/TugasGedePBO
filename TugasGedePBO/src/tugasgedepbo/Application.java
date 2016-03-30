/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasgedepbo;

import java.util.*;
import java.io.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


/**
 *
 * @author node06
 */
public class Application {
    public static int a;
    public static Scanner sc = new Scanner(System.in);
    public static void main_menu(){
        System.out.println("Welcome to Train System Information Service \n "
                + "1. Buy Ticket \n"
                + "2. Admin Menu \n");
        a = sc.nextInt();
        switch (a){
            case 1:
//                kucing
            case 2:
                admin_menu();
        }
    }
    
    public static void admin_menu(){
        
        System.out.println("Hello Mr. Admin \n"
                + "1. Manage Ticket \n"
                + "2. Manage Station \n"
                + "3. Manage Train \n"
                + "4. Manage Route \n");
        a = sc.nextInt();
        switch (a){
            case 1:
                
        }
    }
    
    public static void manage_route() throws FileNotFoundException{
        Gson gson = new Gson();
        Rute temp;
        Type listType = new TypeToken<ArrayList<Rute>>(){
        }.getType();
        BufferedReader br = new BufferedReader(new FileReader("route.json"));
        ArrayList<Rute> routes = gson.fromJson(br, listType);
        
        if(routes.size()<=0){
            for (int i = 0; i<routes.size();i++) {
                System.out.println(i + "."+routes.get(i).getAwal().getKota() + " - " + routes.get(i).getTujuan() + "(" + routes.get(i).getBerangkat() + "-" + routes.get(i).getTiba() + ")");
            }
            
            a = sc.nextInt();
            temp = routes.get(a);
            
            System.out.println("edit \n"
                    + "1.destiny\n"
                    + "2.");
            
        } else {
            System.out.println("No Data \n");
            admin_menu();
        }
        
        
    }
    
}
