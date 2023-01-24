package sanity;
import Utilitis.CommonOps;
import extensions.ApiAction;
import extensions.Verifications;
import org.testng.annotations.Test;
import workflows.ApiFlows;


import static utilities.GetData.getData;

public class herokuappApi extends CommonOps {
    @Test()
    public void test01(){
        ApiFlows.post_booking("moshe","ben nun",15000,true,"Breakfast");
        }

    @Test
    public void test02(){
        Verifications.veryfiStatusCode(ApiAction.get(getData("Urlget")),200);
    }

    @Test
    public void test03(){
        ApiFlows.put_booking("moshe","ben nun",15000,true,"Breakfast","236");
    }

    @Test
    public void test04(){
        ApiAction.delete(getData("Urldelete"),"128");
    }







}
