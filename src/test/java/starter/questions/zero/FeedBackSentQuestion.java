package starter.questions.zero;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

public class FeedBackSentQuestion {
    public static Question<Boolean> messageOkIsVisible() {
        String script = "return document.documentElement.innerText.includes('Thank you');";
        Boolean scriptExecuted =(Boolean) BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).evaluateJavascript(script);
        Question<Boolean> result = Question.about("There is a new message").answeredBy(actor -> scriptExecuted);
        return result;
    }
}
