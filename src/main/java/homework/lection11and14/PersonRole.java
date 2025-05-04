package homework.lection11and14;

public enum PersonRole {
    STUDENT("Student"),
    TEACHER("Teacher"),
    DOCTOR("Doctor"),
    ENGINEER("Engineer"),
    ARTIST("Artist"),
    PROFESSOR("Professor"),
    ARCHITECT("Architect"),
    DESIGNER("Designer"),
    OTHER("Other");

    private final String roleName;

    private PersonRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
