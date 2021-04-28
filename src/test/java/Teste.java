import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Teste {
    public static WebDriver driver;
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver","C:\\Users\\valter.chavana\\Desktop\\DEV\\ValidateAllure\\src\\test\\java\\resourses\\geckodriver25.exe");
        driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        testExemplo();

    }
    @Test
    static void testExemplo(){
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();
    }
}
