/**
 * 
 */

/**
 * @author Andi
 *
 */
public class AlignLeft implements AlignStrategy {
	@Override
	public String render(String text_arg) {
		return text_arg + "####";
	}
}
