package Assignment_2;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    // default constructor set startTime as current system date
    public StopWatch() {
        startTime = new Date();
    }

    // return startTime
    public Date getStartTime() {
        return startTime;
    }

    // update startTime
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    // return endTime
    public Date getEndTime() {
        return endTime;
    }

    // update endTime
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    // set startTime as current system date
    public void start() {
        startTime = new Date();
    }

    // set endTime as current system date
    public void stop() {
        endTime = new Date();
    }

    // return elapsed time in millisecond
    public long getElapseTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
