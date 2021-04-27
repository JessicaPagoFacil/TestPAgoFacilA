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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dashboard.craft.pagofacil.cl/site/login')

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Correo_LoginFormusername (9)'), 
    User)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Contrasea_LoginFormpassword (9)'), 
    Pass)

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/button_Entrar (7)'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Mis Servicios (9)'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Crear uno nuevo (5)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/select_SIN ECOMMERCE (MANUAL)WOOCOMMERCESHO_bcc662 (4)'), 
    Select_Ecomerce, true)

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/input_Nombre Comercio_ServiciosTbknombreComercio'), Nombre_Ecomerce)

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/div_Url ServicioEs importante que la url es_a656e8'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/div_Url ServicioEs importante que la url es_a656e8'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Url Servicio_ServiciosTbkurl_servicio (5)'), 
    Link_Ecomerce)

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/button_Crear (7)'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Nombre Comercio_ServiciosTbknombreComercio (5)'), 
    Texto_Comerce)

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/button_Crear (7)'))

