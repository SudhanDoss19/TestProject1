package ProjectLogin;

import org.openqa.selenium.By;

public class FacebPgOj {

    public void launchUrl(){

        BrowserLaunch.driver.get("https://login.salesforce.com/?locale=in");
    }

    public void userCred(){
        BrowserLaunch.driver.findElement(By.xpath("//*[@type='email']")).sendKeys("testaccount");
        BrowserLaunch.driver.findElement(By.cssSelector("#password")).sendKeys("12345");
    }

    public void validUser() {
        BrowserLaunch.driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(BrowserLaunch.driver.findElement(By.xpath("//*[@id='error']")).getText());
    }

    public void closebrowser(){
        BrowserLaunch.driver.close();
    }

}




