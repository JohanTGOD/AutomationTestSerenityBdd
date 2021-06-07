package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.questions.FeedbackQuestion;
import starter.tasks.SelectTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CheckInputs {

    @When("{actor} selects {string} page")
    public void selectEachMenuTabs(Actor actor, String option) {
        actor.attemptsTo(SelectTo.optionMenu(option));
    }

    @Then("{actor} should see all inputs are enable")
    public void checkByMenuOptions(Actor actor) {
        actor.should(
                seeThat("name input is visible an enable", FeedbackQuestion.isNameFieldVisible(), is(true)),
                seeThat("email input is visible an enable", FeedbackQuestion.isEmailFieldVisible(), is(true)),
                seeThat("subject input is visible an enable", FeedbackQuestion.isSubjectFieldVisible(), is(true)),
                seeThat("comment text are is visible an enable", FeedbackQuestion.isCommentFieldVisible(), is(true))
                );
    }
}
