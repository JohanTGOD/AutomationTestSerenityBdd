package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import starter.ui.SelectLocatorHomePageCalled;

public class HomePageQuestions {

    public static Question<Boolean> areTabMenusVisible() {
        return Presence.of(SelectLocatorHomePageCalled.ALL_MENU_OPTIONS_LABELS).asABoolean();
    }
}
