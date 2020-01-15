/**
 *
 * @author Jean-Marie Normand (jean-marie.normand@ec-nantes.fr)
 */
public class TestMemoire {
   
    public static void m(int var) {
        var += 2;
        Point2D p1 = new Point2D(5,5);
    }
    
    public static void main(String[] args) {
        int i = 0;
        Point2D p1 = new Point2D(1,1);
        Point2D p2;
        i += 4;
        p2 = p1;
        System.out.println("i vaut: "+i);
        m(i);
        System.out.println("i vaut: "+i);
}