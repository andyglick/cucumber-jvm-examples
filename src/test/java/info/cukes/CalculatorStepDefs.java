package info.cukes;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.sourceforge.jeval.Evaluator;

/**
 * @author glick
 */
public class CalculatorStepDefs
{
  String arguments;

  String result = "";

  @Given("^the input \"([^\"]*)\"$")
  public void the_input(String arg1) throws Throwable
  {
    arguments = arg1;
  }

  @When("^the calculator is run$")
  public void the_calculator_is_run() throws Throwable
  {
    Evaluator evaluator = new Evaluator();
    result = evaluator.evaluate(arguments);
  }

  @Then("^the output should be \"([^\"]*)\"$")
  public void the_output_should_be(String arg1) throws Throwable
  {
    if (arg1.contains("."))
        Assert.assertEquals(arg1, result);
    else
    {
      Assert.assertEquals(arg1 + ".0", result);
    }
  }
}
