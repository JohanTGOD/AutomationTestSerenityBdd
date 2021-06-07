package starter.questions.zero;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import starter.ui.zero.LocatorZeroHomePage;

public class HomePageQuestions {

    public static Question<Boolean> areTabMenusVisible() {
        return Presence.of(LocatorZeroHomePage.ALL_MENU_OPTIONS_LABELS).asABoolean();
    }
}
