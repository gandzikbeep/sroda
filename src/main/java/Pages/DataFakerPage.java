package Pages;

import com.github.javafaker.Company;
import com.github.javafaker.Faker;

import java.util.Locale;

public class DataFakerPage {
    private Faker faker;

    public DataFakerPage() {
        faker = new Faker(new Locale("en-US"));
    }

    public String getFakeFirstName() {
        return faker.name().firstName();
    }

    public String getFakeLastName() {
        return faker.name().lastName();
    }

    public String getFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String getFakePassword() {
        return  faker.internet().password();
    }

    public String getFakeCompany(){return faker.company().name(); }

    public String getFakeAddress() {return faker.address().streetAddress();}

    public String getFakeNumber() {return faker.number().digit();}

    public String getFakeCity() {return faker.address().city();}

    public String getFakeMobilePhone() {return faker.phoneNumber().cellPhone();}

    public String getFakeHomeNumber() {return faker.phoneNumber().cellPhone();}

   public String getFakeZipCode() {return faker.address().zipCode();}

    public String getFakeAddInfo() {return faker.cat().name();}
}
