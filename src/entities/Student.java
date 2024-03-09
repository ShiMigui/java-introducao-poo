package entities;

public class Student {
    public String name;
    private float grade1;
    private float grade2;
    private float grade3;
    public boolean sit;
    public float ttlGrade;
    public String sitName;

    //#region Constructors
    public Student(String name, float grade1, float grade2, float grade3) {
        this.name = name;

        if(setGrade1(grade1) && setGrade2(grade2) && setGrade3(grade3)) processData();
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
    //#endregion

    public String toString(){
        return name;
    }

    public void processData() {
        this.ttlGrade = grade1 + grade2 + grade3;
        this.sit = ttlGrade >= 60f;
        this.sitName = this.sit ? "PASS" : "FAILED";
    }

    public float missingPoints(float minGrade){
        return minGrade - ttlGrade;
    }

    public boolean setValidatedgrade(String gradeName, float grade, float gradeMax) {
        if (grade < 0 || grade > gradeMax) {
            System.err.printf("%s should be greater than 0 and less than %.2f\n", gradeName, gradeMax);
            return false;
        }

        switch (gradeName) {
            case "grade1":
                this.grade1 = grade;
                break;
            case "grade2":
                this.grade2 = grade;
                break;
            case "grade3":
                this.grade3 = grade;
                break;
        }

        return true;
    }

    // #region Getters e Setters
    public float grade1() {
        return this.grade1;
    }

    public float grade2() {
        return this.grade2;
    }

    public float grade3() {
        return this.grade3;
    }

    public boolean setGrade1(float grade) {
        return setValidatedgrade("grade1", grade, 30f);
    }

    public boolean setGrade2(float grade) {
        return setValidatedgrade("grade2", grade, 30f);
    }

    public boolean setGrade3(float grade) {
        return setValidatedgrade("grade3", grade, 30f);
    }
    // #endregion
}
