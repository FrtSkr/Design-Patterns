public abstract class PlayerHandler {
    protected PlayerHandler nextPlayerHandler;

    public PlayerHandler() {
    }

    public void setNextPlayerHandler(PlayerHandler playerHandler) {
        this.nextPlayerHandler = playerHandler;
    }
    public abstract void play(String filePath);
}
