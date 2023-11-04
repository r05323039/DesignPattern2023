package ian.Structural.Facade.level2;

class AgeVerificationSystemImpl implements AgeVerificationSystem {
    public boolean isAgeValid(String id) {
        // 是否成年
        return id.length() > 5;
    }
}