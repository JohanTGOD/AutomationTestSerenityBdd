package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.SelectLocatorFeedbackPage;

public class FillOutForm {
    public static Performable withData(String user, String email, String subject, String comment) {
        return Task.where("fill out all the fields,",
        Enter.theValue(user).into(SelectLocatorFeedbackPage.NAME_INPUT),
                Enter.theValue(email).into(SelectLocatorFeedbackPage.EMAIL_INPUT),
                Enter.theValue(subject).into(SelectLocatorFeedbackPage.SUBJECT_INPUT),
                Enter.theValue(comment).into(SelectLocatorFeedbackPage.COMMENT_INPUT),
                Click.on(SelectLocatorFeedbackPage.SEND_MESSAGE_BUTTON)
        );
    }
}
