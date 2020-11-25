package starter.post;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.login.DoLogin;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoPost implements Task {

    private final String title;
    private final String text;

    public DoPost(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public static Performable withDataPost(String title, String text){
        return instrumented(DoPost.class, title, text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(title).into(PostForm.POST_TITLE),
                Enter.theValue(text).into(PostForm.POST_TEXT),
                Click.on(LoginForm.USER_BUTTON)
        );
    }
}
