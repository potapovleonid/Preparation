package ru.home.des.lesson01;

public class Test {
    public static void main(String[] args) {
        Person person;
        person = new PersonBuilder().addFirstName("test")
                .addLastName("testiy")
                .addMiddleName("testovich")
                .addAddress("Ekateriburh")
                .addCountry("Russia")
                .addPhone("777777777")
                .addAge(15)
                .addGender("male")
                .build();

        System.out.println(person.toString());
    }
}
