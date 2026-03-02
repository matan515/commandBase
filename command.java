import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class command {

    static ScheduledExecutorService service = Executors.newScheduledThreadPool(0);

    static ScheduledFuture<?> task;


    public void initialize(){

    }

    public void execute(){
        
    }

    public void end(){
        
    }

    public boolean isFinished(){
        return false;
    }

    public void run(){
        initialize();
        task = service.scheduleAtFixedRate(() ->{
            execute(); 
            if(isFinished()){
                task.cancel(false); 
                end();
            }
         }, 0, 20, TimeUnit.MILLISECONDS);
    }
}