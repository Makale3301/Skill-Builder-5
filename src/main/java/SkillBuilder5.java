/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double[] mk = new double[data.length];
        double ot7 = 0;
        for (int x = 0; x < data.length; x+=1){
            ot7 += data[x];
            mk[x] = ot7/(x+1);
        }
        return mk;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */

    public static int  indexOf(int searchValue, int[] anArray)
    {
        for(int ye = 0; ye < anArray.length; ye+=1){
            if (anArray[ye] == searchValue){
                return ye;
            }

        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String searchValue, String[] anArray)
    {
        for(int s = 0; s < anArray.length; s +=1){
            if (anArray[s] == searchValue){
                return s;
            }

        }
        return -1;
    }





    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        int count = 0;
        for (int k = 0; k < anArray.length; k++){
            if (anArray[k] == s){
                count +=1;
            }
        }
        String [] m = new String[anArray.length-count];
        int l = 0;
        for (int k = 0; k < anArray.length; k++){
            if (anArray[k] != s){
                m[l] = anArray[k];
                l+=1;
            }
        }
        return m;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int[] copy = new int[anArray.length];
        for(int i = 0; i < anArray.length; i++) copy[i] = anArray[i];
        int index = 0;
        for (int i = copy.length - 1; i > -1; i--){
            anArray[index] = copy[i];
            index++;
        }
    }
}
