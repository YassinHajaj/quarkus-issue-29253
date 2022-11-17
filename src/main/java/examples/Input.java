package examples;

import javax.validation.constraints.NotNull;

public class Input {

    @NotNull
    String value;

    public Input() {

    }

    public Input(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
