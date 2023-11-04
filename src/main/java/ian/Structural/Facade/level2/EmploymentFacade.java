package ian.Structural.Facade.level2;

class EmploymentFacade {
    private ImmigrationSystem immigrationSystem = new ImmigrationSystemImpl();
    private AgeVerificationSystem ageVerificationSystem = new AgeVerificationSystemImpl();
    private PoliceRecordSystem policeRecordSystem = new PoliceRecordSystemImpl();

    public boolean canHireEmployee(String id) {
        boolean condition = immigrationSystem.isLegalImmigrant(id)
                && ageVerificationSystem.isAgeValid(id)
                && policeRecordSystem.hasNoCriminalRecord(id);
        printResult(id, condition);
        return condition;
    }

    private void printResult(String id, boolean result) {
        String msg = result ? "符合雇用" : "不符合雇用";
        System.out.printf("身分證:%10s %s %n",id,msg);
    }
}
