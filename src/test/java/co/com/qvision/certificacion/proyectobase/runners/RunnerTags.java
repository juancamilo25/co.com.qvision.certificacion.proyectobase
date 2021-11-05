package co.com.qvision.certificacion.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/proyectobase.feature",
        tags = "@scenario1",
        glue = "co.com.qvision.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}
