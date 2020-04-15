package Suunnittelumallit.Tehtävä_10_ChainOfResponsibility;

public abstract class RaiseSalary {
    private RaiseSalary r;
    public void setSuccessor(RaiseSalary r) { this.r = r; }
    public void raiseRequest(Worker w) { if (r != null) r.raiseRequest(w); }
}
