WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
/**
 * IMPORTANT: This class is incomplete. Please look for "TODO" comments.
 *
 * Question:
 * Write a parse to recognize the language specified by the following grammar:
 * S := () ; S := (S) ; S := SS ;
 */
public class Parser {
	Tokeniser _tokeniser;
    
    public Parser(Tokeniser tokeniser) {
    	_tokeniser = tokeniser;
    }

    /**
	 * @return True if the given tokens conform with the grammar. False, otherwise.
	 */
	public boolean parseExp() {
		if (!_tokeniser.isNextValid()) return false;
		if (!_tokeniser.hasNext()) {
			return true;
		}

		// TODO: Complete this method
		// START YOUR CODE



		// END YOUR CODE

		return false;
    }

}
