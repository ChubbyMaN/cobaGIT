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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for(def rowNum=1; rowNum <=findTestData('logintestdatafiles/logintestdata').getRowNumbers() ; rowNum++)
{

	WebUI.openBrowser('')
	
	WebUI.maximizeWindow()
	
	WebUI.navigateToUrl('http://goaml.southeastasia.cloudapp.azure.com/goaml/Login.aspx?ReturnUrl=%2fgoaml%2fDefault.aspx')

	WebUI.setText(findTestObject('OR_Login/Username'), findTestData('logintestdatafiles/logintestdata').getValue(1,rowNum))
	
	WebUI.setText(findTestObject('OR_Login/Password'), findTestData('logintestdatafiles/logintestdata').getValue(2,rowNum))
	
	WebUI.click(findTestObject('OR_Login/Sign In Button'))

	WebUI.delay(5)
	
	WebUI.closeBrowser()

}