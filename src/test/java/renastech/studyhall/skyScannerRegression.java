package renastech.studyhall;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import renastech.Pages.searchFlights;
import renastech.Pages.searchHotels;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class skyScannerRegression {
    searchFlights obj=new searchFlights();
    searchHotels obj2 =new searchHotels();


    @Test
    public void TC1_getSky(){
        DriverUtil.getDriver().get("https://www.skyscanner.ca");
        obj.oneWay.click();
        obj.originPlace.sendKeys(Keys.DELETE+"YYZ");
        obj.destination.sendKeys("JFK"+ Keys.ENTER);
        obj.departDate.click();
        for (WebElement each:obj.calendar){
            if (each.getAttribute("aria-label").contains("31")){
                each.click();
                break;
            }
        }
        obj.classSelection.click();
        obj.selectCabinClass("PremiumEconomy");
        obj.donebutton.click();
        obj.searchFlights.click();

    }
    @Test
    public void  TC2_(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("skyScannerEnv"));
        obj2.hotelsButton.click();
       // obj2.getHotel.click();
        obj2.destination.sendKeys("New York"+Keys.ENTER);

    }
}
