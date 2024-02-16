import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BuyingCarss {

    private static ArrayList<Car> toBuyCarss= new ArrayList<Car>();

    private static ArrayList<ForRentTractiion> aboutRentTrac=new ArrayList<ForRentTractiion>();

    public BuyingCarss(){
        
    }

    public static void forBuyingCarrrsMeth(Car anyCaris){ 
        boolean sign=true;

        for(Car acarr:toBuyCarss)  
        {

        if(anyCaris.equals(acarr))       
        {

        sign=false; 
        break;
           }
        
        }
        if(sign==true)
        {
        toBuyCarss.add(anyCaris);
        System.out.println("Your choosen car " 
                +anyCaris.getTheNumbOFpPlateIs()+ "was ADDEDD Finally!!" );
        
        }
        else 
           System.out.println("Sorry! the car " 
                   +anyCaris.getTheNumbOFpPlateIs()
                   + " you tried to add was found aleady!!" );
        toBuyCarss.add(anyCaris); }
    public static void forRentCars(Car Oca, Customeer Ocu, DateOfRentt Dca){

        boolean signCar=true;
         boolean transacSign=true;
        
        for(Car c:toBuyCarss)
        {
        if (c.equals(Oca)) 
         {
             signCar=true;
             
             break;
             }
        else 
            signCar=false;
        }
        for (ForRentTractiion trnsction: aboutRentTrac )
        {
        if (trnsction.getAnotheCarToRentt().equals(Oca)
                && trnsction.getRenttinDate().equals(Dca))
        {

            transacSign=false;
              break;
             }
        }
        
        if (transacSign==true && signCar==true){ 

        
        ForRentTractiion tranent=new ForRentTractiion(Oca,
                Ocu,Dca);
        aboutRentTrac.add(tranent);
         System.out.println("The car"+ Oca.getTheNumbOFpPlateIs()
                 +" to ourcustomer "
                  +Ocu.getCivilUnIddis()+ "in "
                  + Dca.toString() +
                  "has been sold finally!");
        }
        else if (transacSign==true){

       System.out.println("The car transaction "+ Oca.getTheNumbOFpPlateIs()
               +" can't complete "
               + "because we don't have(own) this type of cars");
        }
        else
          System.out.println("The car"+ Oca.getTheNumbOFpPlateIs()
                  +" you tring to add to customeer "
                  +Ocu.getCivilUnIddis()+ " in "
                  + Dca.toString() +
     "founded sold before so you cannt add it TWICE!!Please try another one.");
     }
    public static void showingMaxCarent(){

    int maXx01=0;
    int maxNumOfPlate=0;
      for(Car c:toBuyCarss)
      {
         int countii=0;
         for (ForRentTractiion trnsction: aboutRentTrac)

      { if(c.equals(trnsction.getAnotheCarToRentt()))
              countii++;}
         
      if (countii>maXx01) {
          maXx01=countii;
           maxNumOfPlate= c.getTheNumbOFpPlateIs(); }
           } 
        System.out.println("The car "+ maxNumOfPlate + 
            " get the Max number of renting and the result of renting is:: " 
                + maXx01+ " times_was_taken!!");
       }
    public static void SaveCarssAndTrans(String fileWaays){
        Collections.sort(aboutRentTrac);
    try{   
    String ssttrrr="";
    File file = new File(fileWaays);
    PrintWriter diw = new PrintWriter(file);   

    for(ForRentTractiion trnsction: aboutRentTrac)
        
    {  ssttrrr += trnsction.toString(); } 

    diw.println(ssttrrr);

    diw.close();
    System.out.println("Details has been written and Saved!");
    }
    catch(FileNotFoundException eexFileN) {
        System.out.println("Sorry Your file isn't found yet... "); }
    }
}

