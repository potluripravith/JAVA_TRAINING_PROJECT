
public class Delux_Pizza  extends Pizza{

	public Delux_Pizza(Boolean veg) {
        super(veg);
        if (veg) {
            this.price = 550;
        } else {
            this.price = 650;
        }
        basePizzaPrice = this.price;
    
	}

	@Override
	public void addExtraCheese() {
		// TODO Auto-generated method stub
		super.addExtraCheese();
	}

	@Override
	public void addExtraToppings() {
		// TODO Auto-generated method stub
		super.addExtraToppings();
	}
	


	

}
