package starter.stepdefinitions.ecommerce;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.tasks.ecommerce.CompleteAllFields;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static starter.questions.ecommerce.ContactUsFormQuestions.isSuccessMessageEnable;

public class FillOutContactUsFormStepDefinitions {

    @When("{actor} fills out the fields {string}, {string}, {string}, {string}")
    public void completeForm(Actor actor, String subject, String email, String reference, String message) {
        actor.attemptsTo(
                CompleteAllFields.withData(subject, email, reference, message)
        );
    }

    @Then("{actor} should see confirmation message")
    public void validateCorrectMessage(Actor actor) {
        actor.should(
                seeThat("visibility username field", isSuccessMessageEnable(), is(true))
        );
    }
}
