import java.util.Comparator;

public class JavaSort {
    protected class Student
    {
        private long id;
        private float CGPA;
        private String name;

        public long getId()
        {
            return this.id;
        }

        public float getCGPA()
        {
            return this.CGPA;
        }

        public String getName()
        {
            return this.name;
        }
    }
    class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student x, Student y) {

            if (x.getCGPA() > y.getCGPA()) {
                return -1;
            } else if (x.getCGPA() < y.getCGPA()) {
                return 1;
            }

            int nameCompare = x.getName().compareTo(y.getName());
            if (nameCompare != 0) {
                return nameCompare;
            }

            if (x.getId() < y.getId()) {
                return -1;
            } else if (x.getId() > y.getId()) {
                return 1;
            }

            return 0;
        }
    }
}
