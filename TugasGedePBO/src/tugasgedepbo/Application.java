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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author node06
 */
public class Application {
    public static int a;
    public static String b;
    public static double c;
    public static Scanner sc = new Scanner(System.in);
    private static final String fortang = "yyyy-MM-dd HH:mm";
    public static SimpleDateFormat sdf = new SimpleDateFormat(fortang);
    
    public static void main_menu(){
        System.out.println("Welcome to Train System Information Service \n "
                + "1. Buy Ticket \n"
                + "2. Admin Menu \n");
        a = sc.nextInt();
        switch (a){
            case 1:
//                not yet
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
            case 4:
                try {
                    manage_route();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                admin_menu();
        }
        main_menu();
        
    }
    
    public static void manage_route() throws FileNotFoundException{
        Reader reader = new InputStreamReader(new FileInputStream("route.json"));
        Gson gson = new GsonBuilder().create();
        Type listType = new TypeToken<ArrayList<Rute>>(){
        }.getType();
        ArrayList<Rute> routes = gson.fromJson(reader,listType);
        
        System.out.println("ukuran"+routes.size());
        if(!routes.isEmpty()){
            routes.stream().forEach((rute) -> {
                System.out.println(rute.getAwal().getNamaStasiun());
            });
        } else {
            System.out.println("No Data \n");
        }
        
        System.out.println("1. add route");
        System.out.println("2. edit or delete route?");
        a = sc.nextInt();

        switch(a){
            case 1:
                //tampilkan daftar kereta dan stasiun
                Rute baru = new Rute();
                baru.setAwal(new Stasiun("bandung","Bandung"));
                System.out.println("not yet");
                break;
            case 2:
                routes = udel_route(routes);
        }
        
        try(Writer writer = new OutputStreamWriter(new FileOutputStream("route.json") , "UTF-8")){
            gson.toJson(routes,writer);
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        admin_menu();
        
    }

    private static ArrayList<Rute> udel_route(ArrayList<Rute> routes) {
        System.out.println("which route?");
        a = sc.nextInt();
        Rute temp = routes.get(a);
        int x = a;
        ArrayList<Rute> sementara = routes;
        System.out.println(temp.getAwal());
        System.out.println(temp.getTujuan());
        System.out.println(temp.getBerangkat());
        System.out.println(temp.getTiba());
        System.out.println(temp.getPrice());
        System.out.println("\n what change? \n"
                + "1. initial station \n"
                + "2. destiny \n"
                + "3. change departure time \n"
                + "4. change arrival time \n"
                + "5. change price \n"
                + "6. manage ticket order \n"
                + "7. delete it"
                );
        a = sc.nextInt();
        switch(a){
            case 1:
//                            muat data stasiun
                System.out.println("not yet available");
            case 2:
//                            muat data stasiun
                System.out.println("not yet available");
            case 3:
                System.out.println(fortang);
                b = sc.nextLine();
                try {
                    temp.setBerangkat(sdf.parse(b));
                } catch (ParseException ex) {
                    Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 4:
                System.out.println(fortang);
                b = sc.nextLine();
                try {
                    temp.setTiba(sdf.parse(b));
                } catch (ParseException ex) {
                    Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 5:
                c = sc.nextDouble();
                temp.setPrice(c);
                break;
            case 6:
                temp.setTickets(manage_ticket(temp.getTickets()));
                break;
            case 7:
                sementara.remove(x);
                return sementara;
        }
        sementara.set(x, temp);
        return sementara;
    }  

    private static ArrayList<Tiket> manage_ticket(ArrayList<Tiket> tickets) {
        ArrayList<Tiket> sementara = tickets;
        Tiket temp;
        System.out.println("which ticket do you want to delete?");
        sementara.stream().forEach((tiket) -> {
            System.out.println(tiket.getNamaPenumpang()+"("+tiket.getIdPenumpang()+")");
        });
        a = sc.nextInt();
        sementara.remove(a);
        return sementara;   
    }
}
