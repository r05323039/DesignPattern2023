package ian.Behavioral.Strategy.level1;

 class ShapeCalculator {
     private ShapeStrategy strategy;

     public ShapeCalculator(ShapeStrategy strategy) {
         this.strategy = strategy;
     }

     public void setStrategy(ShapeStrategy strategy) {
         this.strategy = strategy;
     }

     public double calculateArea() {
         return strategy.calculateArea();
     }

     public double calculateVolume() {
         return strategy.calculateVolume();
     }
 }
