
public class ClassToTestIn {
    public static void main(String[] args) {

        
        Car OneCar=new Car(1,"OUDI",5, 2022 ,"BLACK","SEDAN");
         Car TwoCar=new Car(2,"TESLA",3, 2021 ,"White","SEDAN");
           Car ThreeCar=new Car(3,"BMW,",2, 2018 ,"Blue","SEDAN");
             Car FourCar=new Car(4,"MURCIDES",7, 2023 ,"GRAY","SEDAN");
               Car FiveCar=new Car(5,"MAZDA,.",6, 2021 ,"DarkBlack","SUV..");
        

        Customeer cast1= new Customeer(376,23,"Wejdan Mohammed", "Riyadhh", "0509177190");
          Customeer cast2= new Customeer(253,26,"Mohammed Khalid", "Dammam", "050659263");
            Customeer cast3= new Customeer(582,44,"Monirah MOHAMMEDD", "Riyadhh", "0509271562");
    
    
    BuyingCarss.forBuyingCarrrsMeth(OneCar);
     BuyingCarss.forBuyingCarrrsMeth(TwoCar);
      BuyingCarss.forBuyingCarrrsMeth(ThreeCar);
       BuyingCarss.forBuyingCarrrsMeth(FourCar);
        BuyingCarss.forBuyingCarrrsMeth(TwoCar);
    
    
    BuyingCarss.forRentCars(OneCar, cast2, new DateOfRentt(21,12,2022));
     BuyingCarss.forRentCars(TwoCar, cast2, new DateOfRentt(21,12,2022));
      BuyingCarss.forRentCars(OneCar, cast2, new DateOfRentt(21,12,2022));
       BuyingCarss.forRentCars(TwoCar, cast2, new DateOfRentt(27,12,2022));
        BuyingCarss.forRentCars(FiveCar, cast2, new DateOfRentt(21,12,2022));
         BuyingCarss.forRentCars(TwoCar, cast2, new DateOfRentt(21,12,2022));

       
       BuyingCarss.showingMaxCarent();
       
       BuyingCarss.SaveCarssAndTrans("src/NewFilForRets");
  
    }
}
