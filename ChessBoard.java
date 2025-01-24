import java.beans.DesignMode;

public class ChessBoard {

//    Matrix[] Board board = new Board;
//    Generic Matrix Class
//    Implement Board;
//    Board has Pieces
//    Board has properties
//        Shape
//            Length
//            Width
//        Design
//            Pattern ~ Color;
//                Binary color h @ color g;
//                    @ := alternation


    //    public void makeeMethod,Later!() {
//        System.out.println(Q);
//    }
    public ChessBoard() {

    }

    Shape square = new Square(8,8);
        \in Square \is Matrix
//            Generic Matrix := Array[]!,  though , importantly and primarily and mainly
        \in Square \is Array[8][8];
//            Have Square \as quality of board, so class Board needed, for this new property from squareness, being that manuproduced square boards exist only once squares or a square does exist, so: \from Square, Board \is. That means here that board is a square
//            So really what we will get then is a Board array opon implementation, so:
//            the correct order is Board -> Board[][] board = new Board[8][8];
        \in Square \is Board[8][8] {X}
}

//t*: a Chess class is needed to combine the board and the pieces feasibly into one object...!
//... potentially, since pieces are , well not really-;- since pieces interact with change~property but board does ..;
//since pieces interact with board, but board does not interact with pieces, it is true then that pieces are congruent with being a subclass of board, so then they, pieces, are then in fact subclass of board.

//So, we have shown that pieces is a subclass of board.

//At last, we only need this: Board[][] board = new Pieces[][];
//This is because a board is an array consisting of pieces. Now know that a, 'pieces', is not
//an array consisting of board, so we can be confident that the logic at the least is precise
//So,
// create class Board, create Board[][] board new Board[8][8];
//Create class Pieces,
//In initialize, add Pieces piece = new Piece to Board[][], have Board extends Pieces

//srcs
//https://www.geeksforgeeks.org/generic-class-in-java/
/*Generics can make generic property, not only generic objects, but also variables!*/
//https://www.w3schools.com/java/ref_keyword_extends.asp
//projective structure
//{X} := Failed attempt toward solution