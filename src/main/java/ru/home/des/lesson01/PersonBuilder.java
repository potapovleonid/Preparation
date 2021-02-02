package ru.home.des.lesson01;

public class PersonBuilder {

        private final Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder addFirstName(String firstName){
            person.setFirstName(firstName);
            return this;
        }

        public PersonBuilder addLastName(String lastName){
            person.setLastName(lastName);
            return this;
        }

        public PersonBuilder addMiddleName(String middleName){
            person.setMiddleName(middleName);
            return this;
        }

        public PersonBuilder addCountry(String country){
            person.setCountry(country);
            return this;
        }

        public PersonBuilder addAddress(String address){
            person.setAddres(address);
            return this;
        }

        public PersonBuilder addPhone(String phone){
            person.setPhone(phone);
            return this;
        }

        public PersonBuilder addAge(int age){
            person.setAge(age);
            return this;
        }

        public PersonBuilder addGender(String gender){
            person.setGender(gender);
            return this;
        }

        public Person build(){
            return person;
        }
}
