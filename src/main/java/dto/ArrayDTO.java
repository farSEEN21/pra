package dto;

import org.testng.annotations.DataProvider;
import static dto.auxiliaryDT.*;

public class ArrayDTO {
   @DataProvider(name = "DataArraylengthNumberTime")
    public static Object[][] dataArray() {
int searchnumber= new methodsForDTO().randomizer(90);
int length= new methodsForDTO().randomnumber()+5;
        return new Object[][]{{length,searchnumber,TimeOfOneIteration}};
      //  return new Object[][]{{10,11,23} };
    }


}
