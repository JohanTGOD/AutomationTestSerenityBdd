package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Presence;
import starter.ui.SelectLocatorFeedbackPage;

public class FeedbackQuestion {

    public static Question<Boolean> isNameFieldVisible() {
        return Enabled.of(SelectLocatorFeedbackPage.NAME_INPUT).asABoolean();
    }

    public static Question<Boolean> isEmailFieldVisible() {
        return Presence.of(SelectLocatorFeedbackPage.EMAIL_INPUT).asABoolean();
    }

    public static Question<Boolean> isSubjectFieldVisible() {
        return Presence.of(SelectLocatorFeedbackPage.SUBJECT_INPUT).asABoolean();
    }

    public static Question<Boolean> isCommentFieldVisible() {
        return Presence.of(SelectLocatorFeedbackPage.COMMENT_INPUT).asABoolean();
    }
}
