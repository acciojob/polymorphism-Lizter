package com.driver;

public class Main {
    Product p= new Product();
    p.product(20,30);
    p.product(20,30,40);
    p.product(10.5,9.9);

}
    class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

