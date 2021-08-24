import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TileTests {

    private static Tile empty,bomb,flag,hidden,questionmark;
    private static NumberTile number;

    @BeforeAll
    public static void setUp() {
        empty = new Tile();
        bomb = new BombTile();
        flag = new FlagTile();
        number = new NumberTile(4);
        questionmark = new QuestionMarkTile();
        hidden = new HiddenTile();
    }

    @Test
    void getTileNumber() {
        int expectedTileCode = 1;
        int actualTileCode = empty.getTileCode();
        Assertions.assertEquals(expectedTileCode,actualTileCode,"The tile numbers are not the same.");
    }

    @Test
    void getBombTileNumber() {
        int expectedTileCode = 2;
        int actualTileCode = bomb.getTileCode();
        Assertions.assertEquals(expectedTileCode,actualTileCode,"The tile numbers are not the same.");
    }

    @Test
    public void getFlagTileNumber() {
        int expectedTileCode = 3;
        int actualTileCode = flag.getTileCode();
        Assertions.assertEquals(expectedTileCode,actualTileCode,"The tile numbers are not the same.");
    }

    @Test
    void getNumberTileNumber() {
        int expectedTileCode = 6;
        int actualTileCode = number.getTileCode();
        Assertions.assertEquals(expectedTileCode,actualTileCode,"The tile numbers are not the same.");
    }

    @Test
    void getQuestionmarkTileNumber() {
        int expectedTileCode = 4;
        int actualTileCode = questionmark.getTileCode();
        Assertions.assertEquals(expectedTileCode,actualTileCode,"The tile numbers are not the same.");
    }

    @Test
    void getHiddenTileNumber() {
        int expectedTileCode = 5;
        int actualTileCode = hidden.getTileCode();
        Assertions.assertEquals(expectedTileCode,actualTileCode,"The tile numbers are not the same.");
    }

    @Test
    void tileToString() {
        String expectedToString = "[ ]";
        String actualToString = empty.toString();
        Assertions.assertEquals(expectedToString,actualToString,"The string outputs are not the same.");
    }

    @Test
    void bombTileToString() {
        String expectedToString = "[\uD83D\uDCA3]";
        String actualToString = bomb.toString();
        Assertions.assertEquals(expectedToString,actualToString,"The string outputs are not the same.");
    }

    @Test
    void flagTileToString() {
        String expectedToString = "[\uD83D\uDEA9]";
        String actualToString = flag.toString();
        Assertions.assertEquals(expectedToString,actualToString,"The string outputs are not the same.");
    }

    @Test
    void numberTileToString() {
        String expectedToString = "[" + 4 + "]";
        String actualToString = number.toString();
        Assertions.assertEquals(expectedToString,actualToString,"The string outputs are not the same.");
    }

    @Test
    void quesionmarkTileToString() {
        String expectedToString = "[?]";
        String actualToString = questionmark.toString();
        Assertions.assertEquals(expectedToString,actualToString,"The string outputs are not the same.");
    }

    @Test
    void hiddenTileToString() {
        String expectedToString = "[\u25A0]";
        String actualToString = hidden.toString();
        Assertions.assertEquals(expectedToString,actualToString,"The string outputs are not the same.");
    }

    @Test
    void setNumberTileNumber() {
        int expectedMineSetNumber = 10;
        number.setMineNumber(10);
        int actualMineNumber = number.getMineNumber();
        Assertions.assertEquals(expectedMineSetNumber,actualMineNumber, "The setter did not work or set the right number.");
    }
}
