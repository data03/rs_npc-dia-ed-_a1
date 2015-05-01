package data03.runescape.tools.dialogue_editor.utilities;

public class Debug {
	
	/**
	 * This method is used to send a error/information message in the application CMD/console
	 * @param message	Message to be sent
	 * @param urgent	Is the message urgent? Highlight?
	 */
	public static void sendMessage(String message, boolean urgent) {
		if(urgent) {
			System.err.println("[Debug]" + message);
			return;
		}
		System.out.println("[Debug]" + message);
	}
	
}
