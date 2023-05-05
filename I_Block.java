
    //Hier werden die jeweiligen neuen Positioninstanzen initialisiert.
    //Jede Zeile zeigt einen vollständigen Block in der jeweiligen Rotation

    public class I_Block extends Block{

        private final Position[][] tiles = createTiles();

        private Position[][] createTiles() {
            Position[][] tiles = new Position[4][4]; //1.Dimension = Rotationstate, 2.Dim, die Position der Tiles im Objekt
            tiles[0] = new Position[] { new Position(1, 0), new Position(1, 1), new Position(1, 2), new Position(1, 3) };
            tiles[1] = new Position[] { new Position(0, 2), new Position(1, 2), new Position(2, 2), new Position(3, 2) };
            tiles[2] = new Position[] { new Position(2, 0), new Position(2, 1), new Position(2, 2), new Position(2, 3) };
            tiles[3] = new Position[] { new Position(0, 1), new Position(1, 1), new Position(2, 1), new Position(3, 1) };
            return tiles;
        }


        //Id der Blöcke, um sie auf dem Feld zu Repräsentieren
        public int Id() {
            return 5;
        }

        //Center in der Mitte
        protected Position StartOffset() { //Startposition des Blocks auf dem Grid
            return new Position(4, 3);
        }

        //Getmethode für das Positionarray
        public Position[][] getTiles() { // Gibt jeweils die Positionen der Blöcke im Array zurück
           return tiles;
        }

    }



