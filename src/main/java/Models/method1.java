package Models;

import org.openqa.selenium.WebElement;

public class method1 {

    WebElement firstName;
    WebElement lastName;


    public method1(WebElement firstNameWE, WebElement lastNameWE) {
        this.firstName = firstNameWE;
        this.lastName = lastNameWE;

    }

    public void fillPartFormNameCityPhone(String firstName, String lastName)  {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);

    }
}
