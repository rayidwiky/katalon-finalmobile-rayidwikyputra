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

// Cek apakah file APK ada di lokasi yang diharapkan
if (new File(filePath).exists()) {
    Mobile.startApplication(filePath, true)

    Mobile.tap(findTestObject('Object Repository/SignUp/Logo_Navbar'), 0)
    Mobile.tap(findTestObject('Object Repository/SignUp/btn_Login'), 0)
    Mobile.tap(findTestObject('Object Repository/SignUp/btn_SignUp'), 0)
    Mobile.setText(findTestObject('SignUp/inpt_USRName'), UserName, 0)
    Mobile.setText(findTestObject('Object Repository/SignUp/Inpt_Mail'), Mail, 0)
    Mobile.setText(findTestObject('Object Repository/SignUp/inpt_Pass'), Pwd, 0)
    Mobile.setText(findTestObject('SignUp/inpt_confirmPass'), Pwd, 0)
    Mobile.hideKeyboard()
    Mobile.scrollToText('CITY', FailureHandling.STOP_ON_FAILURE)
    Mobile.setText(findTestObject('SignUp/Inpt_Name'), Name, 0)
    Mobile.setText(findTestObject('SignUp/Inpt_LastName'), LastName, 0)
    Mobile.setText(findTestObject('SignUp/Inpt_PhoneNM'), PhoneNM, 0)
    Mobile.hideKeyboard()
    Mobile.tap(findTestObject('SignUp/Btn_Location'), 0)
    Mobile.tap(findTestObject('SignUp/btn_register'), 0)
} else {
    // Jika file APK tidak ditemukan, tampilkan pesan kesalahan
    WS.comment("Error: File APK not found at the specified location.")
}

