package exercise1;

public class PieceWorker extends Employee{
	 
    private int pieces;
    private double wage;

public PieceWorker( String first, String last, String ssn,
     double wages, int piece )
   {
     super( first, last, ssn );
      setWages( wages );
      setPieces( piece );
   }

public void setPieces(int piece)
{
    pieces=(piece<0)?0:piece;
}
public int getPieces()
{
    return pieces;
}
      public void setWages(double wages)
    {
        wage=(wages>0.0)?wages:0.0;
    }

public double getWages()
    {
        return wage;
    }

 
    public double earnings()
    {
        return getWages()*getPieces();
    }

    @Override
    public Object earnings(int i) {
        return null;
    }


    public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %,d",
         "Piece worker",super.toString(), "wage per piece", getWages(),
         "pieces produced", getPieces() );
   }
}

