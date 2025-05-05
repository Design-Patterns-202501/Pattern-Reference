package com.patrones;


import com.patrones.encryption.AESEncrypter;
import com.patrones.encryption.DESEncrypter;
import com.patrones.encryption.SHAEncrypter;
import com.patrones.implementation.BridgeMessageEncryption;
import com.patrones.implementation.IMessage;

public class App {
    public static void main(String[] args) {
        IMessage AESMethod = new BridgeMessageEncryption(
                    new AESEncrypter()
                );
        IMessage DESMethod = new BridgeMessageEncryption(
                    new DESEncrypter()
                );

        IMessage SHAMethod = new BridgeMessageEncryption(
                    new SHAEncrypter()
                );

        try {
            final String message = "Holis";
            final String password = "HG58YZ3CR9123456";
            String messageAES = AESMethod.encryptMessage(message, password);
            System.out.println("AES -> " + messageAES);

            
            String messageDES = DESMethod.encryptMessage(message,password); 
            System.out.println("DES -> " + messageDES);


            String messageSHA = SHAMethod.encryptMessage(message, password);
            System.out.println("SHA -> " + messageSHA);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
