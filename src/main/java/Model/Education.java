package Model;

public class Education {
    private String institution;
    private String degree;
    private String major;
    private int graduationYear;
    public Education() {
    }

    public Education(String institution, String degree, String major, int graduationYear) {
        this.institution = institution;
        this.degree = degree;
        this.major = major;
        this.graduationYear = graduationYear;
    }

    public String getInstitution() {
        return institution;
    }

    public String getDegree() {
        return degree;
    }

    public String getMajor() {
        return major;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
