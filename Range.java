import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  /*
*@precondition: start <= end
*@param start : the starting value (inclusive)
*@param end : the ending value which is also inclusive.*/
  public Range(int start,  int end){
  if (start>end){
    {throw new IllegalArgumentException("start is greater than end");
  }
  this.start = start;
  this.end = end;
  current = start;
  }
}

  public void reset(){
  current = start; }
  public int length(){
  return Math.abs(end-start+1);
 }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1.
  //e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){    }

}


    IntegerSequence r = new Range(10,15);
    while(r.hasNext()){
      System.out.print(r.next())
      if( r.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
