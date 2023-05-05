public class O_Block extends Block{

    private final Position[][] tiles = createTiles();


    private Position[][] createTiles() {
        Position[][] tiles = new Position[4][4]; //1.Dimension = Rotationstate, 2.Dim, die Position der Tiles im Objekt
        tiles[0] = new Position[] { new Position(0, 0), new Position(0, 1), new Position(1, 0), new Position(1, 1) };
        return tiles;
    }


    //Id der Blöcke, um sie auf dem Feld zu Repräsentieren
    public int Id() {
        return 7;
    }

    //Center in der Mitte
    protected Position StartOffset() { //Startposition des Blocks auf dem Grid
        return new Position(1, 4);
    }

    //Getmethode für das Positionarray
    public Position[][] getTiles() { // Gibt jeweils die Positionen der Blöcke im Array zurück
        return tiles;
    }

}
