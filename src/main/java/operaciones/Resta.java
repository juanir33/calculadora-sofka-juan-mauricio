package operaciones;

public class Resta {
    private double minuendo;
    private double sustraendo;

    public Resta(double minuendo, double sustraendo) {
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
    }

    public double getMinuendo() {
        return minuendo;
    }

    public double getSustraendo() {
        return sustraendo;
    }

    public void setMinuendo(double minuendo) {
        this.minuendo = minuendo;
    }

    public void setSustraendo(double sustraendo) {
        this.sustraendo = sustraendo;
    }

    public double resta() {
        return minuendo - sustraendo;
    }
}
