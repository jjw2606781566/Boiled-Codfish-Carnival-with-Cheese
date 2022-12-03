package State;

public class StateContext {
    private PlayerState animalState;

    public void setAnimalState(PlayerState animalState) {
        this.animalState = animalState;

        this.animalState.setContext(this);
    }

    public double getState() {
        return this.animalState.getState();
    }

}
