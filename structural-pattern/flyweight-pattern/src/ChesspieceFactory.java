public class ChesspieceFactory {

    private static final Chesspiece WEIGHT = new ChesspieceFlyweight("白");
    private static final Chesspiece BLACK = new ChesspieceFlyweight("黑");

    public static Chesspiece getChesepiece(String color) {
        switch (color) {
            case "白": return WEIGHT;
            case "黑": return BLACK;
            default: return null;
        }
    }
}
