package javaoop._10AnonClass;

public class Button {
    private Clickable action;

    void setClickAction(Clickable action) {
        this.action = action;
    }

    void doClick() {
        action.onClick();
    }
}
