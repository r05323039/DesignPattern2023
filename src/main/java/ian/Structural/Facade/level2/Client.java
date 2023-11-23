package ian.Structural.Facade.level2;

class Client {

    public static void main(String[] args) {
        EmploymentFacade employmentFacade = new EmploymentFacade();
        String legalId = "123456789";
        employmentFacade.canHireEmployee(legalId);

        String illegalId = "123";
        employmentFacade.canHireEmployee(illegalId);

    }
}
