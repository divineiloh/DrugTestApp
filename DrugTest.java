	//Author: Divine Iloh
	//BINS 5312
	//Date: 02/19/2022
package DrugTest;

public class DrugTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declaring variables
		 int testedEmployee = 0;
		 int weeks = 1;
		 int lineNum = 1;		 
		
		
		//first while loop to control number of weeks
		 while (weeks < 53)
			{
				System.out.print("Weeks "); //print week number
				lineNum = 1; 				//set lineNum to 1 before the nested loop begins
				
				//nested while loop to put 4 weeks in one line
				while ( lineNum < 5) 
				{
					System.out.print(weeks  + ", "); //print week number
					weeks++;  
					lineNum++;
				}
				
				lineNum = 1; //set lineNum to 1 before the nested loop begins
				System.out.print("Employee Numbers  "); //print employee numbers on the same line
				
				//nested loop that controls the random selection of employees.
				while ( lineNum < 5)
				{
					testedEmployee = 1 + (int) (Math.random() * 30);
					System.out.print(testedEmployee + ", ");
			
					lineNum++;   //increment the lineNum
				}
				  
				System.out.print( " will be tested");   //display output
				System.out.println("\n");
			}
		 
		}
	}


