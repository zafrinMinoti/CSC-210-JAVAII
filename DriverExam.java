/**
 * @author Zafrin Minoti (zafrin.minoti@gmail.com)
 * @date February 28, 2017
 * @title DriverExam Classfile
 * Book - Starting Out with Java, 6e
 * Chapter 7 - Problem # 6
 * CSC 210 - Computer Programming 2
 * Prof. Persaud
 */

public class DriverExam
{
	//Fields
	private char[] _correctAns = {'B','D','A','A','C','A','B',
		'A','C','D','B','C','D','A','D','C','C','B','D','A'};
	private char[] _studentAns = new char[_correctAns.length];
	private boolean[] _eval = new boolean[_correctAns.length];

	// Constructor
	public DriverExam(char[] studentAns)
	{
		_correctAns = _correctAns;
		_studentAns = studentAns;
		_eval = evaluateStudent();
	}

	/**
		A private mutator method evaluating a student's answears.
		It sets values to the private _eval field.
		@return _eval Boolean array holding evaluated values of 
		corect and wrong answears 
	*/
	private boolean[] evaluateStudent() {
		for (int i=0; i<_correctAns.length; i++) {
			if (_studentAns[i] == _correctAns[i])
				_eval[i] = true;
			else
				_eval[i] = false;
		}
		return _eval;
	}

	/**
		This method gets a count of how many a student got right
		@return count Total number of correct answears
	*/
	public int totalCorrect() {
		int count = 0;
		boolean passed = false;
		for (int i=0; i<_eval.length; i++) {
			if (_eval[i] == true)
				count++;
		}
		return count;
	}

	/**
		This method determine if the student passed or not
		@return pass A boolean value evaluating is a student passed or not
	*/
	public boolean passed() {
		boolean pass = false;
		if (totalCorrect()>15)
			pass = true;
		// }
		return pass;
	}

	/**
		This method counted how many question a student missed
		@return Number of questions that were incorrect
	*/
	public int totalIncorrect() {
		return _correctAns.length - totalCorrect();
	}

	/**
		This method gets all the question a student got incorrect.
		In other words questions that the student missed.
		note that the question number is index+1
		@return missed An array of the question numbers
	*/
	public int[] questionsMissed() {
		int[] missed = new int[totalIncorrect()];
		int missedIndex = 0; 
		for (int i=0; i<_eval.length; i++) {
			if (_eval[i] == false) {
				missed[missedIndex] = i+1;
				missedIndex++;
			}
		}
		return missed;
	}	
}