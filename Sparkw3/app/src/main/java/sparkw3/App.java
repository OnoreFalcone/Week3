/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static spark.Spark.*;
package sparkw3;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Spark.get("/users/0/welcome", (req, res) -> {return "Hallo Ueli";});
    }
}
