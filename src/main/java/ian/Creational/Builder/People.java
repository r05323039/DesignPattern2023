package ian.Creational.Builder;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringStyle.*;

class People {
    private String firstName;
    private String lastName;
    private String nickName;

    private People(Builder builder) {
        // 透過內部類Builder 過渡屬性
        // 內、外建構子都private，另外提供public方法調用建構子
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nickName = builder.nickName;
    }

    public static Builder Builder(String firstName, String lastName) {
        //先完成內部類Builder的建構子
        //透過People類別的靜態方法，建立Builder實例，避免new People.Builder()
        return new Builder(firstName, lastName);
    }


    public static class Builder {
        //內部類別會隱式地保有指向外部類別"實例"的參考。
        //如果內部類別不是靜態的，必須先建立一個外部類別的實例，然後才能建立內部類別的實例。
        private String firstName;
        private String lastName;
        private String nickName;

        private Builder(String firstName, String lastName) {// Builder建構子設定必填屬性
            // 只能透過People提供的靜態方法，不能new People.Builder()
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
