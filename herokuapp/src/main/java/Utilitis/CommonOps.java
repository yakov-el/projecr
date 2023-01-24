package Utilitis;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.GetData.getData;

public class CommonOps extends Base {



    @BeforeMethod
    public static   void initApi()  {
        httpRequest = RestAssured.given().auth().preemptive().basic("admin","password123");
    }




}
