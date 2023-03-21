package javahomework;

/**
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 */
public class Person {

    public static void main(String[] args) {
        //Main method
        Person person = new Person();  //Object calling of instance method in main method
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
        private String firstName;
        private String lastName;
        private int age;
        //Instance methods
        public String getFirstName () {    // 1st method getFirstName
            return this.firstName;
        }

        public String getLastName () {    //2nd method getLastName
            return this.lastName;
        }

        public int getAge () {           //3rd method getAge
            return this.age;
        }

        public void setFirstName (String firstName){   //4th method setFirstName
            this.firstName = firstName;
        }

        public void setLastName (String lastName){    //5th method setLastName
            this.lastName = lastName;
        }

        public void setAge ( int age){             //6th method setAge
            if (age < 0 || age > 100) {
                this.age = 0;
            } else {
                this.age = age;
            }
        }

        public boolean isTeen () {                 //7th method isTeen
            return (age > 12 && age < 20);
        }

        public String getFullName () {              //8th method getFullName
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return "";
            } else if (firstName.isEmpty()) {
                return lastName;
            } else if (lastName.isEmpty()) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }
        }
    }