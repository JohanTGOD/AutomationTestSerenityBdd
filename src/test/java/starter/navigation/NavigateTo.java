package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable page(String page) {
        if (page.equalsIgnoreCase("security")) {
            return Task.where("{0} opens the Ecommerce bank page",
                    Open.browserOn().the(ZeroBankPage.class));
        } else {
            return Task.where("{0} opens the Ecommerce bank page",
                    Open.browserOn().the(EcommercePage.class));
        }

    }
}
