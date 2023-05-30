// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1;public class Triangle {
            private double side1;
            private double side2;
            private double side3;

            public Triangle(double side1, double side2, double side3) {
                if (isValidTriangle(side1, side2, side3)) {
                    this.side1 = side1;
                    this.side2 = side2;
                    this.side3 = side3;
                } else {
                    throw new IllegalArgumentException("Invalid triangle sides");
                }
            }

            public double getSide1() {
                return side1;
            }

            public double getSide2() {
                return side2;
            }

            public double getSide3() {
                return side3;
            }

            public double getPerimeter() {
                return side1 + side2 + side3;
            }

            public double getArea() {
                double semiPerimeter = getPerimeter() / 2;
                return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
            }

            public boolean isEqual(Triangle other) {
                return this.side1 == other.side1 && this.side2 == other.side2 && this.side3 == other.side3;
            }

            private boolean isValidTriangle(double side1, double side2, double side3) {
                return side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
            }

            @Override
            public String toString() {
                return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Triangle other = (Triangle) obj;
                return this.side1 == other.side1 && this.side2 == other.side2 && this.side3 == other.side3;
            }

            public static void main(String[] args) {
                Triangle triangle1 = new Triangle(3, 4, 5);
                Triangle triangle2 = new Triangle(5, 12, 13);
                Triangle triangle3 = new Triangle(5, 5, 5);

                System.out.println("Triangle 1: " + triangle1);
                System.out.println("Perimeter: " + triangle1.getPerimeter());
                System.out.println("Area: " + triangle1.getArea());

                System.out.println("Triangle 2: " + triangle2);
                System.out.println("Perimeter: " + triangle2.getPerimeter());
                System.out.println("Area: " + triangle2.getArea());

                System.out.println("Triangle 3: " + triangle3);
                System.out.println("Perimeter: " + triangle3.getPerimeter());
                System.out.println("Area: " + triangle3.getArea());

                boolean isEqual = triangle1.isEqual(triangle2);
                System.out.println("Is Equal: " + isEqual);
            }
        }
        i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}