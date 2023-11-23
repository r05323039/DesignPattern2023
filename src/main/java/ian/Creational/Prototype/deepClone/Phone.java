package ian.Creational.Prototype.deepClone;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

class Phone implements Cloneable {
    @Override
    protected Phone clone() throws CloneNotSupportedException {
        return (Phone) super.clone();// deep clone : 物件屬性也要有clone()
    }

    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Phone setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
