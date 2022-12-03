package State;

public abstract class PlayerState {

    protected StateContext stateContext;

    public void setContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public abstract void drinkCoffee();

    public abstract void attendGame();

    public abstract double getState();
}
