package org.example.view.menu;

import org.example.controller.State;
import org.example.controller.action.ActionInterface;


public class SwitchAction implements Command {
    State state;
    ActionInterface actionInterface;

    public SwitchAction(State state, ActionInterface ab) {
        this.state = state;
        this.actionInterface = ab;
    }

    @Override
    public void execute() {
        state.setActionInterface(actionInterface);
    }
}
