package web.webTest.filaB;

import api.config.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import web.webTest.TestBaseTodoLy;

public class Ejercicio4 extends TestBaseTodoLy {
    String psw = "12345678tarea";
    String Newpsw = "123123tarea";
    @Test
    public void verifyPregunta3() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText(Configuration.user);
        loginSection.passwordTextBox.setText(psw);
        loginSection.loginButton.click();
        Thread.sleep(5000);
        menuSection.settingButton.click();
        Thread.sleep(2000);
        settingsSection.oldPwdTxtBox.setText(psw);
        settingsSection.newPwdTxtBox.setText(Newpsw);
        settingsSection.confirmChangesButton.click();
        Thread.sleep(2000);
        menuSection.logoutButton.click();
        Thread.sleep(2000);
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText(Configuration.user);
        loginSection.passwordTextBox.setText(Newpsw);
        loginSection.loginButton.click();

        Thread.sleep(5000);
        Assertions.assertTrue(menuSection.settingButton.isControlDisplayed(), "ERROR, No se pudo cambiar la contraseña");
    }
}
