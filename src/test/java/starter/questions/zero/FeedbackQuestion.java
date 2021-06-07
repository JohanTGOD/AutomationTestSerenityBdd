package starter.questions.zero;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Presence;
import starter.ui.zero.LocatorFeedbackPage;

public class FeedbackQuestion {

    public static Question<Boolean> isNameFieldVisible() {
        return Enabled.of(LocatorFeedbackPage.NAME_INPUT).asABoolean();
    }

    public static Question<Boolean> isEmailFieldVisible() {
        return Presence.of(LocatorFeedbackPage.EMAIL_INPUT).asABoolean();
    }

    public static Question<Boolean> isSubjectFieldVisible() {
        return Presence.of(LocatorFeedbackPage.SUBJECT_INPUT).asABoolean();
    }

    public static Question<Boolean> isCommentFieldVisible() {
        return Presence.of(LocatorFeedbackPage.COMMENT_INPUT).asABoolean();
    }
}
