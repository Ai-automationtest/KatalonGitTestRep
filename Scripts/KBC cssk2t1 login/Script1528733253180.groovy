import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://aia-eap-1-kbc.airas.lan:8843/kbc-pas')

WebUI.delay(5)

certerrprsnt = WebUI.verifyElementPresent(findTestObject('KBC login/Page_Certificate Error Navigation B/a_Continue to this website (no'), 
    10, FailureHandling.OPTIONAL)

if (certerrprsnt) {
    WebUI.delay(5)

    WebUI.click(findTestObject('KBC login/Page_Certificate Error Navigation B/a_Continue to this website (no'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('KBC login/Page_Certificate Error Navigation B/a_Continue to this website (no_1'), 
        10, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('KBC login/Page_Certificate Error Navigation B/a_Continue to this website (no_1'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.delay(30, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('KBC login/Page_Log in to KBC/div_KBC'), 10)
}

WebUI.delay(30, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('KBC login/Page_Log in to KBC/input_username'), 'john')

WebUI.setText(findTestObject('KBC login/Page_Log in to KBC/input_password'), 'Ai123456js')

WebUI.verifyElementPresent(findTestObject('KBC login/Page_Log in to KBC/input_login'), 10)

WebUI.click(findTestObject('KBC login/Page_Log in to KBC/input_login'))

WebUI.waitForPageLoad(30)

txtprsnt = WebUI.verifyElementPresent(findTestObject('KBC login/Page_KBC - Max Session Exceeded/button_Back to Login Page'), 
    10, FailureHandling.OPTIONAL)

if (txtprsnt) {
    WebUI.click(findTestObject('KBC login/Page_KBC - Max Session Exceeded/button_Back to Login Page'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('KBC login/Page_Log in to KBC/input_username'), 'john', FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('KBC login/Page_Log in to KBC/input_password'), 'Ai123456js', FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('KBC login/Page_Log in to KBC/input_login'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('KBC home page/Page_Ai-PAS/h3_Ai-PAS'), 10, FailureHandling.STOP_ON_FAILURE)
}

