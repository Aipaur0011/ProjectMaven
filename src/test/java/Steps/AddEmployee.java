package Steps;


import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Steps.PageInitializer.addEmployeePage;


public class AddEmployee extends CommonMethods {

    @When("user clicks in PIM option")
    public void user_clicks_in_pim_option() {
//      driver.findElement(By.id("menu_pim_viewPimModule")).click();
//      WebElement pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
        doClick(addEmployeePage.pimTab);
    }
    @When("user click on add employee button")
    public void user_click_on_add_employee_button() {
//      WebElement addEmpBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        doClick(addEmployeePage.addEmpBtn);
    }
    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
//      System.out.println(10/0);
//      driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstname"));
//      WebElement firstnameTextBox = driver.findElement(By.id("firstName"));
        sendText(addEmployeePage.firstnameTextBox, ConfigReader.getPropertyValue("firstName"));

//      driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middlename"));
//      WebElement middlenameTextBox = driver.findElement(By.id("middleName"));
        sendText(addEmployeePage.middlenameTextBox, ConfigReader.getPropertyValue("middleName"));

//      driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastname"));
//      WebElement lastnameTextBox = driver.findElement(By.id("lastName"));
        sendText(addEmployeePage.lastnameTextBox, ConfigReader.getPropertyValue("lastName"));
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
//      WebElement saveBtn = driver.findElement(By.id("btnSave"));
//      doClick(addEmployeePage.saveBtn);
        doClick(addEmployeePage.saveBtn);
    }

}
