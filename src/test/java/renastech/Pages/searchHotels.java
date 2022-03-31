package renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchHotels extends BasePage{
    @FindBy(xpath = "//a[@data-cy='skhot-feature']")
    public WebElement hotelsButton;
    @FindBy(xpath = "//p[.='JW Marriott Parq Vancouver']")
    public WebElement getHotel;
    @FindBy(id = "destination-autosuggest")
    public WebElement destination;
}
