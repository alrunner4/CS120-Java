class Driver {
    
    public static void main(String[] args) {

        int iterations = 1000000;
        if (args.length == 1)
            iterations = Integer.parseInt(args[0]);
            // [1] parseInt

        double circle_approx = PiCalc.circle(iterations);
        double leibniz_approx = PiCalc.leibniz(iterations);

        // [2] printf
        System.out.printf("Iterations: %d\n", iterations);
        System.out.printf("Circle:     %14.12f\n", circle_approx);
        System.out.printf("Leibniz:    %14.12f\n", leibniz_approx);

    }

}

// References:
// [1] https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String)
// [2] https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#printf-java.lang.String-java.lang.Object...-
