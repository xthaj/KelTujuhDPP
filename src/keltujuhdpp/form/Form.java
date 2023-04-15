package keltujuhdpp.form;

import java.util.ArrayList;
import java.util.List;
import keltujuhdpp.entity.Perusahaan;

/**
 *
 * @author Asus
 */
public abstract class Form {
    private List<String> errorMessages = new ArrayList<String>();

    public abstract void validate();

    public void addErrorMessages(String errorMessage) {
        errorMessages.add(errorMessage);
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

}
