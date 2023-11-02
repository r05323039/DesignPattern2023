package ian.Creational.Prototype.shallowClone;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Phone {
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
