package org.example.Practice.July11th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        String file = System.getProperty("user.dir")+"/data.properties";
        prop.load(new FileInputStream(file));

        System.out.println(prop.getProperty("url"));


    }



}
