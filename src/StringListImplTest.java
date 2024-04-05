import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringListImplTest {

    private final StringList stringList = new StringListImpl();
//    public static Stream<Arguments> add() {
//        return Stream.of(Arguments.of(11, 11),
//                Arguments.of(21, 21),
//                Arguments.of(50, 50));
//    }

//@BeforeEach
//public void setUp() {
//    String[] storage = new String[]{
//            "0 - zero",
//            "1 - one",
//            "2 - two",
//            "3 - three",
//            "4 - four",
//            "5 - five",
//            "6 - six",
//            "7 - seven",
//            "8 - eight",
//            "9 - nine"};
//}

//    @ParameterizedTest
//    @MethodSource("add")
//    void addedVerify(String actual, String expected) {
//        assertEquals(expected, stringList.add(actual));
//    }

    @Test
    public void testAddedUp() {
        String expected = "one";
        assertEquals(expected, stringList.add("one"));
    }
    @Test
    public void testAddedInRange() {
        String expected = "two";
        assertEquals(expected, stringList.add(9, "two"));
    }
    @Test
    public void testAddedInLastIndexInRange() {
        String expected = "two";
        assertEquals(expected, stringList.add(10, "two"));
    }
    @Test
    public void set() {
        String expected = "three";
        assertEquals(expected, stringList.add(8, "three"));
    }

    @Test
    public void remove() {

    }

    @Test
    public void testRemove() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void lastIndexOf() {
    }

    @Test
    public void get() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void size() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void toArray() {
    }
}