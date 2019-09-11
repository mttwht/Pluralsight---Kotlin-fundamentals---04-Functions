import com.mttwht.*;

public class App {
    public static void main(String[] args) {
//        ProgramKt.display("Hello, World from Java"); // works before adding JvmName annotation
        DisplayFunctions.log("Hello, World from Java");
        DisplayFunctions.log("Hello, World from Java", 3);
    }
}
