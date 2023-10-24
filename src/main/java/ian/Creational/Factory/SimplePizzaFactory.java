package ian.Creational.Factory;

public class SimplePizzaFactory {
    public Pizza CreatePizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
        }
        // 缺陷 : 增加種類需要修改，違反開放封閉原則
        return pizza;
    }
}

class Pizza {
};

class CheesePizza extends Pizza {
};

class GreekPizza extends Pizza {
};

class PepperPizza extends Pizza {
};