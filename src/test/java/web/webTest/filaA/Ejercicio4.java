package web.webTest.filaA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import web.webTest.TestBaseTodoist;

public class Ejercicio4 extends TestBaseTodoist {

    @Test
    public void verifyCreateTask() throws InterruptedException {
        mainTodoistPage.loginButton.click();
        loginPage.emailTextBox.setText("lagu@lagu.com");
        loginPage.passwordTextBox.setText("12345678tarea");
        loginPage.loginButton.click();
        navBarSection.addTask.click();
        Thread.sleep(2000);
        navBarSection.taskName.setText("Tarea Laguna");
        Thread.sleep(2000);
        navBarSection.buttonOk.click();
        Thread.sleep(1000);
        navBarSection.buttonCancel.click();

        Assertions.assertTrue(navBarSection.taskExists("Tarea Laguna"), "ERROR! No se pudo crear la task");
    }
}
