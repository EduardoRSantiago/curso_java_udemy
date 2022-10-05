package classes_e_metodos_abstratos.entities;

public abstract class TaxPayer {

    private String name;
    private Double annualIncome;

    public TaxPayer() {

    }

    public TaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public abstract Double incomeTax();

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", incomeTax());
    }
}

