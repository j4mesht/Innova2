package regressionTest;

import org.testng.annotations.Test;
import utilities.AllPages;
import utilities.BrowserUtils;
import utilities.InnovaTestBase;

import java.awt.*;
import java.io.IOException;

public class PackagesTest extends InnovaTestBase {

    AllPages allPages = new AllPages();

    @Test(priority = 22)
    public void TC_3443_CreateConsignmentPackageFromAccountCOG() {
        allPages.packagesPage().createBusinessAccountAllDataPackage();
        allPages.packagesPage().searchForAccountPackage();
        allPages.packagesPage().createAConsignmentPackage();
    }

    @Test(priority = 23)
    public void AddItemToAPackageWithRequiredFields() {
        allPages.packagesPage().AddItemToAPackageWithRequiredFields();
    }

    @Test(priority = 24)
    public void TC_1067_VerifyUserCanUseVIN_DecodeWhenAddingItemToAPackage() {
        allPages.packagesPage().VIN_DecodeWhenAddingItemToAPackage();
    }

    @Test(priority = 25)
    public void TC_1065_AddItemToAPackageWithAllFields() {
        allPages.packagesPage().AddItemToAPackageWithAllFields();
        BrowserUtils.waitFor(1);
    }

    @Test(priority = 26)
    public void TC_1066_VerifyUserCanAddItemsToAPackageFromFile() throws IOException, AWTException {
        allPages.packagesPage().AddItemsToAPackageFromFile();
    }

    @Test(priority = 27)
    public void TC_7562_VerifyUserCanDeleteItemInAPackageInWorkingStatus() {
        allPages.packagesPage().deleteItemInAPackage();
        BrowserUtils.waitFor(2);
    }

    @Test(priority = 28)
    public void TC_7090_addNoteToAPackage() {
        allPages.packagesPage().addNotesToAPackage();
    }

    @Test(priority = 28)
    public void TC_1070_VerifyUserCanAddValueServiceToAPackage() {
        allPages.packagesPage().addValueServiceToAPackage();
    }

    @Test(priority = 29)
    public void TC_7980_VerifyUserCanEditAddValueServiceToAPackage() {
        allPages.packagesPage().editValueServiceToAPackage();
    }

    @Test(priority = 30)
    public void TC_7079_VerifyUserCanRemoveValueServicesFromAPackage() {
        allPages.packagesPage().removeValueServicesFromAPackage();
    }

    @Test(priority = 31)
    public void TC_1070_VerifyUserCanAddValueServiceToAPackageAgain() {
        allPages.packagesPage().addValueServiceToAPackage();
    }

    @Test(priority = 32,dependsOnMethods = "TC_3443_CreateConsignmentPackageFromAccountCOG")
    public void TC_2875_VerifyUserCanUploadDocumentToAPackage() throws IOException {
        allPages.packagesPage().uploadDocumentInPackage();
    }

    @Test(priority = 33)
    public void TC_7098_VerifyUserCanDeleteDocumentsFromAPackage() {
        allPages.packagesPage().deleteDocumentInPackage();

    }

    @Test(priority = 34)
    public void TC_1069_VerifyUserCanAddLienHolderToAPackage() {
        allPages.packagesPage().addLienHolderToAPackage();
    }

    @Test(priority = 35)
    public void TC_6385_VerifyUserCanChangeStatusForLienHolder_ExceptLetterReceived() {
        allPages.packagesPage().changeLienStatus();                           //TODO finish this TC
    }

    @Test(priority = 36)
    public void TC_7121_VerifyUserCanCreateSalesAgreementFromAPackage() {
        allPages.packagesPage().createSalesAgreementFromAPackage();
    }
    @Test(priority = 37)
    public void TC_1286_OpenPackagesPage(){
        allPages.packagesPage().searchForAccountPackage();
        allPages.accountsPage().createOpenPackage();
    }

}
