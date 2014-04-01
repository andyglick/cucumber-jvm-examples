package info.cukes;

import net.sourceforge.jeval.EvaluationException;
import net.sourceforge.jeval.Evaluator;
import net.sourceforge.jeval.function.FunctionException;
import net.sourceforge.jeval.function.math.Round;

import org.junit.Assert;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * @author glick
 */
public class EvaluatorTest
{
  private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Test
  public void testEvaluator() throws EvaluationException, FunctionException
  {
    Evaluator evaluator = new Evaluator();

    String result = evaluator.evaluate("round(4)");

    Assert.assertEquals("4.0", result);
  }
}
