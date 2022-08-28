package test;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.InnovaTestBase;

public class AccountsTest extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 1,enabled = true)
    public void VerifyUserCanLoginSuccessfully() {
        allPages.basePage().loginSuccessfully();
    }

    @Test(priority = 2,enabled = true)
    public void VerifyUserCanCreateBusinessAccountWithAllFields() {
        allPages.accountsPage().createBusinessAccountAllData();
    }

    @Test(priority = 3,enabled = true, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1052_VerifyCreatedAccountHasCorrectDataOnDashboard() {
        allPages.accountsPage().accountCreatedDashboard();
    }

    @Test(priority = 4,enabled = true)
    public void TC_3678_VerifyUserCanCreatePersonalAccount() {
        allPages.accountsPage().createPersonalAccount();

    }

    @Test(priority = 5,enabled = true, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")                             //TODO add search method instead of the search method steps
    public void TC_3425_VerifyUserCanEditAccount() {
        allPages.accountsPage().editAccount();
    }

    //Actions With Account

    @Test(priority = 6,enabled = true,dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1058_VerifyUserCanAddAdditionalContact() {
        allPages.accountsPage().createContact();
    }

    @Test(priority = 7,enabled = true, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1113_VerifyUserCanAddBankAccountToAccount() {
        allPages.accountsPage().addBankAccount();
    }

    @Test(priority = 8,enabled = true, dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1054_VerifyUserCanCreateSalesAgreementOnNewAccount() {
        allPages.accountsPage().createSalesAgreement();
    }
    @Test(priority = 9,enabled = true,dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1247_VerifyUserCanCreateNewSalesAgreementOnExistingAccount() {
        allPages.accountsPage().createSalesAgreementOnExistingSalesAgreement();
    }
    @Test(priority = 10,enabled = true,dependsOnMethods = "VerifyUserCanCreateBusinessAccountWithAllFields")
    public void TC_1060_VerifyUserCanAddLocationToAccount() {
        allPages.accountsPage().addLocationToAnAccount();
    }
}

