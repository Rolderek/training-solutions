package exections;

public class Polinom {

    private double[] eh;

    public Polinom(double[] eh) {
        if (eh == null) {
            throw new NullPointerException("Az együtthatók tömbje nem lehet üres");
        }
        this.eh = eh;
    }

    public Polinom(String[] ehStr) {
        if (eh == null) {
            throw new NullPointerException("Az együtthatók tömbje nem lehet üres");
        }
        this.eh = convertEhStrs(ehStr);
    }

    private double[] convertEhStrs(String[] ehStr) {
        double[] eh = new double[ehStr.length];
        for (int i = 0; i < ehStr.length; i++) {
            eh[i] = Double.parseDouble(ehStr[i]);
        }
        return eh;
    }

    public double evaluate(double x) {
        int n = eh.length - 1;
        double sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += eh[i] * Math.pow(x,(double)n - i);
        }
        return sum;
    }

    public double[] getEh() {
        return eh;
    }
}

