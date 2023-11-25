/*
 * AUCSC 235 Lab Interface required.
 * This file is intended for teaching purposes only.
 * by Rosanna Heise
 * November 17, 2023
 *
 * Main goals:  use recursion and interfaces.
 *   
 * Your file must implement this interface.  Thus if you are testing 
 * the methods in your main you will need to access them using dot 
 * notation on instances of your class.  
 * For example, if your file is called "Assign6.java" then you would
 *   1)  create an instance:  Assign6 recMethods = new Assign6();
 *   2)  invoke the method:  recMethods.printTriangles(3);
 *
 * Interfaces do not work with static code, hence why the methods are not
 * static.
 */
package recursionlab;


public interface RecLabInterface {
    
    

    /**
     * This method prints multiple triangles, to standard output, of the 
     * given size, out of asterisks with the number of triangles printed
     * also given by size.   This prints size triangles of the given size.
     * E.g. if size is 3, the method will print:
     *        *
     *       * *
     *      * * *
     * 
     *        *
     *       * *
     *      * * *
     * 
     *        *
     *       * *
     *      * * *
     * 
     * @param size -- the number of lines in each triangle AND the number
     *                of triangles (should be a positive integer)
     * 
     * NOTE:  Every printed line ends with "\r\n" and there is a single 
     * space between each star with no spaces at the end of any line. 
     * Java's println automatically inserts "\r\n" for line endings.  Be
     * careful if you make explicit line breaks - you must add both 
     * characters.  A single blank line (with "\r\n") is between each 
     * set of triangles and there is no leading or ending blank line.
     * 
     * NOTE:  This method is implemented recursively, with no loops.
     */
    public void printTriangles(int size);
     

    /**
     * This method will actually change the contents of anArray, so that all
     * odd integers precede all even integers in the array.  Note that the
     * order of the integers may not be maintained.  All swapping of elements
     * is done "in place" so that minimal extra space is used (in O(1)) and 
     * with only one pass through the array (in O(n)).
     *
     * @param anArray -- the array that will change so that all odds come
     *                   before all evens.
     * 
     * NOTE: this method is implemented recursively, with no loops.  The
     * algorithm follows the idea of quicksort's partitioning.
     */
    public void oddBeforeEven(int[] anArray);
}
