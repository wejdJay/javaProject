
public class Car {

    private int theNumbOFpPlateIs;    
    private String thenOfTheBrCa;
    private int scoreOFrenRa;
    private int cModelYearIs;
    private String colorOfC;
    private String caTypeIs;

    public Car(){
       this(0,null,0,0,
               null,null);
    }

    public Car(int theNumbOFpPlateIs,String thenOfTheBrCa,
            int scoreOFrenRa,int YearOfca,String theCaCol,String theCaTys){
        this.theNumbOFpPlateIs= theNumbOFpPlateIs;
        this.thenOfTheBrCa=thenOfTheBrCa;
        this.scoreOFrenRa=scoreOFrenRa;
        cModelYearIs=YearOfca;
        colorOfC= theCaCol;
        caTypeIs=theCaTys;
    }
    public int getTheNumbOFpPlateIs(){
        return theNumbOFpPlateIs;
    }

    public String getThenOfTheBrCa() {
        return thenOfTheBrCa;
    }

    public int getScoreOFrenRa() {
        return scoreOFrenRa;
    }

    public int getcModelYearIs() {
        return cModelYearIs;
    }

    public String getColorOfC() {
        return colorOfC;
    }

    public String getCaTypeIs() {
        return caTypeIs;
    }

    public void setTheNumbOFpPlateIs(int plaNuniq){
    theNumbOFpPlateIs=plaNuniq;
    }

    public void setThenOfTheBrCa(String cB_Rna) {
        thenOfTheBrCa = cB_Rna;
    }

    public void setScoreOFrenRa(int scOfRenntii) {
        scoreOFrenRa = scOfRenntii;
    }

    public void setcModelYearIs(int yOfCaMod) {
        cModelYearIs = yOfCaMod;
    }

    public void setColorOfC(String caCalo) {
       colorOfC = caCalo;
    }

    public void setCaTypeIs(String tyOfCa) {
        caTypeIs = tyOfCa;
    } 

   public String toString(){   
   return "Number of plate is\\"+ theNumbOFpPlateIs
           +"The car brand is\\" +thenOfTheBrCa + 
           "Score result is\\"+ scoreOFrenRa +"The model of the car is\\ "
           + cModelYearIs+ "Car color is\\"+colorOfC +
           "Typppe of the car\\ "+caTypeIs;
   }
    
   public boolean equals(Object checkpls){
       Car anyca=(Car)checkpls;
       return theNumbOFpPlateIs ==anyca.theNumbOFpPlateIs;
   }
    
    
}
