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

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/input_Correo_LoginFormusername (1)'), User)

WebUI.setEncryptedText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/input_Contrasea_LoginFormpassword (1)'), Pass)

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/button_Entrar'))

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/a_Mis Servicios (1)'))

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/a_Ver Ms (1)'))

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/a_Cobrar'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Monto_TbkTrxsmonto (3)'), Monto)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Email_TbkTrxsemail (3)'), CorreoMonto)

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/div_sdsdsadad'), TextNotaInterna1)

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/textarea_Nota Interna_TrxsMeta_nota_interna_c5e68a'), TextNotaInterna2)

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/button_Crear (1)'))

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/a_httpsgw-craft.pagofacil.clpayTransactionA_fd5ad3'))

WebUI.click(findTestObject('Object Repository/Page_PagoFcil mtodos de pgo/div_Este cdigo permite recibir pagos con ta_9046bf'))

WebUI.click(findTestObject('Object Repository/Page_Pago Seguro WebPay/button_Crdito (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Nmero de tarjeta_card-number (2)'), NdeTarjeta)

WebUI.setText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Fecha de expiracin_fechaExpiracion (2)'), 
    '1221')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_CVV_cvv (2)'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Pago Seguro WebPay/button_Pagar  5.000 (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Rut_rutClient'), Transbank)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pago Seguro WebPay/input_Clave_passwordClient'), PassTransbank)

WebUI.click(findTestObject('Page_Pago Seguro WebPay/input (1)'))

WebUI.click(findTestObject('Object Repository/Page_Pago Seguro WebPay/input'))

WebUI.waitForAlert(10)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dashboard.craft.pagofacil.cl/site/login')

WebUI.setText(findTestObject('Page_Pago Fcil - Pasarela de Pagos/input_Correo_LoginFormusername'), User)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Contrasea_LoginFormpassword (12)'), 
    Pass)

WebUI.click(findTestObject('Page_Pago Fcil - Pasarela de Pagos/button_Entrar'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Mis Servicios (12)'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Ver Ms (5)'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Ms Info'))

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/a_Facturar (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_RUT Contraparte_rutContraparte (1)'), 
    Rut_Contraparte)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Razon Social contraparte_razonSocialC_a8856c (1)'), 
    Razon_Social)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Comuna contraparte_comunaContraparte (1)'), 
    Contraparte)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Codigo de sucursal_codigoSucursal (1)'), 
    Codigo_Sucursal)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_Direccin contraparte_direccionContraparte (1)'), 
    Direccion)

WebUI.selectOptionByValue(findTestObject('Page_Pago Fcil - Pasarela de Pagos/select_-- Selecciona una opcin --Factura Ex_d63c67 (1)'), 
    Tipo_de_factura, true)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_NOMBRE_producto (1)'), Producto)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_CANTIDAD_cantidad (1)'), CantidadProductos)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/input_PRECIO_valor (1)'), Precio_Producto)

WebUI.setText(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/textarea_DESCRIPCIN_descripcion (1)'), 
    Descripcion)

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/button_Agregar producto (1)'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Object Repository/Page_Pago Fcil - Pasarela de Pagos/button_Cargar Factura (1)'))

WebUI.waitForAlert(15)

WebUI.takeScreenshot()

