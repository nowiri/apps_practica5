
import io.javalin.Javalin;

public class Main {
    
    public static void main(String[] args) {
        //OUTPUT MSG
        String msg = "DEFAUL MSG FOR APP 2: BYE BYE";

        //JAVALIN INSTANCE
        Javalin app = Javalin.create().start(7000);

        //DEFAULT ENDPOINT
        app.get("/", ctx -> ctx.result(msg));

    }
}
