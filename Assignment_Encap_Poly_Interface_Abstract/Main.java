public class Main{
    public static void main(String[] args){
        employee.FullTimeEmployee f=new employee.FullTimeEmployee("E01","Alice",50000,5000);
        employee.PartTimeEmployee p=new employee.PartTimeEmployee("E02","Bob",1000,40,200);
        employee.Employee[] emps={f,p};
        for(employee.Employee e:emps) e.displayDetails();

        ecommerce.Product[] products=new ecommerce.Product[]{
            new ecommerce.Electronics("P1","Phone",20000,0.1),
            new ecommerce.Clothing("P2","Shirt",1000,50),
            new ecommerce.Groceries("P3","Rice",200)
        };
        for(ecommerce.Product pr:products){
            double tax=pr instanceof ecommerce.Taxable?((ecommerce.Taxable)pr).calculateTax():0;
            double finalPrice=pr.getPrice()+tax-pr.calculateDiscount();
            System.out.println(pr.getName()+" Final:"+finalPrice);
        }

        vehicle.Vehicle[] vs=new vehicle.Vehicle[]{
            new vehicle.Car("KA01",1000,2000),
            new vehicle.Bike("KA02",300,200),
            new vehicle.Truck("KA03",2000)
        };
        for(vehicle.Vehicle v:vs){
            System.out.println(v.getType()+" Rent:"+v.calculateRentalCost(3));
            if(v instanceof vehicle.Insurable) System.out.println(((vehicle.Insurable)v).getInsuranceDetails()+":"+((vehicle.Insurable)v).calculateInsurance());
        }

        banking.SavingsAccount sa=new banking.SavingsAccount("A1","John",10000,0.04);
        banking.CurrentAccount ca=new banking.CurrentAccount("A2","Mary",20000,5000);
        sa.deposit(500);
        ca.withdraw(1000);
        System.out.println(sa.calculateInterest()+" " + ca.calculateLoanEligibility());

        library.LibraryItem[] items=new library.LibraryItem[]{new library.Book("B1","Java","Author"), new library.Magazine("M1","Tech","Editor"), new library.DVD("D1","Movie","Director")};
        for(library.LibraryItem it:items) System.out.println(it.getItemDetails()+" LoanDays:"+it.getLoanDuration());

        food.FoodItem vitem=new food.VegItem("Paneer",200,2,20);
        food.FoodItem nvitem=new food.NonVegItem("Chicken",300,1,30,10);
        System.out.println(vitem.getItemDetails());
        System.out.println(nvitem.getItemDetails());

        hospital.Patient in=new hospital.InPatient("P1","Z",30,500);
        hospital.Patient out=new hospital.OutPatient("P2","Y",25,300);
        System.out.println(in.getPatientDetails()+" Bill:"+in.calculateBill());
        System.out.println(out.getPatientDetails()+" Bill:"+out.calculateBill());

        ride.VehicleRide cr=new ride.CarRide("R1","D1",10);
        ride.VehicleRide br=new ride.BikeRide("R2","D2",7);
        System.out.println(cr.getVehicleDetails()+" Fare:"+cr.calculateFare(10));
        System.out.println(br.getVehicleDetails()+" Fare:"+br.calculateFare(10));
    }
}
