/**
 * 
 */

/**
 * @author Andi
 *
 */
public class AlignRight implements AlignStrategy {
	@Override
	public String render(String text_arg) {
		return "####" + text_arg;
	}
}
