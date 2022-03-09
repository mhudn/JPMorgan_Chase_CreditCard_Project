package JPMorganChaseProject;

import Reusable_Libraries.Abstract_Class;
import Reusable_Libraries.Reusable_Methods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;



public class creditCard extends Abstract_Class
{
    @Test
    public void chaseFreedomUnlimited() throws InterruptedException
    {

        String firstName = "Elizabeth";
        String lastName = "Emma";
        String dateOfBirth = "02/11/1988";
        String maidenName = "Jane";
        String SSN = "123-97-5467";
        String address = "724 Foster Ave";
        String zipCode = "11230";
        String city ="Brooklyn";
        String email ="Gaizka.Emma@gmail.com";
        String phone ="718-282-9984";
        String state = "New York";
        String income = "50000";
        String rent = "1600";

        driver.manage().deleteAllCookies();
        //driver.navigate().to("https://creditcards.chase.com/cash-back-credit-cards/freedom/unlimited?CELL=6TKV"); //(for quick test purpose)
        Thread.sleep(2000);

        logger.log(LogStatus.INFO,"Navigating to https://www.chase.com");

        driver.navigate().to("https://www.chase.com/");
        Thread.sleep(2000);
        System.out.println("\nNavigating to https://www.chase.com");


        Reusable_Methods_Loggers.click(driver,"//*[@data-id='product-2']",logger, "credit cards");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.clickByPartialLinkText(driver, "Personal credit cards",logger,"Personal credit cards");
        Thread.sleep(2000);

        Reusable_Methods_Loggers.click(driver,"//*[@data-pt-name='cc_freedom_ulim_allcc_name']",logger, "Chase Freedom Unlimited credit card");
        //Reusable_Methods_Loggers.clickByPartialLinkText(driver, "Chase Freedom Unlimited",logger,"Chase Freedom Unlimited credit card");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.captureText(driver,"//*[@class='mvt-apr-benefits-wrapper']",logger,"Cash Back Rewards & Benefits:        \n");
        Thread.sleep(2000);



        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,800)");
        System.out.println("\nScrolling down a little");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver, "//*[@data-overlay-id='redeem']", logger, " Redeem Your Cash Back Rewards");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.captureText(driver,"//*[@class='benefits_slide-right-rail']",logger, "The ways you can use the rewards:      \n");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@id='AdditionalBenefitsCloseModal']",logger, "[X] CLOSE button to close the page");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver, "//*[@data-overlay-id='service-protection']", logger, " Service & protection");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.captureText(driver,"//*[@id='service-protection']",logger, "Service & protection Details:      \n");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@id='AdditionalBenefitsCloseModal']",logger, "[X] CLOSE button to close the page");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver, "//*[@data-overlay-id='contactless']", logger, " Contactless - Just Tap To Pay");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.captureText(driver,"//*[@id='contactless']",logger, "Contactless - Just Tap To Pay Details:      \n");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@id='AdditionalBenefitsCloseModal']",logger, "[X] CLOSE button to close the page");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver, "//*[@data-overlay-id='partner-benefits']", logger, " Partner benefits");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.captureText(driver,"//*[@id='partner-benefits']",logger, "Partner benefits Description:      \n");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@id='AdditionalBenefitsCloseModal']",logger, "[X] CLOSE button to close the page");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver, "//*[@data-overlay-id='creditjourney']", logger, " Credit Journey");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.captureText(driver,"//*[@id='creditjourney']",logger, "Credit Journey Details:      \n");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@id='AdditionalBenefitsCloseModal']",logger, "[X] CLOSE button to close the page");
        Thread.sleep(2000);


        Reusable_Methods_Loggers.click(driver, "//*[@data-overlay-id='spendinstantly']", logger, " Spend Instantly");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.captureText(driver,"//*[@id='spendinstantly']",logger, "Spend Instantly Details:      \n");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.click(driver,"//*[@id='AdditionalBenefitsCloseModal']",logger, "[X] CLOSE button to close the page");
        Thread.sleep(2000);


        jse.executeScript("scroll(0,-2000)");
        System.out.println("\nScrolling back up");
        Thread.sleep(1000);


       Reusable_Methods_Loggers.click(driver, "//*[@id='ApplyNow']", logger, "Apply as a guest");
       Thread.sleep(3000);
       Reusable_Methods_Loggers.switchTab(driver,1);

       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='firstName']",firstName,logger," First Name");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='lastName']",lastName,logger," Last Name");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='dateOfBirth']",dateOfBirth,logger," Date Of Birth");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='mothersMaidenName']",maidenName,logger," Mother's Maiden Name");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='socialSecurityNumber']",SSN,logger," Social Security Number");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='streetAddress']",address,logger," Street Address");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='zipCode']",zipCode,logger," Zip Code");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='cityId']",city,logger," City Name");
       Reusable_Methods_Loggers.dropDownMenu(driver,"//*[@name='stateId']",state,logger," State Name");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='emailAddress']",email,logger," Email Address");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='phoneNumber']",phone,logger," Phone Number");

       jse.executeScript("scroll(0,800)");
       System.out.println("\nScrolling down a little");
       Thread.sleep(1000);

       Reusable_Methods_Loggers.click(driver,"//*[@name='socialSecurityAdministrationDisclosureAcceptance']",logger," Check this box to provide your electronic signature for the authorization above.");
       Reusable_Methods_Loggers.dropDownMenu(driver,"//*[@name='residenceOwnershipOptionId']","Rent",logger," Type of residence");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='monthlyHousingPayment']",rent,logger," Monthly housing payment");

       Reusable_Methods_Loggers.dropDownMenu(driver,"//*[@name='primaryIncomeSourceId']","Employed",logger," Primary source of income");
       Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='grossAnnualIncome']",income,logger," Type of residence");

       Reusable_Methods_Loggers.click(driver,"//*[@id='input-paperlessStatements-radio-1']",logger," 'No' to not go Paperless");
       Reusable_Methods_Loggers.click(driver,"//*[@id='input-paperlessStatements-radio-0']",logger," 'Yes' to go Paperless");

       Reusable_Methods_Loggers.click(driver,"//*[@id='authorizedUsersHeader-radio-0']",logger," 'Yes' to add an authorized user");
       Reusable_Methods_Loggers.click(driver,"//*[@id='authorizedUsersHeader-radio-1']",logger," 'No' to not add an authorized user");

       Reusable_Methods_Loggers.click(driver,"//*[@id='input-balanceTransfer-radio-0']",logger," 'Yes' to transfer any balance");
       Reusable_Methods_Loggers.click(driver,"//*[@id='input-balanceTransfer-radio-1']",logger," 'No' to not transfer any balance");

       jse.executeScript("scroll(0,5000)");
       System.out.println("\nScrolling down to the bottom");
       Thread.sleep(1000);

       Reusable_Methods_Loggers.click(driver,"//*[@id='label-navigationAdvisory']",logger," I've read and agree to the above.");

       Reusable_Methods_Loggers.click(driver,"//*[@type='button']",logger, " \"Submit\" button.");

       Thread.sleep(2000);

       Reusable_Methods_Loggers.captureText(driver,"//*[@id='content-submitErrorAlert']",logger, " the error message: ");

       Reusable_Methods_Loggers.click(driver,"//*[@id='exitAccountOrigination']",logger, " \"Close\" button.");



       System.out.println("\n~~~Quiting the Browser in 5 Seconds~~~\n");
       Thread.sleep(5000);
       driver.quit();
    }
}
