// Jorge Lopez
// Midterm - Odd/Even Game
// April 1, 2013

import javax.swing.JOptionPane;

public class tictactoeGame {
  public static void main( String [] args )
  {
  	// Variables
  	int systemNumber;
  	String userMove;
  	String systemMove = "";
  	String showBoard;
  	String result = "";
  	boolean isWin = false;
  	boolean invalidMove = true;
  	String message = "Error!!! Move cannot be performed, try again.";
  	String endOfGameMessage;
  	// Board Section
  	String upperRight 	= "1";
  	String upperCenter 	= "2";
  	String upperLeft 	= "3";
  	String right 		= "4";
  	String center	 	= "5";
  	String left 		= "6";
  	String bottomRight 	= "7";
  	String bottomCenter = "8";
  	String bottomLeft 	= "9";
  	
  	////////////////////////////////Input ///////////////////////////////////
  	
  	do
   	{
  		showBoard =
  				String.format( " %s | %s | %s " +
  						      "\n---|---|---" +
  	                         "\n %s | %s | %s" +
  						      "\n---|---|---" +
  						     "\n %s | %s | %s ", 
  						     upperRight, upperCenter, upperLeft, 
  						     right, center, left, 
  						     bottomRight, bottomCenter, bottomLeft);
  		// Ask user for move
  		userMove =
  				JOptionPane.showInputDialog( showBoard + "\nLegend:" +
  						"\n(1) Upper Right       = UR" +
  						"\n(2) Upper Center    = UC" +
  						"\n(3) Upper Left         = UL" +
  						"\n(4) Right                   = R" +
  						"\n(5) Center                = C" +
  						"\n(6) Left                     = L" +
  						"\n(7) Bottom Right    = BR" +
  						"\n(8) Bottom Center = BC" +
  						"\n(9) Bottom Left       = BL" +
  						"\nPlease Select Your Move.");
  		
  		// User Moves
  		do
  		{
  			// Conditions for valid move
  			if ( userMove.equalsIgnoreCase( "UR" ) )
  			{
  				if ( (!upperRight.equalsIgnoreCase( "X" )) && (!upperRight.equalsIgnoreCase( "O" )))
  				{
  					upperRight = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "UC" ) )
  			{
  				if ( (!upperCenter.equalsIgnoreCase( "X" )) && (!upperCenter.equalsIgnoreCase( "O" )))
  				{
  					upperCenter = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "UL" ) )
  			{
  				if ( (!upperLeft.equalsIgnoreCase( "X" )) && (!upperLeft.equalsIgnoreCase( "O" )))
  				{
  					upperLeft = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "R" ) )
  			{
  				if ( (!right.equalsIgnoreCase( "X" )) && (!right.equalsIgnoreCase( "O" )))
  				{
  					right = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "C" ) )
  			{
  				if ( (!center.equalsIgnoreCase( "X" )) && (!center.equalsIgnoreCase( "O" )))
  				{
  					center = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "L" ) )
  			{
  				if ( (!left.equalsIgnoreCase( "X" )) && (!left.equalsIgnoreCase( "O" )))
  				{
  					left = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "BR" ) )
  			{
  				if ( (!bottomRight.equalsIgnoreCase( "X" )) && (!bottomRight.equalsIgnoreCase( "O" )))
  				{
  					bottomRight = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "BC" ) )
  			{
  				if ( (!bottomCenter.equalsIgnoreCase( "X" )) && (!bottomCenter.equalsIgnoreCase( "O" )))
  				{
  					bottomCenter = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else if ( userMove.equalsIgnoreCase( "BL" ) )
  			{
  				if ( (!bottomLeft.equalsIgnoreCase( "X" )) && (!bottomLeft.equalsIgnoreCase( "O" )) )
  				{
  					bottomLeft = "X";
  					invalidMove = false;
  				}
  				else
  					JOptionPane.showMessageDialog( null, message );
  			}
  			else
  				JOptionPane.showMessageDialog( null, message );
  		}
  		while ( invalidMove );
  		// Make user move
  		
  		// Check for Winner
  		if ( center.equalsIgnoreCase( "X" ) )
  		{
  			if ( (upperCenter.equalsIgnoreCase( "X" )) && (bottomCenter.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (upperRight.equalsIgnoreCase( "X" )) && (bottomLeft.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (right.equalsIgnoreCase( "X" )) && (left.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (upperLeft.equalsIgnoreCase( "X" )) && (bottomRight.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  		}
  		else if ( upperRight.equalsIgnoreCase( "X" ) )
  		{
  			if ( (upperCenter.equalsIgnoreCase( "X" )) && (upperLeft.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (right.equalsIgnoreCase( "X" )) && (bottomRight.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  		}
  		else if ( bottomLeft.equalsIgnoreCase( "X" ) )
  		{
  			if ( (left.equalsIgnoreCase( "X" )) && (upperLeft.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (bottomCenter.equalsIgnoreCase( "X" )) && (bottomRight.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( center.equalsIgnoreCase( "O" ) )
  			{
  				if ( (upperCenter.equalsIgnoreCase( "O" )) && (bottomCenter.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  				if ( (upperRight.equalsIgnoreCase( "O" )) && (bottomLeft.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  				if ( (right.equalsIgnoreCase( "O" )) && (left.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  				if ( (upperLeft.equalsIgnoreCase( "O" )) && (bottomRight.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  			}
  			else if ( upperRight.equalsIgnoreCase( "O" ) )
  			{
  				if ( (upperCenter.equalsIgnoreCase( "O" )) && (upperLeft.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  				if ( (right.equalsIgnoreCase( "O" )) && (bottomRight.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  			}
  			else if ( bottomLeft.equalsIgnoreCase( "O" ) )
  			{
  				if ( (left.equalsIgnoreCase( "O" )) && (upperLeft.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  				if ( (bottomCenter.equalsIgnoreCase( "O" )) && (bottomRight.equalsIgnoreCase( "O" )) )
  				{
  					isWin = true;
  					result = "Computer";
  				}
  			}
  		}
  		else
  			result = "No one";
  		
  		// Computer Moves
  		do
  		{
  			
  			// Generate move
  			systemNumber = 1 + (int)(Math.random()*9);
  			
  			switch ( systemNumber )
  			{
  			case 1:
  				systemMove = "UR";
  				break;
  			case 2:
  				systemMove = "UC";
  				break;
  			case 3:
  				systemMove = "UL";
  				break;
  			case 4:
  				systemMove = "R";
  				break;
  			case 5:
  				systemMove = "C";
  				break;
  			case 6:
  				systemMove = "L";
  				break;
  			case 7:
  				systemMove = "BR";
  				break;
  			case 8:
  				systemMove = "BC";
  				break;
  			case 9:
  				systemMove = "BL";
  				break;
  			default:
  			}
  			
  			// Conditions for valid move
  			if ( systemMove.equalsIgnoreCase( "UR" ) )
  			{
  				if ( (!upperRight.equalsIgnoreCase( "X" )) && (!upperRight.equalsIgnoreCase( "O" )))
  				{
  					upperRight = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "UC" ) )
  			{
  				if ( (!upperCenter.equalsIgnoreCase( "X" )) && (!upperCenter.equalsIgnoreCase( "O" )))
  				{
  					upperCenter = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "UL" ) )
  			{
  				if ( (!upperLeft.equalsIgnoreCase( "X" )) && (!upperLeft.equalsIgnoreCase( "O" )))
  				{
  					upperLeft = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "R" ) )
  			{
  				if ( (!right.equalsIgnoreCase( "X" )) && (!right.equalsIgnoreCase( "O" )))
  				{
  					right = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "C" ) )
  			{
  				if ( (!center.equalsIgnoreCase( "X" )) && (!center.equalsIgnoreCase( "O" )))
  				{
  					center = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "L" ) )
  			{
  				if ( (!left.equalsIgnoreCase( "X" )) && (!left.equalsIgnoreCase( "O" )))
  				{
  					left = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "BR" ) )
  			{
  				if ( (!bottomRight.equalsIgnoreCase( "X" )) && (!bottomRight.equalsIgnoreCase( "O" )))
  				{
  					bottomRight = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "BC" ) )
  			{
  				if ( (!bottomCenter.equalsIgnoreCase( "X" )) && (!bottomCenter.equalsIgnoreCase( "O" )))
  				{
  					bottomCenter = "O";
  					invalidMove = false;
  				}
  			}
  			else if ( systemMove.equalsIgnoreCase( "BL" ) )
  			{
  				if ( (!bottomLeft.equalsIgnoreCase( "X" )) && (!bottomLeft.equalsIgnoreCase( "O" )) )
  				{
  					bottomLeft = "O";
  					invalidMove = false;
  				}
  			}
  		}
  		while ( invalidMove );
  		// Make move
  					
  		// Check Winner
  		if ( center.equalsIgnoreCase( "X" ) )
  		{
  			if ( (upperCenter.equalsIgnoreCase( "X" )) && (bottomCenter.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (upperRight.equalsIgnoreCase( "X" )) && (bottomLeft.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (right.equalsIgnoreCase( "X" )) && (left.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (upperLeft.equalsIgnoreCase( "X" )) && (bottomRight.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  		}
  		else if ( upperRight.equalsIgnoreCase( "X" ) )
  		{
  			if ( (upperCenter.equalsIgnoreCase( "X" )) && (upperLeft.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (right.equalsIgnoreCase( "X" )) && (bottomRight.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  		}
  		else if ( bottomLeft.equalsIgnoreCase( "X" ) )
  		{
  			if ( (left.equalsIgnoreCase( "X" )) && (upperLeft.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  			if ( (bottomCenter.equalsIgnoreCase( "X" )) && (bottomRight.equalsIgnoreCase( "X" )) )
  			{
  				isWin = true;
  				result = "Player";
  			}
  		}
  		if ( center.equalsIgnoreCase( "O" ) )
  		{
  			if ( (upperCenter.equalsIgnoreCase( "O" )) && (bottomCenter.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  			if ( (upperRight.equalsIgnoreCase( "O" )) && (bottomLeft.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  			if ( (right.equalsIgnoreCase( "O" )) && (left.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  			if ( (upperLeft.equalsIgnoreCase( "O" )) && (bottomRight.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  		}
  		else if ( upperRight.equalsIgnoreCase( "O" ) )
  		{
  			if ( (upperCenter.equalsIgnoreCase( "O" )) && (upperLeft.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  			if ( (right.equalsIgnoreCase( "O" )) && (bottomRight.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  		}
  		else if ( bottomLeft.equalsIgnoreCase( "O" ) )
  		{
  			if ( (left.equalsIgnoreCase( "O" )) && (upperLeft.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  			if ( (bottomCenter.equalsIgnoreCase( "O" )) && (bottomRight.equalsIgnoreCase( "O" )) )
  			{
  				isWin = true;
  				result = "Computer";
  			}
  		}
  		else
  			result = "No one";
  		 	
   	}
   	while ( !isWin );
  	// End of game results
  	endOfGameMessage = String.format( showBoard + "\n%s is the winner!", result);
  	JOptionPane.showMessageDialog( null, endOfGameMessage );
  	
   	 
  }
}
