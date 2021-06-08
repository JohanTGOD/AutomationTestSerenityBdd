package starter.questions.zero;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Presence;
import starter.ui.zero.LocatorFeedbackPage;

public class FeedbackQuestion {

    public static Question<Boolean> isNameFieldEnable() {
        return Enabled.of(LocatorFeedbackPage.NAME_INPUT).asABoolean();
    }

    public static Question<Boolean> isEmailFieldEnable() {
        return Enabled.of(LocatorFeedbackPage.EMAIL_INPUT).asABoolean();
    }

    public static Question<Boolean> isSubjectFieldEnable() {
        return Enabled.of(LocatorFeedbackPage.SUBJECT_INPUT).asABoolean();
    }

    public static Question<Boolean> isCommentFieldEnable() {
        return Enabled.of(LocatorFeedbackPage.COMMENT_INPUT).asABoolean();
    }
}
