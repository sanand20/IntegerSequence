import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
  for (int i = 0; i<other.length-1; i++){
    data[i]=other[i];
  }
  currentIndex=0;}
  public void reset(){
  currentIndex = 0; }
  public boolean hasNext(){
    if (currentIndex<data.length){
      return true;
    }
    return false;
  }
  public int next(){
    if (hasNext()==false){
      throw new  NoSuchElementException("error");
    }
    currentIndex++;
    return (currentIndex - 1);
 }
}
