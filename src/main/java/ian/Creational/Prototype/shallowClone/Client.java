package ian.Creational.Prototype.shallowClone;

class Client {
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
            System.out.println(person.getPhone() == clone.getPhone());
        } catch (CloneNotSupportedException e) {//implements Cloneable : 同意複製風險，不會拋意外
            throw new RuntimeException(e);
        }
    }
}
