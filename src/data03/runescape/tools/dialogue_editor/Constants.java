package data03.runescape.tools.dialogue_editor;

public class Constants {

	/**
	 * Variable definitions for this class
	 */
	private static String APPLICATION_NAME = "rs_npc(dia-ed)_a1";
	
	private static String DIRECTORY = "./data/";
	
	private static String FILE_NAME = "npc_dialogues.xml";
	
	/**
	 * Returns the given application name
	 * @return	APPLICATION_NAME
	 */
	public static String getApplicationName() {
		return APPLICATION_NAME;
	}
	
	/**
	 * Returns the default directory of the supposed output/input folder
	 * @return	DIRECTORY
	 */
	public static String getDefaultDirectory() {
		return DIRECTORY;
	}
	
	/**
	 * Returns the default filename of the supposed NPC dialogue file (+format)
	 * @return	FILE_NAME
	 */
	public static String getDefaultFilename() {
		return FILE_NAME;
	}
	
}
