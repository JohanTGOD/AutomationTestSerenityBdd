package starter.tasks.ecommerce;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static starter.ui.ecommerce.LocatorEcommerceHomePage.SEARCH_BUTTON;
import static starter.ui.ecommerce.LocatorEcommerceHomePage.SEARCH_INPUT;

public class FindProduct {

    public static Performable byName(String product) {
        return Task.where(
                "actor searches by product",
                Enter.theValue(product).into(SEARCH_INPUT),
                Click.on(SEARCH_BUTTON)
        );
    }
}
