package uon.inft2051.lab04;

import com.codename1.ui.TextSelection;

public class Turn {
    public boolean attackUsed;
    Character Char;
    MoveCircle circle;
    boolean turn = true;

    private boolean isTurn;
    public Turn (Character Char, MoveCircle circle)
    {
        this.Char = Char;
        this.circle = circle;
    }
    public boolean isTurn()
    {
        return turn;
    }
    public void startTurn()
    {
        turn = true;
        attackUsed = false;
        circle.setCenter(Char);
    }

    public void endTurn()
    {
        turn = false;
    }
}
