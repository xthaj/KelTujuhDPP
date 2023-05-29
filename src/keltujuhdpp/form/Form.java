/*
Kelompok 7
222111930 Atha JR
222111938 Azhari
222111971 Cindy Septia Trionita
222112085 Hamdani
222112212 Muhammad Fauzan Azima. A
*/

package keltujuhdpp.form;

import java.util.ArrayList;
import java.util.List;
import keltujuhdpp.entity.Perusahaan;

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
