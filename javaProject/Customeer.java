
public class Customeer {

    private int civilUnIddis;
    private int cu_AggeeIs;
    private String cu_FnamIs;
    private String cu_AddrLIs;
    private String cu_NumphoIs;

    public Customeer(){
        this(0,0,null,null,null);
    }
    
    public Customeer(int civilUnIddis, int cu_AggeeIs, String cu_FnamIs,
            String cu_AddrLIs, String cu_NumphoIs) {
        this.civilUnIddis = civilUnIddis;
        this.cu_AggeeIs = cu_AggeeIs;
        this.cu_FnamIs = cu_FnamIs;
        this.cu_AddrLIs = cu_AddrLIs;
        this.cu_NumphoIs = cu_NumphoIs;
    }

    public int getCivilUnIddis() {
        return civilUnIddis;
    }

    public int getCu_AggeeIs() {
        return cu_AggeeIs;
    }

    public String getCu_FnamIs() {
        return cu_FnamIs;
    }
    public String getCu_AddrLIs() {
        return cu_AddrLIs;
    }
    
    public String getCu_NumphoIs() {
        return cu_NumphoIs;
    }
    
    public void setCivilUnIddis(int civilUnIddtocheck) {
        civilUnIddis = civilUnIddtocheck;
    }

    public void setCu_AggeeIs(int cu_Aggeetobuyy) {
       cu_AggeeIs = cu_Aggeetobuyy;
    }

    public void setCu_FnamIs(String cu_Fnamtosaavee) {
        cu_FnamIs = cu_Fnamtosaavee;
    }
    
    public void setCu_AddrLIs(String cu_Addtoadd) {
        cu_AddrLIs =cu_Addtoadd;
    }
    
    public void setCu_NumphoIs(String cu_ntocall) {
        cu_NumphoIs = cu_ntocall;
    }

    public String toString() { 
        return "CustomeerID is\\ "+ civilUnIddis
                + "What is his agee?his aggee is\\ " + cu_AggeeIs +
                "THisis hisfullNAME\\" + cu_FnamIs 
                + "Hisaddress tto saavve" + cu_AddrLIs +
                "Hisphone to calll" + cu_NumphoIs ;
    }
    public boolean equals(Object plsccheckhere){
        Customeer anycustomeer= (Customeer)plsccheckhere;
        return civilUnIddis== anycustomeer.civilUnIddis;
    }
    
    
}
