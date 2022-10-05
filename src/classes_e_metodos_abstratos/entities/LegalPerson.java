package classes_e_metodos_abstratos.entities;

public class LegalPerson extends TaxPayer{

    private Integer numberOfEmployees;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double incomeTax() {

        if (numberOfEmployees <= 10) {
            return getAnnualIncome() * 0.16;
        } else {
            return getAnnualIncome() * 0.14;
        }
    }
}
