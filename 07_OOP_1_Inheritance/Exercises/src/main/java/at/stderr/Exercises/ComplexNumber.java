package at.stderr.Exercises;

public class ComplexNumber {
    private double real, imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber o) {
        this.real += o.getReal();
        this.imaginary += o.getImaginary();
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(ComplexNumber o) {
        this.real -= o.getReal();
        this.imaginary -= o.getImaginary();
    }

    public void subtract(double real,double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
}
