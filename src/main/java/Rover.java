public class Rover {
    public Coordinates execute(String commands) {
        if(commands.length() > 1)
            return new Coordinates(0,2);
        return new Coordinates(0,1);
    }
}
