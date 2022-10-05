package classes_e_metodos_abstratos.entities;

public class PhysicalPerson extends TaxPayer {

    private Double healtExpenses;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, Double annualIncome, Double healtExpenses) {
        super(name, annualIncome);
        this.healtExpenses = healtExpenses;
    }

    public Double getHealtExpenses() {
        return healtExpenses;
    }

    @Override
    public Double incomeTax() {
        if (getAnnualIncome() < 20000.00) {
            return getAnnualIncome() * 0.15 - (healtExpenses * 0.5);
        } else {
            return getAnnualIncome() * 0.25 - (healtExpenses * 0.5);
        }
    }
}
