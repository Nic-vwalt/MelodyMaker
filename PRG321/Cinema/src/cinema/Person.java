package cinema;

public abstract class Person extends Thread{
   protected  int personid, age;
   protected  String name, surname;

    public Person(int personid, int age, String name, String surname) {
        this.personid = personid;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonName() {
        return name;
    }

    public void setPersonName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + "personid=" + personid + ", age=" + age + ", name=" + name + ", surname=" + surname + '}';
    }  
}
