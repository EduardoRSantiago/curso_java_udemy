package heranca_e_polimorfismo.entities;

public class ImporterdProduct extends Product{

    private Double customsFee;

    public ImporterdProduct() {
        super();
    }

    public ImporterdProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }
}
