public class robot implements Runnable{
    Command command;    

    public robot(Command command){
        this.command = command;
    }

    @Override
    public void run() { 
        command.initialize();
        while(!command.isFinished()) command.execute();
        if(command.isFinished()) command.end();
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
