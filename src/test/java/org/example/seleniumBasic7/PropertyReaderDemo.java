package org.example.seleniumBasic7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderDemo {

    public static void main(String[] args) throws IOException {


        Properties prop = new Properties();
        String propFileName = System.getProperty("user.dir")+ "/data.properties";
        prop.load(new FileInputStream(propFileName));
        System.out.println(prop.getProperty("url"));

    }
}
