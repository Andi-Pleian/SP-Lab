/**
 * 
 */

/**
 * @author Andi
 *
 */
public class AlignCenter implements AlignStrategy {
	@Override
	public String render(String text_arg) {
		return "####" + text_arg + "####";
	}
}
