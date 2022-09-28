package objects;

public class ObjectTesting {
    public static void main(String[] args) {
        Student s1 = new Student ( "Emma Garcia" , 3.9 );
        Student s2 = new Student ( "Alice Garrett" , 3.2 );
        s2 = s1;
        s2.setGpa( 4.0 );
        System.out.println( s1.getGpa( ) );
    }
    
}
