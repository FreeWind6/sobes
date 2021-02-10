package firstLesson;

/**
 * @author Dmitry Kubyshkin
 * @dateOfCreation 31.01.2021
 */

public class Figure {
    private String name;
    private int angleSize;
    private boolean isRound;

    public Figure(String name, int angleSize, boolean isRound) {
        this.name = name;
        this.angleSize = angleSize;
        this.isRound = isRound;
    }

    public void init() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "First.Figure{" +
                "name='" + name + '\'' +
                ", angleSize=" + angleSize +
                ", isRound=" + isRound +
                '}';
    }
}
