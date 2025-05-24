import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatementTest() {
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "1234567890123456"));

        List<Item> list2 = List.of(new Item(null, 1, 100, 0.0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(list2, "1234567890123456"));

        List<Item> list3 = List.of(new Item("item1", 11, 350, 0.1));
        assertEquals(3465.0, SILab2.checkCart(list3, "1234567890123456"));

        List<Item> list4 = List.of(new Item("item1", 2, 100, 0.0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(list4, "1234abcd5678efgh"));

        List<Item> list5 = List.of(new Item("item1", 2, 100, 0.0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(list5, "1234"));
    }

    @Test
    void multipleConditionTest() {
        Item i1 = new Item("Item1", 3, 100, 0.0);
        assertEquals(300.0, SILab2.checkCart(List.of(i1), "1234567890123456"));

        Item i2 = new Item("Item2", 12, 100, 0.0);
        assertEquals(1200.0, SILab2.checkCart(List.of(i2), "1234567890123456"));

        Item i3 = new Item("Item3", 2, 100, 0.2);
        assertEquals(160.0, SILab2.checkCart(List.of(i3), "1234567890123456"));

        Item i4 = new Item("Item4", 15, 100, 0.2);
        assertEquals(1200.0, SILab2.checkCart(List.of(i4), "1234567890123456"));

        Item i5 = new Item("Item5", 2, 400, 0.0);
        assertEquals(800.0, SILab2.checkCart(List.of(i5), "1234567890123456"));

        Item i6 = new Item("Item6", 13, 400, 0.0);
        assertEquals(5200.0, SILab2.checkCart(List.of(i6), "1234567890123456"));

        Item i7 = new Item("Item7", 3, 400, 0.25);
        assertEquals(900.0, SILab2.checkCart(List.of(i7), "1234567890123456"));

        Item i8 = new Item("Item7", 13, 400, 0.25);
        assertEquals(3900.0, SILab2.checkCart(List.of(i8), "1234567890123456"));
    }
}
