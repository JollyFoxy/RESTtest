import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.is;

public class Test1 {
    @Test
    public void test1(){
        RestAssured
                .when().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .then().assertThat().statusCode(200)
                .and().body("args.foo2", is ("bar2"));
    }
}
