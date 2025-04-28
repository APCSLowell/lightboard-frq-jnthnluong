public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    /* to be implemented in part (a) */
    lights = new boolean[numRows][numCols];
    for(int i = 0; i < lights.length; i ++){
      for(int g = 0; g < lights[i].length; g++){
        if((int)(Math.random()*100) < 40)
          lights[i][g] = true;
      }
    }

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    /* to be implemented in part (b) */
    int lightsCol = 0; 
    for(int i = 0; i < lights.length; i ++){
      if(lights[i][col]) lights++;
    }
    if(lights[row][col] && lightsCol %2 == 0){
      return false;
    }else if(!lights[row][col] && lightsCol % 3 == 0){
      return true;
    }
    return lights[row][col];
   
 
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
