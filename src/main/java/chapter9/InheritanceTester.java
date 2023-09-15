package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {
        Mother mom = new Mother();
        mom.setName("Rosa");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
    public static void testSquare(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print(" square");

    }

        public static void testSquareOverride() {
            Rectangle rectangle = new Rectangle();
            rectangle.setLength(5.0);
            rectangle.setWidth(4.3);
            System.out.println(rectangle.calculatePerimeter());

            Square square = new Square();
            square.setLength(5.0);
            square.setWidth(3.0);
            System.out.println(square.calculatePerimeter());

        }


}
