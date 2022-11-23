/**
 * 
 */

/**
 * @author Andi
 *
 */
public class Main {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        Element info3 = new An("Informatica 3");
        Grupa g1 = new Grupa("Gr1");
        Semigrupa s1 = new Semigrupa("s1");
        Student stud1 = new Student("Popescu", "mail1");
        Student stud2 = new Student("Mihai", "mail2");
        s1.add(stud1);
        s1.add(stud2);
        Semigrupa s2 = new Semigrupa("s2");
        Student stud3 = new Student("Popescu2", "mail3");
        Student stud4 = new Student("Mihai2", "mail4");
        s1.add(stud3);
        s1.add(stud4);
        g1.add(s1);
        g1.add(s2);
        Grupa g2 = new Grupa("Gr2");
        
        info3.add(g1);
        info3.add(g2);
        
        PrintVisitor printVisitor = new PrintVisitor();
        info3.accept(printVisitor);
    }
}

