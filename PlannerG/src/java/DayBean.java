/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Student
 */
@Named(value = "dayBean")
@SessionScoped
public class DayBean implements Serializable {
    private String important1, important2, important3;
    private String additional1, additional2, additional3;

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

    public String getAdditional1() {
        return additional1;
    }

    public void setAdditional1(String additional1) {
        this.additional1 = additional1;
    }

    public String getAdditional2() {
        return additional2;
    }

    public void setAdditional2(String additional2) {
        this.additional2 = additional2;
    }

    public String getAdditional3() {
        return additional3;
    }

    public void setAdditional3(String additional3) {
        this.additional3 = additional3;
    }
    

    /**
     * Creates a new instance of DayBean
     */
    public DayBean() {
    }
    
}
