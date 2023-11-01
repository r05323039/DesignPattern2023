package ian.Creational.Builder;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.*;

public class People {
    private String firstName;
    private String lastName;
    private String nickName;

    private People(Builder builder) { // private 只有內部class可調用，透過Builder物件過渡屬性，
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nickName = builder.nickName;
    }

    public static Builder Builder(String firstName, String lastName) {
        //先完成內部類Builder的建構子，外部物件提供公開靜態方法，建構Builder
        return new Builder(firstName, lastName);
    }


    public static class Builder {
        private String firstName;
        private String lastName;
        private String nickName;

        public Builder(String firstName, String lastName) {
            //Builder建構子設定必填屬性，外部public static Builder Builder再配合修改
            this.firstName = firstName;
            this.lastName = lastName;
        }

        private Builder setFirstName(String firstName) {// 必填參數可不提供setter或將其private
            this.firstName = firstName;
            return this; // 返回Builder自己，連鎖設定參數
        }

        private Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public People build() { //調用People的private建構子，並將自己傳入
            return new People(this);
        }
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, SHORT_PREFIX_STYLE);
    }
}
