package starter.questions.ecommerce;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

import static starter.ui.ecommerce.LocatorEcommerceFormContactUsPage.*;

public class ContactUsFormQuestions {

    public static Question<Boolean> isSubjectFieldEnable() {
        return Enabled.of(SUBJECT_SELECT).asABoolean();
    }

    public static Question<Boolean> isEmailFieldEnable() {
        return Enabled.of(EMAIL_INPUT).asABoolean();
    }

    public static Question<Boolean> isOrderFieldEnable() {
        return Enabled.of(ORDER_INPUT).asABoolean();
    }

    public static Question<Boolean> isMessageFieldEnable() {
        return Enabled.of(MESSAGE_INPUT).asABoolean();
    }

    public static Question<Boolean> isSendButtonEnable() {
        return Enabled.of(SEND_BUTTON).asABoolean();
    }

    public static Question<Boolean> isSuccessMessageEnable() {
        return Enabled.of(SUCCESS_MESSAGE_LABEL).asABoolean();
    }
}
