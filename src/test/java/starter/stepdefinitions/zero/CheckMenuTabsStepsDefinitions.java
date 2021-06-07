package starter.stepdefinitions.zero;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;
import starter.tasks.zero.SelectTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static starter.questions.zero.HomePageQuestions.areTabMenusVisible;

public class CheckMenuTabsStepsDefinitions {

    @Given("{actor} is in the {string} home page")
    public void goToTheWebPage(Actor actor, String pageName) {
        actor.wasAbleTo(NavigateTo.page(pageName));
    }

    @When("{actor} chooses {string} option")
    public void selectEachMenuTabs(Actor actor, String menuOption) {
        actor.attemptsTo(SelectTo.optionMenu(menuOption));
    }

    @Then("{actor} should see all menu options")
    public void checkByMenuOptions(Actor actor) {
        actor.should(
                seeThat("presence of all menu options", areTabMenusVisible(), is(true))
        );
    }

}
