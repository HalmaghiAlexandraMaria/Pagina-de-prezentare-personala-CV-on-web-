package Model;

public class Languages {
    private String languageName;
    private String proficiencyLevel;

    public Languages() {
    }

    public Languages(String languageName, String proficiencyLevel) {
        this.languageName = languageName;
        this.proficiencyLevel = proficiencyLevel;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

}
