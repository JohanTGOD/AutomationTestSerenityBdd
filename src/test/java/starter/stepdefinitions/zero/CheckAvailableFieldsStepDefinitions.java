package starter.stepdefinitions.zero;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.questions.zero.FeedbackQuestion;
import starter.tasks.zero.SelectTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CheckAvailableFieldsStepDefinitions {

    @When("{actor} selects {string} page")
    public void selectEachMenuTabs(Actor actor, String option) {
        actor.attemptsTo(SelectTo.optionMenu(option));
    }

    @Then("{actor} should see all inputs are enable")
    public void checkByMenuOptions(Actor actor) {
        actor.should(
                seeThat("name input is visible an enable", FeedbackQuestion.isNameFieldEnable(), is(true)),
                seeThat("email input is visible an enable", FeedbackQuestion.isEmailFieldEnable(), is(true)),
                seeThat("subject input is visible an enable", FeedbackQuestion.isSubjectFieldEnable(), is(true)),
                seeThat("comment text are is visible an enable", FeedbackQuestion.isCommentFieldEnable(), is(true))
                );
    }
}
