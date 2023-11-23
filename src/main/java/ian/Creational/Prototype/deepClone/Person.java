package ian.Creational.Prototype.deepClone;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

class Person implements Cloneable {
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
