public class DriverExam
{
	//Fields
	private char[] _correctAns = {'B','D','A','A','C',
		'A','B','A','C','D','B','C','D','A','D','C',
		'C','B','D','A'};
	private char[] _studentAns = new char[_correctAns.length];
	private boolean[] _eval = new boolean[_correctAns.length];

	// Constructor
	public DriverExam(char[] studentAns)
	{
		_correctAns = _correctAns;
		_studentAns = studentAns;

		boolean[] eval = new boolean[_correctAns.length];
		for (int i=0; i<_correctAns.length; i++) {
			if (_studentAns[i] == _correctAns[i])
				eval[i] = true;
			else
				eval[i] = false;
		}
		_eval = eval;
	}

	// correct
	public int totalCorrect() {
		int count = 0;
		boolean passed = false;
		for (int i=0; i<_eval.length; i++) {
			if (_eval[i] == true)
				count++;
		}
		return count;
	}

	// passed or not
	public boolean passed() {
		int count = totalCorrect();
		boolean pass = false;
		// int count = 0;
		// boolean passed = false;
		// for (i=0; i<_eval.length; i++) {
		// 	if _(eval[i] == true)
		// 		count++;
		if (count>15)
			pass = true;
		// }
		return pass;
	}

	// total incorrect
	public int totalIncorrect() {
		return _correctAns.length - totalCorrect();
	}

	// Questions missed
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