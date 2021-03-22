import java.util.Date; // (https://docs.oracle.com/javase/7/docs/api/)
import java.text.SimpleDateFormat; // (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)

public class Task{
    
    /* Do not modify */
    private String msg_reminder, notes;
    private Date do_date;
    private int priority = 0;
    private boolean status = false;
    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat simpleDateFormat;

    /* Your code here */

    public String getNotes(){
        return this.notes;
    }

    public int getPriority(){
        return this.priority;
    }

    public boolean getStatus(){
        return this.status;
    }

    public boolean markAsDone(){
        return this.status = true;
        
    }

    public String getTaskDate(){
        /* Your code here */
    }

    public String toString(){
        return "Task: " + this.msg_reminder + " Priority: " + this.priority + " Do Date: " + this.do_date;
    }

}