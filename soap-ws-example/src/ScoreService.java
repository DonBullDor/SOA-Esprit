import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class ScoreService {
	private static Score score = new Score();

	public Score getScore() {
		return score;
	}

	public int increaseWins() {
		return ++score.wins;
	}

	public int increaseTies() {
		return ++score.ties;
	}

	public int increaseLosses() {
		return ++score.losses;
	}

	public int getWins() {
		return score.wins;
	}

	public int getTies() {
		return score.ties;
	}

	public int getLosses() {
		return score.losses;
	}

	public Score updateScore(int wins, int losses, int ties) {
		score.wins = wins;
		score.losses = losses;
		score.ties = ties;
		return score;
	}

	@WebMethod(operationName = "restScore")
	public void reset() {
		score.wins = score.losses = score.ties = 0;
	}
}
