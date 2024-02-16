
public class DateOfRentt {

    private int exactcDaOfRe;
    private int excaMth;
    private int excYerr;
    
       public DateOfRentt() {
       this(0,0,0);
       
    }
    public DateOfRentt(int exactcDaOfRe, int excaMth, int excYerr) {
        this.exactcDaOfRe = exactcDaOfRe;
        this.excaMth = excaMth;
        this.excYerr = excYerr;
    }

    public int getExactcDaOfRe() {
        return exactcDaOfRe;
    }

    public int getExcaMth() {
        return excaMth;
    }

    public int getExcYerr() {
        return excYerr;
    }

    public void setExactcDaOfRe(int exactcDaOfRe) {
        this.exactcDaOfRe = exactcDaOfRe;
    }

    public void setExcaMth(int excaMth) {
        this.excaMth = excaMth;
    }

    public void setExcYerr(int excYerr) {
        this.excYerr = excYerr;
    }

    public String toString() {
        return  exactcDaOfRe + "\\" + excaMth + "\\" + excYerr;
    } 
    public boolean equals(Object checkDatePls){
        DateOfRentt anyElseDate=(DateOfRentt)checkDatePls;
        return exactcDaOfRe==anyElseDate.exactcDaOfRe
                &&excaMth==anyElseDate.excaMth&&excYerr==anyElseDate.excYerr;
    }
}
