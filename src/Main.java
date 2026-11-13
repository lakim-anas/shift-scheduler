public class Main {
    public static void main(String[] args) {
        Employee first = new Employee("Sara", 40);
        Employee second = new Employee("Omar", 25);
        Employee third = new Employee("ANAS", 30);
        
        System.out.println(first.getName() + " can work up to " + first.getMaxHoursPerWeek() + " hours.");
        System.out.println(second.getName() + " can work up to " + second.getMaxHoursPerWeek() + " hours.");
        System.out.println(third.getName() + " can work up to " + third.getMaxHoursPerWeek() + " hours.");
    }
}
