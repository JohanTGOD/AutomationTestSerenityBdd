package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.questions.FeedbackQuestion;
import starter.tasks.FillOutForm;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static starter.questions.FeedBackSentQuestion.messageOkIsVisible;

public class FillOutFormStepDefinitions {

    @When("{actor} wants to send feedback but he does not complete the fields {string}, {string}, {string}, {string}")
    @When("{actor} has to complete the form with {string}, {string}, {string}, {string}")
    public void fillOutForm(Actor actor, String user, String email, String subject, String comment) {
        actor.attemptsTo(
                FillOutForm.withData(user, email, subject, comment)
        );
    }

    @Then("{actor} should see a confirmation message")
    public void checkCorrectMessage(Actor actor) {
        actor.should(
                seeThat("visibility of success message", messageOkIsVisible(), is(true))
        );
    }

    @Then("{actor} should stay in the same page")
    public void checkFormPage(Actor actor) {
        actor.should(
                seeThat("visibility username field", FeedbackQuestion.isNameFieldVisible(), is(true))
        );
    }
}
