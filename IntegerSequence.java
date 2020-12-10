public interface IntegerSequence{
  boolean hasNext() ;//does the sequence have more elements?
  int next();         //return the current value in the sequence and advances to the next element
  int length();     //returns the total length of the sequence
  void reset();     //start over from the start of the sequence
  public static void main(String[] args){
    IntegerSequence r = new Range(10,20);
        IntegerSequence as = new ArraySequence(r);

        System.out.println("ArraySequence(seq):");
        while(as.hasNext()){
          System.out.print(as.next()+", ");
        }
        System.out.println();

}
}
