package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void doLogin(){
        $("#email").sendKeys("janthird2021batch@gmail.com");
        $("#passwd").sendKeys("Selenium12345");
        $("#SubmitLogin").click();
    }

    public String accountPageIsVisible(){
        return $("div#center_column h1").getText();
    }

    public void navigateToContactsPage(){
        $("#contact-link").click();
    }


   /* or create a new repository on the command line
    echo "# SerenityWithGradleJavaFramework" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/martinsadeyeye/SerenityWithGradleJavaFramework.git
    git push -u origin main


push an existing repository from the command line
    git remote add origin https://github.com/martinsadeyeye/SerenityWithGradleJavaFramework.git
    git branch -M main
    git push -u origin main*/
}