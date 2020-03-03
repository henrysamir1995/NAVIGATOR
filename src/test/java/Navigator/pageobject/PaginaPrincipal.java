package Navigator.pageobject;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.Robot;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.hamcrest.MatcherAssert.assertThat;

public class PaginaPrincipal extends PageObject {

    Robot r =new Robot();
    public static final String TITULO_RESULTADO = "body.ecm.oneui.ecm-en.idx_dojo_1_10.dj_chrome.dj_chrome79.icn:nth-child(2) div.ecmLayout.dijitContentPane.dijitContentPaneSingleChild div.dijitBorderContainerNoGutter.dijitContainer.contentPane.dijitLayoutContainer div.dijitStackContainer.dijitContainer.dijitLayoutContainer.stackContainer.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitStackContainer.dijitBorderContainerNoGutterPane.dijitAlignCenter div.dijitStackContainerChildWrapper.dijitVisible:nth-child(2) div.dijitBorderContainerNoGutter.dijitContainer.launchBarPane.dijitStackContainer-child.dijitStackContainer-dijitBorderContainerNoGutter.dijitLayoutContainer div.ecmLaunchBarContainer.dijitBorderContainerNoGutter.dijitContainer.launchBarContainer.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitBorderContainerNoGutter.dijitBorderContainerNoGutterPane.dijitAlignCenter.dijitLayoutContainer div.dijitStackContainer.dijitContainer.dijitLayoutContainer.launchBarContentArea.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitStackContainer.dijitBorderContainerNoGutterPane.dijitAlignCenter div.dijitStackContainerChildWrapper.dijitVisible:nth-child(2) div.ecmCenterPane.dijitContentPane.dijitStackContainer-child.dijitStackContainer-dijitContentPane.dijitContentPaneSingleChild.hideNavContainerTop div.dijitBorderContainerNoGutter.dijitContainer.idxBorderContainer.idxBorderContainerToggle.contentPane.dijitLayoutContainer div.dijitTabContainer.dijitTabContainerTop.dijitContainer.dijitLayoutContainer.tabStrip-disabled.contentPane.ecmSearchTabContainer.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitTabContainerTop.dijitBorderContainerNoGutterPane.dijitAlignCenter div.dijitTabPaneWrapper.dijitTabContainerTop-container.dijitAlignCenter div.dijitTabContainerTopChildWrapper.dijitVisible:nth-child(2) div.ecmSearchTab.ecmCommonNoPadding.dijitTabPane.dijitTabContainerTop-child div.dijitBorderContainerNoGutter.dijitContainer.idxBorderContainer.idxBorderContainerToggle.ecmSearchMainContainer.dijitLayoutContainer div.dijitContentPane.dijitTitlePane.searchResultsPane.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitContentPane.dijitBorderContainerNoGutterPane.dijitAlignCenter:nth-child(3) div.dijitBorderContainerNoGutter.dijitContainer.idxBorderContainer.idxBorderContainerToggle.searchResultsArea.dijitLayoutContainer div.dijitContentPane.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitContentPane.dijitBorderContainerNoGutterPane.dijitAlignCenter div.ecmContentList.dijitBorderContainerNoGutter.dijitContainer.dijitLayoutContainer div.dijitBorderContainerNoGutter.dijitContainer.idxBorderContainer.idxBorderContainerToggle.contentPane.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitBorderContainerNoGutter.dijitBorderContainerNoGutterPane.dijitAlignCenter.dijitLayoutContainer:nth-child(2) div.dijitContentPane.compact.gridxWholeRow.dijitBorderContainerNoGutter-child.dijitBorderContainerNoGutter-dijitContentPane.dijitBorderContainerNoGutterPane.dijitAlignCenter.dijitContentPaneSingleChild:nth-child(1) div.gridx.gridxDesktop div.gridxMain.dojoDndTarget.dojoDndContainer:nth-child(3) > div.gridxBodyEmpty";

    @FindBy(xpath= "//*[@id=\"userIdInput\"]")
    WebElementFacade btnUser;

    @FindBy(xpath = "//*[@id=\"mainLogin\"]/form/div[2]/input")
    WebElementFacade btnAceptar;

    @FindBy(xpath = "//*[@id=\"userPasswordInput\"]")
    WebElementFacade btnClave;

    @FindBy(xpath = "//*[@id=\"dijit_form_DropDownButton_0\"]/span[3]")
    WebElementFacade desplegar;

    @FindBy(xpath = "//*[@id=\"dijit_MenuItem_9_text\"]")
    WebElementFacade desplegar2;

    @FindBy(xpath="//*[@id=\"idx_form_ComboLink_0_link\"]")
    WebElementFacade ver;

    @FindBy(xpath = "//*[@id=\"ecm_widget_search_BasicSearchDefinition_0_searchButton_label\"]")
    WebElementFacade search;

    @FindBy(xpath = "//*[@id=\"gridx_Grid_7\"]/div[3]")
    WebElementFacade resultado;

    @FindBy(xpath = "//*[@id=\"ecm_widget_MessageBar_0_messageSelector\"]/tbody[2]/tr/td[1]/div[1]/span")
    WebElementFacade cp;

    @FindBy(xpath = "//*[@id=\"gridx_Grid_2\"]/div[1]")
    WebElementFacade dropdown;

    @FindBy(xpath = "//*[@id=\"widget_ecm_widget_FilteringSelect_0\"]/div[1]/input")
    WebElementFacade desplegardrop;
    WebDriver driver=getDriver();

    public PaginaPrincipal() throws AWTException {
    }

    public void aceptarTerminos() throws InterruptedException {

        //Actions action = new Actions(driver);
        Thread.sleep(15000);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(900);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(900);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(900);
        Serenity.takeScreenshot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(900);
        Serenity.takeScreenshot();
        //action.contextClick(archivo).build().perform();
}
        public void loguearse(String correo, String pssw) throws InterruptedException {
            //btnuser.withTimeoutOf(2, TimeUnit.SECONDS).waitUntilClickable().sendKeys("joel.armando.leiva.collazos@everis.com");
            btnUser.sendKeys(correo);
            Serenity.takeScreenshot();
            btnAceptar.click();
            Thread.sleep(900);
            btnClave.sendKeys(pssw);
            Serenity.takeScreenshot();
            btnAceptar.click();
            Thread.sleep(9000);
        }

        public void busqueda(String text) throws InterruptedException {
            desplegar.click();
            Serenity.takeScreenshot();
            desplegar2.click();
            ver.click();
            Thread.sleep(900);
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            StringSelection stringSelection = new StringSelection(text);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, stringSelection);
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            desplegardrop.click();
            search.click();
            Thread.sleep(9000);
            dropdown.click();
            Thread.sleep(9000);
            //Serenity.takeScreenshot();
        }

    /*public String casa() {
        return resultado.withTimeoutOf(10,TimeUnit.SECONDS).getText();
    }*/
    public void casaa() throws InterruptedException {
        /*r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);*/
        Thread.sleep(9000);
        Serenity.takeScreenshot();
    }
    public String web() {
        return cp.withTimeoutOf(10,TimeUnit.SECONDS).getText();
    }

}
