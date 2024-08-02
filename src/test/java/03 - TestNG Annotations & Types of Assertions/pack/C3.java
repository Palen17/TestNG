package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

    @Test
    void pqr(){
        System.out.println("this is pqr from C3");
    }

    @BeforeSuite
    void bs(){
        System.out.println("this is BeforeSuite from c3");
    }

    @AfterSuite
    void as(){
        System.out.println("this is AfterSuite from c3");
    }
}
