package hangman;

import java.io.Serializable;

public class Players implements Serializable{
	
	private String name;
	private int scores;

	public Players(String name, int scores) {
		this.name = name;
		this.scores = scores;
	}
	
	/**
	 * Return the name of the player.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Return the scores for the player.
	 * @return scores
	 */
	public int getScores() {
		return scores;
	}
}
