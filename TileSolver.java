
/**
 *
 *
 * @author MERYEM OZGE UZUN
 * @version 1.0
 */
public class TileSolver
{
    // instance variables 
    private int lenght;
    private int width;
    private int calcNumOfRows;
    private int calcNumOfCols;
    /**
     * Default Constructor for objects of class TileSolver
     */
    public TileSolver()
    {
        // initialise instance variables
       
    }
    /**
     *  Constructor for objects of class TileSolver
     *  @param aLength      Length of the floor
     *  @param aWidth       Width of the floor
     */
     public TileSolver(int aLength, int aWidth)
    {
        // initialise instance variables
        lenght=aLength;
        width=aWidth;
    }

    /**
     *
     * This function prints black and white tiles pattern.
     * 
     */
    public void solve()
    {
        int i,j,k=1;
        
        calcNumOfRows=lenght/4;
        calcNumOfCols=width/4-1;
        
        for(i=0;i<calcNumOfCols+1;i++){
            for(j=1;j<calcNumOfRows+1;j++){
                if (k%2==1) {
                    System.out.print("B");
                    
                }
                if(k%2==0) {
                    System.out.print("W");
                    
                }
                k++;
            }
            System.out.print("\n");
        }
        
    }
}
