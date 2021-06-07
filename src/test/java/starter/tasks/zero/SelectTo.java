package starter.tasks.zero;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.NoSuchElementException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static starter.ui.zero.SelectLocatorHomePageCalled.ALL_MENU_OPTIONS_LABELS;

public class SelectTo {
    public static Performable optionMenu(String option) {
        List<WebElementFacade> data = BrowseTheWeb.as(theActorInTheSpotlight()).findAll(ALL_MENU_OPTIONS_LABELS);
        WebElementFacade currentMenu = data.stream().filter(menuOption -> menuOption.getText().equals(option))
                .findFirst().orElseThrow(NoSuchElementException::new);
        return Task.where("click on menu " + option,
                Click.on(currentMenu)
        );
    }
}
