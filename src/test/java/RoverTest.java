import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class RoverTest {

    @ParameterizedTest
    @CsvSource(value = {
            "f;{x=0, y=1}",
            "ff;{x=0, y=2}",
            "fff;{x=0, y=3}"
    }, delimiter = ';')
    void moveForward(String commands, String expectedCoordinates) {
        Rover rover = new Rover();

        Coordinates coordinates = rover.execute(commands);

        Assertions.assertEquals(expectedCoordinates, coordinates.toString());
    }
}
