package starter.tasks.ecommerce;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static starter.ui.ecommerce.LocatorEcommerceHomePage.CONTACT_US_BUTTON;

public class Select {
    public static Performable contactUsPage() {
        return Task.where("Select Contact us page",
                Click.on(CONTACT_US_BUTTON)
        );
    }
}
