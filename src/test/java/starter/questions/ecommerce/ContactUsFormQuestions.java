package starter.questions.ecommerce;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import starter.ui.ecommerce.LocatorEcommerceFormContactUsPage;

import static starter.ui.ecommerce.LocatorEcommerceFormContactUsPage.EMAIL_INPUT;
import static starter.ui.ecommerce.LocatorEcommerceFormContactUsPage.SUBJECT_SELECT;

public class ContactUsFormQuestions {

    public static Question<Boolean> isSubjectFieldEnable() {
        return Enabled.of(SUBJECT_SELECT).asABoolean();
    }

    public static Question<Boolean> isEmailFieldEnable() {
        return Enabled.of(EMAIL_INPUT).asABoolean();
    }

    public static Question<Boolean> isOrderFieldEnable() {
        return Enabled.of(LocatorEcommerceFormContactUsPage.ORDER_INPUT).asABoolean();
    }

    public static Question<Boolean> isMessageFieldEnable() {
        return Enabled.of(LocatorEcommerceFormContactUsPage.MESSAGE_INPUT).asABoolean();
    }

    public static Question<Boolean> isSendButtonEnable() {
        return Enabled.of(LocatorEcommerceFormContactUsPage.MESSAGE_INPUT).asABoolean();
    }
}
