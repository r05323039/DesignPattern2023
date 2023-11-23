package ian.Creational.Prototype.shallowClone;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

class Person implements Cloneable {
    private String address;
    private Phone phone;

    public Person() {
        System.out.println("A person created.");
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {//覆寫clone方法
        System.out.println("clone invoke");
        return (Person) super.clone();
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

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
