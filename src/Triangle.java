public class Triangle {


    public static String checkTriangle(Integer side1, Integer side2, Integer side3) throws Exception {

        int valid = 0;
        if (side1 < 1 || side1 > 100 || side2 < 1 || side2 > 100 || side3 < 1 || side3 > 100)
            throw new Exception("side out of range");

        if ((side1 + side2) > side3) {
            if ((side2 + side3) > side1) {
                if ((side1 + side3) > side2) {
                    /*
                     * If side1 + side2 > side3 and
                     *    side2 + side3 > side1 and
                     *    side1 + side3 > side2 then
                     * the triangle is valid.
                     */
                    valid = 1;
                }
            }
        }
        if (valid == 1) {
            if (side1.equals(side2) && side2.equals(side3)) {
                /* If all sides are equal */
                return ("equilateral triangle");
            } else if (side1.equals(side2) || side1.equals(side3) || side2.equals(side3)) {
                /* If any two sides are equal */
                return ("isosceles triangle");
            } else {
                /* If none sides are equal */
                return ("scalene triangle");
            }
        } else {
            return "not triangle";
        }


    }

    public static void main(String[] args) throws Exception {
        System.out.println(checkTriangle(50 , 50, 1));
        System.out.println(checkTriangle(50 , 50, 50));
        System.out.println(checkTriangle(51 , 55, 2));
    }

}
