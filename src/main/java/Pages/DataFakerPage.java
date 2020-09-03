package Pages;

import com.github.javafaker.Faker;

public class DataFakerPage {
    private Faker faker;

    public DataFakerPage() {
        faker = new Faker();
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
        return faker.internet().password();
    }
}
