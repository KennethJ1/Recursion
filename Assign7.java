/**
 * The `Assign7` class demonstrates the printing of multiple triangles using recursion.
 * The triangles are printed to standard output, each of a given size. The number of triangles
 * printed is specified by the `size` parameter. The triangles are made out of asterisks, and
 * each line of a triangle ends with a newline character ("\n"). There is a single space
 * between each asterisk, and there are no spaces at the end of any line.
 */
public class Assign7 {

    /**
     * The main method serves as the entry point of the program. It demonstrates the
     * printing of triangles by calling the `printTriangles` method with a specified size (3).
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        printTriangles(3);
    }

    /**
     * This method prints multiple triangles using recursion. It takes a `size` parameter,
     * representing the number of lines in each triangle and the number of triangles to be printed.
     * The method calls `printOneTriangle` to print a single triangle, followed by a newline, and
     * then recursively calls itself to print the remaining triangles.
     *
     * @param size The number of lines in each triangle and the number of triangles to be printed.
     */
    public static void printTriangles(int size) {
        int i = size;
        if (i > 0) {
            printOneTriangle(size, size);
            System.out.println();
            printTriangles(size);

        }
        i--;
    }

    /**
     * This method prints a single triangle with a specified size. It calls `printSpaces` to print
     * the leading spaces, then calls `printChar` to print the asterisks, and finally recursively
     * calls itself with a reduced size to print the next line of the triangle.
     *
     * @param i    The current size of the triangle to be printed.
     * @param size The original size of the triangle.
     */
    public static void printOneTriangle(int i, int size) {
        if (i == 0) {
            return;
        }
        printSpaces(i - 1);
        printChar(size - i + 1);
        System.out.println("");

        printOneTriangle(i - 1, size);
    }

    /**
     * This method prints a specified number of spaces. It uses recursion to decrement the count
     * of spaces until it reaches zero.
     *
     * @param spaces The number of spaces to be printed.
     */
    public static void printSpaces(int spaces) {
        if (spaces == 0) {
            return;
        }
        System.out.print(" ");

        printSpaces(spaces - 1);
    }

    /**
     * This method prints a specified number of asterisks with a space in between each. It uses
     * recursion to decrement the count of asterisks until it reaches zero.
     *
     * @param numOfChar The number of asterisks to be printed.
     */
    public static void printChar(int numOfChar) {
        if (numOfChar == 0) {
            return;
        }
        System.out.print("* ");

        printChar(numOfChar - 1);
    }
}