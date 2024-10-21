public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        Person sarah = new Person("Sarah", 30);
        sarah.setName("Monika");
        sarah.increaseAge(2);
        if (personService.isAdult(sarah)) { // метод класса
            System.out.println("Go to bar!");
        } else {
            System.out.println("Go to school!");
        }
        System.out.println(sarah);




    }
}