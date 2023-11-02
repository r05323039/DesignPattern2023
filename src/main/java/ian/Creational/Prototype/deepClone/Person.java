package ian.Creational.Prototype.deepClone;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Person implements Cloneable {
    private String address;
    private Phone phone;

    public Person() {
        System.out.println("A person created.");
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {//覆寫clone方法
        System.out.println("Person clone invoke");
        Person clonePerson = (Person) super.clone();
        clonePerson.phone = phone.clone();// 物件屬性也clone並賦值
        return clonePerson;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("1234");

        Person person = new Person();
        person.setAddress("Taipei");
        person.setPhone(phone);
        try {
            Person clone = person.clone();
            System.out.println(person);
            System.out.println(clone);
            System.out.println(person == clone);

            clone.setAddress("Tainan");//更改基本型態 -> 與原型不同，不影響原型
            phone.setPhoneNumber("5678");//更改物件屬性 -> 與原型指向相同物件，會影響到原型的Phone
            System.out.println(person);
            System.out.println(clone);
            System.out.println(person.phone == clone.phone);
        } catch (CloneNotSupportedException e) {//implements Cloneable : 同意複製風險，不會拋意外
            throw new RuntimeException(e);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public Person setPhone(Phone phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
