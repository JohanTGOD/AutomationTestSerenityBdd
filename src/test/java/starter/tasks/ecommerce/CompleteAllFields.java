package starter.tasks.ecommerce;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static starter.ui.ecommerce.LocatorEcommerceFormContactUsPage.*;

public class CompleteAllFields {
    public static Performable withData(String subject, String email, String reference, String message) {
        return Task.where("Fill out form",
                SelectFromOptions.byVisibleText(subject).from(SUBJECT_SELECT),
                Enter.theValue(email).into(EMAIL_INPUT),
                Enter.theValue(reference).into(ORDER_INPUT),
                Enter.theValue(reference).into(MESSAGE_INPUT),
                Click.on(SEND_BUTTON));
    }
}
