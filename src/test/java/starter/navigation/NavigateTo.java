package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theOpenSourceCmsHomePage() {
        return Task.where("{0} opens the OpenSourceCms home page",
                Open.browserOn().the(OpenSourceCmsHomePage.class)
        );
    }
}