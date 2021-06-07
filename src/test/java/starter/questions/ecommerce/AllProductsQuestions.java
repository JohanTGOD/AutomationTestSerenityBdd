package starter.questions.ecommerce;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.ui.ecommerce.LocatorsEcommerceResultPage.SEARCH_INPUT;

public class AllProductsQuestions {
    public static Question<Boolean> containsTheWord(String product) {
        List<WebElementFacade> data = BrowseTheWeb.as(theActorInTheSpotlight()).findAll(SEARCH_INPUT);
        boolean validation = data.stream().allMatch(currentProduct -> currentProduct.getText().contains(product));
        Question<Boolean> result = Question.about("Finding product").answeredBy(actor -> validation);
        return result;
    }
}
