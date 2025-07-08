package jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

public class TestJasypt {
    public static void main(String[] args) {

        StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
        enc.setPassword("");
        enc.setAlgorithm("PBEWithHMACSHA512andAES_256");
        enc.setIvGenerator(new RandomIvGenerator());
        String encrypted = enc.encrypt("");
        System.out.println(encrypted);
        String decrypted = enc.decrypt(encrypted);
        System.out.println(decrypted);
    }
}
