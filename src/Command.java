/**
 * A simple command that can be scheduled to run periodically.
 * The important point for your original request is that calling
 * {@link #run()} will always invoke {@link #initialize()} first.
 */
public class Command{
    /**
     * Override this method with initialization logic.
     * It will be called once when the command is started.
     */
    public void initialize() {
        // initialization code here
    }

    /**
     * Override with the work that should be performed periodically.
     */
    public void execute() {
        // execution code here
    }

    /**
     * Called once when {@link #isFinished()} returns true.
     */
    public void end() {
        // cleanup code here
    }

    /**
     * Return true when the command is complete and the scheduler
     * should cancel further executions.
     */
    public boolean isFinished() {
        return false;
    }

    /**
     * Starts the command. initialize() is invoked immediately
     * and the recurring task is scheduled.
     */
    /**
     * Convenience main method so the command can be executed standalone.
     */

}