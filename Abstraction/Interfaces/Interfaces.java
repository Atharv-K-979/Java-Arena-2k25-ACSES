public class Interfaces {
    public static void main(String [] args){
        Queen q1 = new Queen();
        q1.moves();
        System.out.println("Max Players allowed are: "+ ChessPlayer.max_players);
    }
}
interface ChessPlayer{
    int max_players = 2;
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,Right and Diagonal in all Directions");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,Right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,Right and Diagonal by One Step");
    }
}