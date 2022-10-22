import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.saucedemo.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Purhcase_1_Product/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Purhcase_1_Product/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Purhcase_1_Product/Page_Swag Labs/input_standard_userlocked_out_userproblem_userperformance_glitch_user_login-button'))

WebUI.delay(30)

WebUI.click(findTestObject('Purhcase_1_Product/Page_Swag Labs/img_Name (A to Z)_inventory_item_img'))

WebUI.click(findTestObject('Purhcase_1_Product/Page_Swag Labs/button_Add to cart'))

WebUI.delay(5)

//WebUI.click(findTestObject('Purchase_Some_Product/Page_Swag Labs/button_Back to products'))

//WebUI.click(findTestObject('Purchase_Some_Product/Page_Swag Labs/img_Remove_inventory_item_img'))

//WebUI.click(findTestObject('Purchase_Some_Product/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Purhcase_1_Product/Page_Swag Labs/a_Close Menu_shopping_cart_link'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'), 'Sauce Labs Backpack')

WebUI.delay(5)

//WebUI.verifyElementText(findTestObject('Purchase_Some_Product/Page_Swag Labs/div_Sauce Labs Bike Light'), 'Sauce Labs Bike Light')

WebUI.click(findTestObject('Purhcase_1_Product/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Purhcase_1_Product/Page_Swag Labs/input_Checkout Your Information_firstName'), 'Sesar Pebriyanto')

WebUI.setText(findTestObject('Purhcase_1_Product/Page_Swag Labs/input_Checkout Your Information_lastName'), 'Sinaga')

WebUI.setText(findTestObject('Purhcase_1_Product/Page_Swag Labs/input_Checkout Your Information_postalCode'), '22411')

WebUI.click(findTestObject('Page_Swag Labs/input_Cancel_continue'))

WebUI.delay(5)

actualText = WebUI.getText(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Backpack'))

expectedText = 'Sauce Labs Backpack'

WebUI.verifyMatch(actualText, expectedText, false)

WebUI.delay(5)

//actualText = WebUI.getText(findTestObject('Object Repository/Purchase_Some_Product/Page_Swag Labs/div_Sauce Labs Bike Light'))

//expectedText = 'Sauce Labs Bike Light'

//WebUI.verifyMatch(actualText, expectedText, false)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Purhcase_1_Product/Page_Swag Labs/button_Finish'), 5)

WebUI.click(findTestObject('Purhcase_1_Product/Page_Swag Labs/button_Finish'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'), 'THANK YOU FOR YOUR ORDER')

