package ChatBot.pt2;

public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
        if (statement.replaceAll(" ", "").length() == 0) {
            response = "Say something, I'm giving up on you.";
        }
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
        else if (statement.contains("dog") || statement.contains("cat")) {
            response = "Tell me more about your pets";
        }
        else if (statement.contains("Mr.")) {
            response = "He sounds like a good teacher.";
        }else if (statement.contains("Mrs.") || statement.contains("Ms.")) {
            response = "She sounds like a good teacher.";
        }else if (statement.contains("bacon")) {
            response = "I like bacon";
        } else if (statement.contains("response")) {
            response = "response";
        } else if (statement.contains("adventure")) {
			response = "I used to be an adventurer like you, then I took an arrow to the knee";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Why?";
		} else if (whichResponse == 5) {
			response = "Uhhh";
		}

		return response;
	}
}
