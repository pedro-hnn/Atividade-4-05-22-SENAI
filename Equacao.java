public class Equacao  {
    private Double a;
    private Double b;
    private Double c;

    private Double x1;

    private Double x2;

    private Double delta;

    public Equacao(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        this.delta = b*b * 4 * a * c;
        this.x1 = (((-1)*b) + Math.sqrt(this.delta))/(2*a);
        this.x2 = (((-1)*b) - Math.sqrt (this.delta))/(2*a);
    }

    public Double getX1() {
        return x1;
    }

    public Double getX2() {
        return x2;
    }

    public Double getDelta() {
        return delta;
    }

}
