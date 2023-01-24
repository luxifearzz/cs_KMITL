class Lab14 {

    class MyFixedPoint {
        public long data;

        MyFixedPoint(double d) {
            data = (int) (d * 10000);
        }
        
        float getReal() {
            return data/10000.0f;
        }
        
        void adds(MyFixedPoint b) {
            // your code here
            data = (long) (((this.data/10000.0f) + (b.data/10000.0f)) * 10000);
        }
        
        void subtracts(MyFixedPoint b) {
            // your code here
            data = (long) (((this.data/10000.0f) - (b.data/10000.0f)) * 10000);
        }
        void multiplies(MyFixedPoint b) {
            // your code here
            data = (long) (((this.data/10000.0f) * (b.data/10000.0f)) * 10000);
        }
        void divides(MyFixedPoint b) {
            // your code here
            data = (long) (((this.data/10000.0f) / (b.data/10000.0f)) * 10000);
        }
    }

    class MyFloatingPoint {
        public float data;

        MyFloatingPoint(double d) {
            data = (float) d;
        }

        float getReal() {
            return data;
        }
        
        void adds(MyFloatingPoint b) {
            data = data + b.data;
        }
        
        void subtracts(MyFloatingPoint b) {
            data = data - b.data;
        }
        
        void multiplies(MyFloatingPoint b) {
            data = data * b.data;
        }
        
        void divides(MyFloatingPoint b) {
           data = data / b.data;
        }

    }

    static Lab14 lab14 = new Lab14();
    static double num1 = 1234.34567;
    static double num2 = 1555.55555;

    public static void main(String[] args) {
        long t, t1 = 0, t2 = 0;

        for (int i =0; i< 250_000_000; i++){
            t = System.currentTimeMillis();
            fixedCase();
            t1 += System.currentTimeMillis()-t;

            t = System.currentTimeMillis();
            floatCase();
            t2 += System.currentTimeMillis()-t;
        }

        System.out.println("Benchmarking\n\tFixed Point took " + t1 + " ms\n\tFloat Point took " + t2 + " ms");
    }

    static void fixedCase() {
        Lab14.MyFixedPoint n1 = lab14.new MyFixedPoint(num1);
        Lab14.MyFixedPoint n2 = lab14.new MyFixedPoint(num2);
        n1.adds(n2);
        // System.out.println(n1.getReal());
        n1.subtracts(n2);
        // System.out.println(n1.getReal());
        n1.multiplies(n2);
        // System.out.println(n1.getReal());
        n1.divides(n2);
        // System.out.println(n1.getReal());
    }

    static void floatCase() {
        Lab14.MyFloatingPoint m1 = lab14.new MyFloatingPoint(num1);
        Lab14.MyFloatingPoint m2 = lab14.new MyFloatingPoint(num2);
        m1.adds(m2);
        // System.out.println(m1.getReal());
        m1.subtracts(m2);
        // System.out.println(m1.getReal());
        m1.multiplies(m2);
        // System.out.println(m1.getReal());
        m1.divides(m2);
        // System.out.println(m1.getReal());
    }
}