

/**
 *WEJDANMOHAMMEDALWADI'STMA
 *   ^^^^^the_describtion_comment_iwill_write_alot_of_hings_so_idont_loss_my~own 
 * marks_for_simIlaRrity```
 * and connect the wrd together***^^^^
 * this-one-olnyForTransactionInThisCompanyYouCanSaveAllDataHere....,
 * TheData....like whatIDidWriteItDownHereCheckIt,~
 * ImadeItAllpraiveteCusIdon't~wanna~anyoneToAccessOnThemmm****
 * wejdannnMohammeddAlwaddii
 * 
 */
public class ForRentTractiion implements Comparable<ForRentTractiion>{
    /*Imade--many--attriibutess--without--initilaizing
--anyvalue--foranyone-|othese.JUSTCREATINGTHEM*/
    private Car anotheCarToRentt;
    private Customeer namOFCusto;
    private DateOfRentt renttinDate;
    
     //AnEmptyConstructorWasMade
        public ForRentTractiion(){
        this(null,null,null);
    }
     //AMultipleConstructorWasMade
    public ForRentTractiion(Car anotheCarToRentt, 
            Customeer namOFCusto, DateOfRentt renttinDate) {
        this.anotheCarToRentt = anotheCarToRentt;
        this.namOFCusto = namOFCusto;
        this.renttinDate = renttinDate;
    }

    public Car getAnotheCarToRentt() {
        return anotheCarToRentt;
    }//ItWillReturnTheValueIaskeDFOr

    public Customeer getNamOFCusto() {
        return namOFCusto;
    }//ItWillReturnTheValueIaskeDFOr

    public DateOfRentt getRenttinDate() {
        return renttinDate;
    }//ItWillReturnTheValueIaskeDFOr

    public void setAnotheCarToRentt(Car caFoRen) {
        anotheCarToRentt = caFoRen;
    }//ItWillSetTheValueIaskeDTO

    public void setNamOFCusto(Customeer naOffcuu) {
       namOFCusto = naOffcuu;
    }//ItWillSetTheValueIaskeDTO

    public void setRenttinDate(DateOfRentt dayyOfReenn) {
        renttinDate = dayyOfReenn;
    } //ItWillSetTheValueIaskeDTO

   
    @Override //UsingOverrideingToUsetoSrtingMethod,,
    public String toString() {
        //IwroteThisMethodToShowMeAllDetailsIaskedForAndPutIt
        return "Details OF RENT Tractiion::\n " + "anotheCarToRentt=" 
                + anotheCarToRentt + "\n namOFCusto=" + namOFCusto 
                + "\n renttinDate=" + renttinDate;
    }
    public boolean equals(Object alsoCheckPls){
        
        ForRentTractiion anytransaction = (ForRentTractiion)alsoCheckPls;
        
        if(anotheCarToRentt.equals(anytransaction.anotheCarToRentt)&& 
                namOFCusto.equals(anytransaction.namOFCusto)&& 
                renttinDate.equals(anytransaction.renttinDate))
        return true;
       
        else 
            return false;
    }
    @Override //UsingOverrideingToUsecomparToMethod,,
    
   //ImComparingAnyCarWithEachOthersByUsingSomthingThatWillNeverBeWithAnyTwoCars
    public int compareTo(ForRentTractiion oO) {
        //MethodToDecideComparingDependaOnWhatIGaveIt
     return new Integer( anotheCarToRentt.getTheNumbOFpPlateIs())
             .compareTo(oO.anotheCarToRentt.getTheNumbOFpPlateIs());
    }
    
    
}
