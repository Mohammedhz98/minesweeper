import com.company.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TileTests {

    @Test
    public void getTileNumber() {
        Tile empty = new Tile();
        Assertions.assertEquals(empty.getTileCode(),1,"test 1");
    }
}
