import java.util.List;
import java.util.ArrayList;

public class PlayListService {

	private static List<PlayList> playlist = new ArrayList<PlayList>();
	
	static {
		playlist.add(new PlayList("Dispacto"));
		playlist.add(new PlayList("Hanmanchalisa"));
		playlist.add(new PlayList("buttabomma "));
		playlist.add(new PlayList("ohh vana padithe"));
		playlist.add(new PlayList("ohh my god daddy"));
	}
	
	public List<PlayList> retrivePlayList()
	{
		return playlist;
	}
	
	public void addPlayList(PlayList playlist2)
	{
		playlist.add(playlist2);
	}
}
