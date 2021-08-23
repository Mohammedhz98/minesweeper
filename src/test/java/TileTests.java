import com.company.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TileTests {

    @Test
    void getTileNumber() {
        Tile empty = new Tile();
        Assertions.assertEquals(1,empty.getTileCode(),"test 1");
    }
}
