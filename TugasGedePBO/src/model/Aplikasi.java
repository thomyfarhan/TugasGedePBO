/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.*;

/**
 *
 * @author azaqo
 */
//berguna untuk crud apapun
public class Aplikasi {
    List<Kereta> keretas; 
    final static String keretajsonfile = "keretas.json";

    public Aplikasi() {
        this.keretas = Collections.synchronizedList(new ArrayList<Kereta>());
    }
    
    public void loadKeretas() throws IOException{
        //load daftar kereta dari file
        Reader is = new InputStreamReader(new FileInputStream(keretajsonfile));
        
    }

    public List<Kereta> getKeretas() {
        return keretas;
    }
    
    public void writeKeretas(Kereta k) throws IOException{
        //tulis keretas ke file
        Gson gson = new Gson();
        Type listOfTestObject = new TypeToken<List<Kereta>>(){}.getType();

        Writer os = new OutputStreamWriter(new FileOutputStream(keretajsonfile));
        keretas.add(k);
        
        gson.toJson(keretas,os);
        os.close();
    }
}
