/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.math.BigDecimal;

/**
 *
 * @author ChipB
 */
public class ComplexOperations {
    
    /** Performs the quadratic equation and returns both solutions concatenated into a String of "solution1, solution2".  If a solution has an imaginary portion, this function WILL RETURN IT.
     * @param xsquare the constant (the multiplier) on the x^2 term.
     * @param x the constant (the multiplier) on the x term
     * @param num the constant with no x-term.
     * @return solution the two solutions of the quadratic equation.  Returns N/A if solution cannot be found.
     */
    public String solveQuadraticEquation(double xsquare, double x, double num){
        String solution = "N/A";
        double solutionstore;
        double imaginary;
        try{
            solutionstore = (-x + Math.sqrt((x*x)-(4*xsquare*num)))/(2*xsquare);
            if(solutionstore != solutionstore) throw new IllegalArgumentException("NaN");
            solution = Double.toString(solutionstore);
        }catch(IllegalArgumentException ex){
            imaginary = Math.sqrt(Math.abs((x*x)-(4*xsquare*num)))/(2*xsquare);
            solutionstore = -x/(2*xsquare);
            solution = Double.toString(solutionstore)+" + "+Double.toString(imaginary)+"i";
        }
        solution += ", ";
        try{
            solutionstore = (-x - Math.sqrt((x*x)-(4*xsquare*num)))/(2*xsquare);
            if(solutionstore != solutionstore) throw new IllegalArgumentException("NaN");
            solution += Double.toString(solutionstore);
        }catch(IllegalArgumentException ex){
            imaginary = -Math.sqrt(Math.abs((x*x)-(4*xsquare*num)))/(2*xsquare);
            solutionstore = -x/(2*xsquare);
            solution += Double.toString(solutionstore)+" + "+Double.toString(imaginary)+"i";
        }
        return solution;
    }
    
    /**
     * Determines whether a triangle is right based on the sides of the triangle.  It is recommended to avoid fractional inputs, as there may be rounding errors.
     * @param s1 side 1
     * @param s2 side 2
     * @param s3 side 3
     * @return Whether the triangle is a right triangle.
     */
    public boolean rightTriangleFinder(double s1, double s2, double s3){
        //Variables as in a^2+b^2==c^2, etc.
        BigDecimal a = new BigDecimal(Double.toString(s1));
        BigDecimal b = new BigDecimal(Double.toString(s2));
        BigDecimal c = new BigDecimal(Double.toString(s3));
        return (a.multiply(a).add(b.multiply(b))==c.multiply(c))||(b.multiply(b).add(c.multiply(c))==a.multiply(a))||(c.multiply(c).add(a.multiply(a))==b.multiply(b));
    }
    
    /**
     * Calculates the volume of prisms (incl. cubes) and cylinders.
     * @param numsides the number of sides - for cylinders, pass zero.
     * @param sidedim the uniform length of the side - for cylinders, pass the radius
     * @param height the height.
     * @return String representing the volume of the regular n-gonal prism.
     */
    public String prismVolumeCalculator(double numsides, double sidedim, double height){
        String output;
        if(numsides == 0){
            output = Double.toString(Math.pow(sidedim, 2)*Math.PI*height);
        }else{
            output = Double.toString(.25*numsides*Math.pow(sidedim, 2)*(Math.cos(degreestoRadians(180.0/numsides))/Math.sin(degreestoRadians(180.0/numsides)))*height);
        }
        return output;
    }
    
    /**
     * Calculates the volume of prisms and cylinders.
     * @param numsides the number of sides - for circles, pass zero.
     * @param sidedim the uniform length of the side - for circles, pass the radius
     * @return String representing the area of the regular n-gon.
     */
    public String areaCalculator(double numsides, double sidedim){
        String output;
        if(numsides == 0){
            output = Double.toString(Math.pow(sidedim, 2)*Math.PI);
        }else{
            output = Double.toString(.25*numsides*Math.pow(sidedim, 2)*(Math.cos(degreestoRadians(180.0/numsides))/Math.sin(degreestoRadians(180.0/numsides))));
        }
        return output;
    }
    
    /**
     * Calculates the volume of a sphere given the radius.
     * @param radius the radius of the sphere
     * @return a String representation of the Double value of 
     */
    public String sphereVolumeCalculator(double radius){
        return Double.toString((4.0/3.0)*Math.PI*Math.pow(radius, 3));
    }
    
    /**
     * converts degrees to radians
     * @param degrees degrees
     * @return radian value
     */
    private double degreestoRadians(double degrees){
        return (degrees/180.0)*Math.PI;
    }
    /**
     * converts radians to degrees
     * @param radians radians
     * @return degree value
     */
    private double radianstoDegrees(double radians){
        return (radians/Math.PI)*180.0;
    }
    /**
     * converts degrees to radians
     * @param degrees the value in degrees to convert to radians
     * @return a String representing the radian value
     */
    public String pubDegreestoRadians(double degrees){
        return Double.toString(degreestoRadians(degrees));
    }
    /**
     * converts radians to degrees
     * @param radians the value in radians to convert to degrees.
     * @return a String representing the degree value.
     */
    public String pubRadianstoDegrees(double radians){
        return Double.toString(radianstoDegrees(radians));
    }
    /**
     * Handles the trigonometric functions sine, cosine, tangent, secant, cosecant, and cotangent.
     * @param func the trigonometric function: sin, cos, tan, sec, csc, cot.
     * @param angle the numerical value
     * @param radians whether the input is in degrees or radians.  If the input is radians, this should be true.
     * @return the value in RADIANS.
     */
    public String trigFunctions(String func, double angle, boolean radians){
        String output = null;
        if(radians){
            switch(func){
                case("sin"):output = Double.toString(Math.sin(angle));
                    break;
                case("cos"):output = Double.toString(Math.cos(angle));
                    break;
                case("tan"):output = Double.toString(Math.tan(angle));
                    break;
                case("sec"):output = Double.toString(Math.pow(Math.cos(angle), -1));
                    break;
                case("csc"):output = Double.toString(Math.pow(Math.sin(angle), -1));
                    break;
                case("cot"):output = Double.toString(Math.pow(Math.tan(angle), -1));
                    break;
            }
        }else{
            switch(func){
                case("sin"):output = Double.toString(Math.sin(degreestoRadians(angle)));
                    break;
                case("cos"):output = Double.toString(Math.cos(degreestoRadians(angle)));
                    break;
                case("tan"):output = Double.toString(Math.tan(degreestoRadians(angle)));
                    break;
                case("sec"):output = Double.toString(Math.pow(Math.cos(degreestoRadians(angle)), -1));
                    break;
                case("csc"):output = Double.toString(Math.pow(Math.sin(degreestoRadians(angle)), -1));
                    break;
                case("cot"):output = Double.toString(Math.pow(Math.tan(degreestoRadians(angle)), -1));
                    break;
            }
        }
        return output;
    }
    
    /**
     * Inverse trig function applier
     * @param func function argument: asin, acos, atan, asec, acsc, acot
     * @param input value to inverse trig function
     * @param radians whether the output is in radians or not.  True if it is.
     * @return 
     */
    public String inverseTrigFunctions(String func, double input, boolean radians){
        String output = null;
        if(radians){
            switch(func){
                case("asin"):output = Double.toString(Math.asin(input));
                    break;
                case("acos"):output = Double.toString(Math.acos(input));
                    break;
                case("atan"):output = Double.toString(Math.atan(input));
                    break;
                case("asec"):output = Double.toString(Math.acos(1.0/input));
                    break;
                case("acsc"):output = Double.toString(Math.asin(1.0/input));
                    break;
                case("acot"):output = Double.toString(Math.atan(1.0/input));
                    break;
            }
        }else{
            switch(func){
                case("asin"):output = Double.toString(radianstoDegrees(Math.asin(input)));
                    break;
                case("acos"):output = Double.toString(radianstoDegrees(Math.acos(input)));
                    break;
                case("atan"):output = Double.toString(radianstoDegrees(Math.atan(input)));
                    break;
                case("asec"):output = Double.toString(radianstoDegrees(Math.acos(1.0/input)));
                    break;
                case("acsc"):output = Double.toString(radianstoDegrees(Math.asin(1.0/input)));
                    break;
                case("acot"):output = Double.toString(radianstoDegrees(Math.atan(1.0/input)));
                    break;
            }
        }
        return output;
    }
}
