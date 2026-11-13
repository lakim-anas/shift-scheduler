public class Employee {
    private final String name;
    private final int maxHoursPerWeek;

    public Employee(String name, int maxHoursPerWeek) {
        this.name = name;
        this.maxHoursPerWeek = maxHoursPerWeek;
    }

    public String getName() {
        return name;
    }

    public int getMaxHoursPerWeek() {
        return maxHoursPerWeek;
    }
}
