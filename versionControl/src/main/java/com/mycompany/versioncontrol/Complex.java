package com.mycompany.versioncontrol;

public class Complex {
    private double real;
    private double imaginary;
    
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(double real){
        this.real = real;
    }
    
    public double getRealPart(){
        return real;
    }
    
    public double getImaginaryPart(){
        return imaginary;
    }
    
    public Complex add(Complex other){
        double thisReal = this.getRealPart();               //a
        double thisImaginary = this.getImaginaryPart();     //bi
        
        double otherReal = other.getRealPart();             //c
        double otherImaginary = other.getImaginaryPart();   //di
        
        return (thisReal + otherReal) + (thisImaginary + otherImaginary);
        
    }
}