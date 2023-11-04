package ian.Structural.Decorator.level1;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

class PureCoffee implements Coffee {
    private String description;
    private int cost;

    public PureCoffee( int cost) {
        this.description = this.getClass().getSimpleName();
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
