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

String userDirectory = System.getProperty('user.dir')

String filePath = userDirectory + '\\APK-FILES\\Advantage+demo+3.2.apk'

Mobile.startApplication(filePath, true)

Mobile.tap(findTestObject('Object Repository/SignIn/Logo_Navbar'), 0)

Mobile.tap(findTestObject('SignUp/btn_Login'), 0)

Mobile.setText(findTestObject('Object Repository/SignIn/Inpt_USRNM'), 'rayidwi012', 0)

Mobile.setText(findTestObject('Object Repository/SignIn/Inpt_Passwrd'), 'Ketahurayi12', 0)

Mobile.tap(findTestObject('Object Repository/SignIn/btn_Login2'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/Logo_Navbar'), 0)

def messageitem = Mobile.getText(findTestObject('SignIn/lbl_USRNM'), 0)

//'Get displayed message on the dialog'
Mobile.comment(messageitem)

//'Verify if displayed message is correct'
Mobile.verifyEqual(messageitem, 'rayidwi012')

