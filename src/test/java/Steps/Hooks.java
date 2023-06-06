package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
    public class Hooks extends CommonMethods {

        @Before
        public void PreConditions(){
            openBrowserAndLaunchApplication();
        }

        @After
        public void postConditions(Scenario scenario) {
            byte[] pic;
            if (scenario.isFailed()) {
                pic= takeScreenShot("failed/" + scenario.getName());
            } else {
                pic = takeScreenShot("passed/" + scenario.getName());
            }
//       Attach the screenshot in my report
            scenario.attach(pic, "image/png", scenario.getName());

            closeBrowser();
    }
    }

