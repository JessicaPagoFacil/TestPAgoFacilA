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

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Correo_LoginFormusername (1)'), 
    'jessicamaritor1993+1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Contrasea_LoginFormpassword (1)'), 
    'R2dZ4hvJ2ugbxLgaHgFasA==')

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/button_Entrar'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Mis Servicios (1)'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Ver Ms (1)'))

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/a_Cobrar'))

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/input_Monto_TbkTrxsmonto'), '5000')

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/input_Email_TbkTrxsemail'), 'Test@gmail.com')

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/div_sdsdsadad'), 'test')

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/textarea_Nota Interna_TrxsMeta_nota_interna_c5e68a'), 'test nota interna')

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/button_Crear'))

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/a_httpsgw-craft.pagofacil.clpayTransactionA_d713f1'))

WebUI.click(findTestObject('Object Repository/Page_PagoFcil mtodos de pgo/div_WebPayPlus PST'))

WebUI.click(findTestObject('Object Repository/Page_Pago Seguro WebPay/span_Crdito'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Nmero de tarjeta_card-number'), '4051 8856 0044 6623')

WebUI.setText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Fecha de expiracin_fechaExpiracion'), '1221')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_CVV_cvv'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Pago Seguro WebPay/button_Pagar  5.000'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Rut_rutClient'), '11.111.111-1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Clave_passwordClient'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Page_Pago Seguro WebPay/input (1)'))

WebUI.click(findTestObject('Page_Pago Seguro WebPay/input'))

WebUI.click(findTestObject('Object Repository/Page_Pago Seguro WebPay/a_Volver a la tienda'))

