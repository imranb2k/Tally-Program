public class Player {

    private Character id;

    public Player(Character id) {
        this.id = id;
    }

    public Character getId() {
        return id;
    }

    public void setId(Character id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id.toString();
    }
}
