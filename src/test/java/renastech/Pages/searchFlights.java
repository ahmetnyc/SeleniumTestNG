package renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class searchFlights extends BasePage {
    @FindBy(id = "fsc-trip-type-selector-one-way")
    public WebElement oneWay;
    @FindBy(id = "fsc-origin-search")
    public WebElement originPlace;
    @FindBy(id = "fsc-destination-search")
    public WebElement destination;
    @FindBy(id = "depart-fsc-datepicker-button")
    public WebElement departDate;
    @FindBy(xpath = "//table//tr//td//button")
    public List<WebElement> calendar;
    @FindBy(xpath = "//button[@name='class-travellers-trigger']")
    public WebElement classSelection;
    @FindBy(id = "search-controls-cabin-class-dropdown")
    public WebElement cabinClassDropdown;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement donebutton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchFlights;


    public  void selectCabinClass(String cabin){
        Select select=new Select(cabinClassDropdown);
        select.selectByValue(cabin);

    }
}