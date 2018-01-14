package pageFactoryModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewUserRegistrationPage extends BaseClass

{
    public NewUserRegistrationPage()
    {

        PageFactory.initElements(driver,this);
    }
    // Find Title Mr Locator
    @FindBy(id = "id_gender1")
    WebElement genderField1;

    // Find Title Mrs Locator
    @FindBy(id = "id_gender2")
    WebElement genderField2;

    // Find First name locator
    @FindBy(id = "customer_firstname")
    WebElement fNameNewUser;

    // Find Last name locator
    @FindBy(id = "customer_lastname")
    WebElement lNameNewUser;

    // find email locator
    @FindBy(id = "email")
    WebElement emailNewUserField;

    // find password locator
    @FindBy(id = "passwd")
    WebElement passwordNewUserField;

    // find days locator

    @FindBy(id = "days")
    WebElement newUserBirthDayField;

    // find month locator

    @FindBy(id = "months")
    WebElement newUserBirthMonthField;
// find Year locator

    @FindBy(id = "years")
    WebElement newUserBirthYearField;

// find sign up news letter locator

    @FindBy(id = "newsletter")
    WebElement newsLetterSignUpField;

    // find offers opt in locator

    @FindBy(id = "optin")
    WebElement offersOptInField;

    // Address fill
    // first name
    @FindBy(id = "firstname")
    WebElement firstNameAddressField;
    ///last name
    @FindBy(id = "lastname")
    WebElement lastNameAddressField;
    //Address company field
    @FindBy(id = "company")
    WebElement companyField;

    // Address 1st line
    @FindBy(id = "address1")
    WebElement addressFirstLineField;
    // Address 2nd line
    @FindBy(id = "address2")
    WebElement addressSecondLineField;
    // Address city
    @FindBy(id = "city")
    WebElement addressCityField;
    // Address state
    @FindBy(id = "id_state")
    WebElement addressStateField;
    // Address postal code
    @FindBy(id = "postcode")
    WebElement addressPostCodeField;
    // Address Country
    @FindBy(id = "id_country")
    WebElement addressCountryField;

    // Address Additionalinfo
    @FindBy(id = "other")
    WebElement addressAdditionalInfoField;

    // Contact info
// find Home phone locator
    @FindBy(id = "phone")
    WebElement contactHomePhoneField;
// find Mobile phone locator
    @FindBy(id = "phone_mobile")
    WebElement contactMobilePhoneField;
    // find Address Alia locator
    @FindBy(id = "alias")
    WebElement addressAliasField;

    // find Register Button locator
    @FindBy(id = "submitAccount")
    WebElement registerButtonField;



    //

    /*  Reusable Methods
        Click new user title*/
    public void clickTitleField(String userTitle)
    {
        if( userTitle=="Mr.") {
            genderField1.click();
        }
        else if(userTitle=="Mrs.")
            {
                genderField2.click();
            }
    }
    // Fill first name
    public void setFirstName(String fnameNewUser)
    {
        fNameNewUser.sendKeys(fnameNewUser);
    }

    // Fill last name
    public void setLastName(String lastNameNewUser)
    {
        lNameNewUser.sendKeys(lastNameNewUser);
    }

    //  check user email field
    public void checkUserEmailAddressField(String newUserEmail)
    {
        String userEmail=emailNewUserField.getAttribute("value");
        if( !userEmail.equalsIgnoreCase(newUserEmail))
        {
            emailNewUserField.sendKeys(newUserEmail);
        }
    }
// Fill password
    public void setPassword(String newUserPassword)
    {
        passwordNewUserField.sendKeys(newUserPassword);
    }
// fill date of birth
    public void setDateOfBirthNewUser(String day,String month,String year)
    {
        Select daydropdown= new Select(newUserBirthDayField);
        daydropdown.selectByValue(day);
        Select monthdropdown=new Select(newUserBirthMonthField);
        //monthdropdown.selectByVisibleText(month);

        monthdropdown.selectByIndex(1);
        Select yeardropdown=new Select(newUserBirthYearField);
        yeardropdown.selectByValue(year);
    }
    // fill news letter sign up
    public void newsLetterSignUp() {
        if (!newsLetterSignUpField.isSelected()) {

            newsLetterSignUpField.click();

        }
    }
    // receive special offer from partners
    public void offersOptIn() {
        if (!offersOptInField.isSelected())
        {

            offersOptInField.click();
        }
    }


    public void setCompanyDetail(String company)
    {

        companyField.sendKeys(company);
    }

    public void setFirstLineAddress(String addressline1)
    {

    addressFirstLineField.sendKeys(addressline1);
    }
    public void setSecondLineAddress(String addressline2)
    {

    addressSecondLineField.sendKeys(addressline2);
    }

    public void setCity(String city)
    {
        addressCityField.sendKeys(city);
    }

    public void setState(String state)
    {
        Select stateselect=new Select(addressStateField);
        stateselect.selectByIndex(1);
        //stateselect.selectByValue(state);
    }
    public void setPostCode(String pcode)
    {
        addressPostCodeField.sendKeys(postcode);
    }
    public void setCountry(String country)
    {
        Select countryselect=new Select(addressCountryField);
        countryselect.selectByIndex(1);
       // countryselect.selectByValue(country);
    }
    public void setAdditionalInfo(String additonalInfo)
    {
        addressAdditionalInfoField.sendKeys(additonalInfo);
    }

    public void setHomePhone(String homePhone)
    {
        contactHomePhoneField.sendKeys(homePhone);
    }
    public void setMobilePhone(String mobilePhone)
    {
        contactMobilePhoneField.sendKeys(mobilePhone);
    }
    public void setAliasAddress(String aliasAddress)

    {
        addressAliasField.clear();
        addressAliasField.sendKeys(aliasAddress);
    }

    public void clickRegister()
    {
        registerButtonField.click();
    }
    // Fill personnel details
    public void fillPersonalDetails()
    {
        this.clickTitleField(newUserTitle);
        this.setFirstName(firstNameNewUser);
        this.setLastName(lastNameNewUser);
        this.checkUserEmailAddressField(newUserEmailAddress);
        this.setPassword(passwordNewUser);
        this.setDateOfBirthNewUser(day,month,year);
        this.newsLetterSignUp();
        this.offersOptIn();
    }


    // Fill Address Details

    public void fillAddressDetails()
    {
        this.setCompanyDetail(company);
        this.setFirstLineAddress(addressLine1);
        this.setSecondLineAddress(addressLine2);
        this.setCity(cityName);
        this.setState(stateName);
        this.setPostCode(postcode);
        this.setCountry(countryName);
        this.setAdditionalInfo(addInfo);
        this.setAliasAddress(aliasaddress);
    }
    // Fill contact details

    public void fillContactDetails()
    {
        this.setHomePhone(homephonenumber);
        this.setMobilePhone(mobilephonenumber);



    }

}
