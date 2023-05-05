import processing.core.PApplet;
public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }


    GameGrid gridPlayground = new GameGrid(20,10);
    GameGrid gridNextStone = new GameGrid(4,4);
    I_Block iblock = new I_Block();
    J_Block jblock = new J_Block();




    @Override
    public void settings() {
        size(600, 720);

    }

        @Override
        public void draw() {
            gridPlayground.draw(this);

            translate(380,0);
            gridNextStone.draw(this);

            //Nimmt die Länge aller Blockobjekte und iteriert über jede Positionsinstanz
            //Eine Position besteht aus Row und Col. Diese werden aus der instanz gezogen und dann mit dem startwert addiert.
            //Dann werden die Ids auf dem Grid verteilt.
            Position[][] iBlockPositions = jblock.getTiles();
            Position startOffset = jblock.StartOffset();
            for (int i = 0; i < iBlockPositions[0].length; i++) {
                int row = iBlockPositions[0][i].getRow() + startOffset.getRow();
                int col = iBlockPositions[0][i].getColumn() + startOffset.getColumn();
                gridPlayground.setPosition(row, col, jblock.Id());

            }


        }
}