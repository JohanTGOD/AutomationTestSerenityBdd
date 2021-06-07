package starter.stepdefinitions.ecommerce;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;
import starter.questions.ecommerce.AllProductsQuestions;
import starter.tasks.ecommerce.FindProduct;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LookForStepDefinitions {

    @Given("{actor} is in {string} home page")
    public void fillOutForm(Actor actor, String pageName) {
        actor.wasAbleTo(NavigateTo.page(pageName));
    }

    @When("{actor} looks for {string} page")
    public void checkCorrectMessage(Actor actor, String product) {
        actor.attemptsTo(
                FindProduct.byName(product)
        );
    }

    @Then("{actor} should see products that contains {string}")
    public void checkFormPage(Actor actor, String product) {
        actor.should(
                seeThat("visibility username field", AllProductsQuestions.containsTheWord(product), is(true))
        );
    }
}
