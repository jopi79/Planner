/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
@Named(value = "dayBean")
@SessionScoped
public class DayBean implements Serializable {
    private String important1, important2, important3, additionalNote;
    private List<String> additional = new ArrayList();

    public String getImportant1() {
        return important1;
    }

    public void setImportant1(String important1) {
        this.important1 = important1;
    }

    public String getImportant2() {
        return important2;
    }

    public void setImportant2(String important2) {
        this.important2 = important2;
    }

    public String getImportant3() {
        return important3;
    }

    public void setImportant3(String important3) {
        this.important3 = important3;
    }

    public List<String> getAdditional() {
        return additional;
    }

    public String getAdditionalNote() {
        return additionalNote;
    }

    public void setAdditionalNote(String additionalNote) {
        this.additionalNote = additionalNote;
    }

    public String addAdditional()
    {
        additional.add(additionalNote);
        return null;
    }
    
    public String moveToAdditional()
    {
        return null;
    }
    
    /**
     * Creates a new instance of DayBean
     */
    public DayBean() {
        additional.add("afsadf");
        additional.add("sgd");
    }
    
}
