public class Student {
    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    public void calcAvarage(){
        this.avarage= ((this.mat.note * 0.80 + this.mat.sozlu * 0.20)+(this.fizik.note * 0.80 + this.fizik.sozlu * 0.20)+(this.kimya.note * 0.80 + this.kimya.sozlu * 0.20)) /3;
    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }
    public void isPass(){
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if(this.isPass){
                System.out.println("Sınıfı Geçti!");
            }else{
                System.out.println("Sınıfta Kaldı!");
            }
    }

    public Student(String name, String stuNo, String  classes, Course mat , Course fizik, Course kimya){
        this.name= name;
        this.stuNo= stuNo;
        this.classes= classes;
        this.mat= mat;
        this.fizik= fizik;
        this.kimya= kimya;
        this.isPass= false;
        calcAvarage();
    }
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.mat.note= mat;
        } if(fizik >= 0 && fizik <= 100){
            this.fizik.note= fizik;
        } if(kimya >= 0 && kimya <= 100){
            this.kimya.note= kimya;
        }
    }
    public void addSozlu(int mat,int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.mat.sozlu= mat;
        } if(fizik >= 0 && fizik <= 100){
            this.fizik.sozlu= fizik;
        } if(kimya >= 0 && kimya <= 100){
            this.kimya.sozlu= kimya;
        }
    }

    public void printNote(){
        System.out.println("=============");
        System.out.println("öğrenci : " + this.name);
        System.out.println("Matematik ortalaması : " + (this.mat.note * 0.80 + this.mat.sozlu * 0.20));
        System.out.println("Fizik ortalaması : " + (this.fizik.note * 0.80 + this.fizik.sozlu * 0.20));
        System.out.println("Kimya ortalaması : " + (this.kimya.note * 0.80 + this.kimya.sozlu * 0.20));

    }
}
