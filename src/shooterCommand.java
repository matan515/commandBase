
import java.util.Scanner;

public class shooterCommand extends Command{
    
    Scanner scanner = new Scanner(System.in);
    Boolean toFinas;

    @Override
    public void initialize(){
        System.out.println("start");
    }

    @Override
    public void execute() {
        System.out.println("its going, to finas?" + " true or false");
        toFinas = scanner.nextBoolean();
    }

    @Override
    public void end() {
        System.out.println("end");
    }

    @Override
    public boolean isFinished() {
        return toFinas;
    }

    
}
