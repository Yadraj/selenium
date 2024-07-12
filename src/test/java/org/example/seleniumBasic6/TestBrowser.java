package org.example.seleniumBasic6;

public class TestBrowser {


    public void testBrouser(){


        Loginpage_POM loginpagePom = new Loginpage_POM();
        loginpagePom.login("username","password");

    }


}
