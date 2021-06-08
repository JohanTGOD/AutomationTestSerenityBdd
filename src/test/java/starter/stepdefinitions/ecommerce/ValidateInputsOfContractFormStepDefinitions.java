package starter.stepdefinitions.ecommerce;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.questions.ecommerce.ContactUsFormQuestions;
import starter.tasks.ecommerce.Select;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static starter.questions.ecommerce.ContactUsFormQuestions.*;

public class ValidateInputsOfContractFormStepDefinitions {

    @When("{actor} chooses contact us option")
    public void checkCorrectMessage(Actor actor) {
        actor.attemptsTo(
                Select.contactUsPage()
        );
    }

    @Then("{actor} should validate all fields of the form")
    public void checkFormPage(Actor actor) {
        actor.should(
                seeThat("subject field is visible and enable", isSubjectFieldEnable(), is(true)),
                seeThat("email field is visible and enable", isEmailFieldEnable(), is(true)),
                seeThat("order field is visible and enable", isOrderFieldEnable(), is(true)),
                seeThat("message field is visible and enable", isMessageFieldEnable(), is(true)),
                seeThat("send button field is visible and enable", isSendButtonEnable(), is(true))
        );
    }
}
