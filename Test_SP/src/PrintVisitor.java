/**
 * 
 */

/**
 * @author Andi
 *
 */
public class PrintVisitor implements Visitor{

	@Override
	public void visitAn(An an_arg) {
		System.out.println("AN: " + an_arg.getName());
	}

	@Override
	public void visitGrupa(Grupa grupa_arg) {
		System.out.println("		Grupa: " + grupa_arg.getName());
		
	}

	@Override
	public void visitSemigrupa(Semigrupa semigrupa_arg) {
		System.out.println("				Semigrupa: " + semigrupa_arg.getName());
		
	}

	@Override
	public void visitStudent(Student student_arg) {
		System.out.println(	"						Student: " + student_arg.getName() + " " + student_arg.getMail());
	}

}
