/**
 * 
 */
/**
 * @author user
 *
 */
package RunFeatures;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
features = "bddTestCase/",
tags = "@search",
format = {"json:target/cucumber.json"}

)
public class RunFeaturesTest {

}
