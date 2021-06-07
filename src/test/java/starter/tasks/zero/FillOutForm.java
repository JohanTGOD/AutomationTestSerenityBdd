package starter.tasks.zero;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.zero.LocatorFeedbackPage;

public class FillOutForm {
    public static Performable withData(String user, String email, String subject, String comment) {
        return Task.where("fill out all the fields,",
        Enter.theValue(user).into(LocatorFeedbackPage.NAME_INPUT),
                Enter.theValue(email).into(LocatorFeedbackPage.EMAIL_INPUT),
                Enter.theValue(subject).into(LocatorFeedbackPage.SUBJECT_INPUT),
                Enter.theValue(comment).into(LocatorFeedbackPage.COMMENT_INPUT),
                Click.on(LocatorFeedbackPage.SEND_MESSAGE_BUTTON)
        );
    }
}
