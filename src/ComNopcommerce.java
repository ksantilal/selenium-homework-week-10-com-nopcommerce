import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    /**
     * Project-1 - ProjectName : com-nopcommerce
     * BaseUrl = https://demo.nopcommerce.com/
     * 1. Setup chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Navigate to Url.
     * “https://demo.nopcommerce.com/login?returnUrl= %2F"
     * 7. Print the current url.
     * 8. Navigate back to the home page.
     * 9. Navigate to the login page.
     * 10. Print the current url.
     * 11. Refresh the page.
     * 12. Enter the email to email field.
     * 13. Enter the password to password field.
     * 14. Click on Login Button.
     * 15. Close the browser.
     */

    public class ComNopcommerce {
        public static void main(String[] args) {

            String baseUrl = "https://demo.nopcommerce.com/";

            // 1. Setup chrome browser.
            WebDriver driver = new ChromeDriver();

            // 2: Open the URL into the Browser.
            driver.get(baseUrl);

            // 3. Print the title of the page.
            String title = driver.getTitle();
            System.out.println(title);

            // 4. Print the current Url.
            System.out.println("This is the Current Url: " + driver.getCurrentUrl());

            // 5. Print the page source.
            System.out.println(driver.getPageSource());

            // 6.Navigate the Url.
            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.navigate().to(loginUrl);

            // 7.Print the Current Url.
            System.out.println("This is Login page Url: " + driver.getCurrentUrl());

            // 8. Navigate back to the home page.
            driver.navigate().back();

            // 9. Navigate back to the login page.
            driver.navigate().forward();

            // 10. Print the current url.
            System.out.println("This is again login page Url: " + driver.getCurrentUrl());

            // 11. Refresh the page.
            driver.navigate().refresh();

            // 12. Enter the email to email field.
            WebElement emailField =  driver.findElement(By.id("Email"));
            emailField.sendKeys("smart1234@gmail.com");

            // 13. Enter the password to password field.
            WebElement passwordField = driver.findElement(By.name("Password"));
            passwordField.sendKeys("Sm1234");

            // 14. Click on Login Button.
            WebElement LoginLink = driver.findElement(By.linkText("Log in"));
            LoginLink.click();

            // 15.Close the Browser.
            driver.quit();
        }
    }


