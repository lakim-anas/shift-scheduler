import java.time.DayOfWeek;

public class Shift {
    private final DayOfWeek day;
    private final int startHour;
    private final int endHour;
    private Employee assignedEmployee;

    public Shift(DayOfWeek day, int startHour, int endHour) {
        this.day = day;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public int getLengthInHours() {
        return endHour - startHour;
    }

    public boolean isAssigned() {
        return assignedEmployee != null;
    }

    public void assign(Employee employee) {
        this.assignedEmployee = employee;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }
}