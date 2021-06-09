package Java_Java8_Programs.Practiceprograms;

public class EncryptDecrypt {
    public static void main(String[] args) {

        //Encrypt
        char grade='B';
        grade= (char) (grade+4);
        System.out.println("grade:"+grade);

        //Decrypt
        grade= (char) (grade-4);
        System.out.println("grade:"+grade);
    }
}
