package Steps;

import Pages.AddEmployeePage;
import Pages.LoginPage;

public class PageInitializer {

    // make it global
    public static LoginPage login;
    public static AddEmployeePage addEmployeePage;
    public static void initializePageObjects() {

        // initializing login page
        login = new LoginPage();
        addEmployeePage = new AddEmployeePage();
    }

}
// this will initialize all the pages we have in our page
// PageInitializer class along with the launching of application