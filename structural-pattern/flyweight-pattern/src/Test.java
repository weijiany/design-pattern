public class Test {

    public static void main(String[] args) {
        Chesspiece p1 = ChesspieceFactory.getChesepiece("黑");
        p1.put(1, 1);
        Chesspiece p2 = ChesspieceFactory.getChesepiece("白");
        p2.put(2, 2);
        Chesspiece p3 = ChesspieceFactory.getChesepiece("黑");
        p3.put(3, 3);
        Chesspiece p4 = ChesspieceFactory.getChesepiece("白");
        p4.put(4, 4);
    }
}
