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

WebUI.openBrowser('https://aia-eap-1-kbc.airas.lan:8843/kbc-pas')

WebUI.setText(findTestObject('KBC login/Page_Log in to KBC/input_username'), 'john')

WebUI.setText(findTestObject('KBC login/Page_Log in to KBC/input_password'), 'Ai123456js')

WebUI.click(findTestObject('KBC login/Page_Log in to KBC/input_login'))

WebUI.click(findTestObject('quick quote/Page_Ai-PAS/span_Quick Quote'))

WebUI.sendKeys(findTestObject('quick quote/Page_Ai-PAS/input_agentSiteagentno'), Siteagntno)

WebUI.delay(3)

WebUI.click(findTestObject('quick quote/Page_Ai-PAS/button_Get Agent'))

WebUI.delay(3)

WebUI.click(findTestObject('quick quote/Page_Ai-PAS/button_Choose'))

WebUI.delay(5)

WebUI.click(findTestObject('quick quote/Page_Ai-PAS/button_Yes'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('quick quote/Page_Ai-PAS/input_niNo'), NIno)

WebUI.delay(3)

WebUI.click(findTestObject('quick quote/Page_Ai-PAS/button_Search Person'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('quick quote/Page_Ai-PAS/button_Choose_person'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('quick quote/Page_Ai-PAS/select_productType'), prdcttype, true)

WebUI.selectOptionByValue(findTestObject('quick quote/Page_Ai-PAS/select_currency'), currency, true)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('quick quote/Page_Ai-PAS/select_product'), product, true)

WebUI.selectOptionByValue(findTestObject('quick quote/Page_Ai-PAS/select_frequency'), freq, true)

WebUI.selectOptionByValue(findTestObject('quick quote/Page_Ai-PAS/select_productDuration'), term, true)

WebUI.selectOptionByValue(findTestObject('quick quote/Page_Ai-PAS/select_indexationOption'), indexation, true, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.clearText(findTestObject('quick quote/Page_Ai-PAS/input_savingsPremium'))

WebUI.delay(1)

WebUI.setText(findTestObject('quick quote/Page_Ai-PAS/input_savingsPremium'), svngsprem)

WebUI.delay(1)

WebUI.setText(findTestObject('quick quote/Page_Ai-PAS/input_startDate'), startdate)

WebUI.click(findTestObject('quick quote/Page_Ai-PAS/button_Next'))

