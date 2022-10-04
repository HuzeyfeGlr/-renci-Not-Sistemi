public class Main {
    public static void main(String[] args) {
        Course mat = new Course("matematik", "MAT101" , "MAT");
        Course fizik = new Course("fizik", "FZK101", "FZK");
        Course kimya= new Course("Kimya" , "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "123123" , "MAT");
        Teacher t2 = new Teacher("Fatma Hoca", "541541" , "FZK");
        Teacher t3 = new Teacher("Mehmet Hoca", "1354368" , "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "4", "123",mat, fizik,kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addSozlu(100,80,90);
        s1.isPass();


        Student s2 = new Student("Güdük Necmi", "4", "213",mat, fizik,kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addSozlu(60,75,30);
        s2.isPass();


        Student s3 = new Student("Hayta İsmail", "4", "321",mat, fizik,kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addSozlu(90,60,80);
        s3.isPass();


    }
}
