package generics.genericsWithInheritance;

public class Main{
    public static void main(String[] args) {
        AcademicPerformance<Students> student1 = new AcademicPerformance<Students>(new Students());
    }
}

class Class<T> {
    private T mathGrade;
}

class Students extends Class<Integer> implements StudentsGrade{


    @Override
    public int getGradeMath(int gradeMath) {
        return gradeMath;
    }

    @Override
    public int getGradeLiterature(int gradeLiterature) {
        return gradeLiterature;
    }
}

interface StudentsGrade{
    int getGradeMath(int gradeMath);
    int getGradeLiterature(int gradeLiterature);
}

class AcademicPerformance<T extends Class & StudentsGrade>{
    T student;

    public AcademicPerformance(T student) {
        this.student = student;
    }
}