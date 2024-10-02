package lab24;
 class Person {
    private String name;
    private String address;
    private int yearOfBirth;

    public void setDetails(String n, String m, int p) {
        name = n;
        address = m;
        yearOfBirth = p;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Year of Birth: " + yearOfBirth);
    }

    int calculateAge(int currentYear) {
        return currentYear - yearOfBirth;
    }
}
class PersonTest{
    public static void main(String[] args) {
        Person person = new Person();
        person.setDetails("Alice", "Wonderland", 1965);
        person.displayDetails();
        int currentYear = 2024; // Replace with the actual current year
        int age = person.calculateAge(currentYear);
        System.out.println("Age: " + age);
    }
}