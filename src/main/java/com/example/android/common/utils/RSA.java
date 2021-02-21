package com.example.android.common.utils;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
public class RSA {
    private static final String _RSA = "RSA";
    private static final String RSA_ALGORITHM = "RSA/ECB/PKCS1Padding";

    /**
     * 加密方法，传入明文，公钥，返回密文的base64
     *
     * @param data 明文
     * @return 密文的base64
     */
    public static String encrypt(String data) {
        return encrypt(data, RSA_PUBLIC_KEY);
    }

    /**
     * 加密方法，传入明文，公钥，返回密文的base64
     *
     * @param data      明文
     * @param publicKey 公钥
     * @return 密文的base64
     */
    public static String encrypt(String data, String publicKey) {
        byte[] decode = DataUtils.base64Decode(publicKey);
        byte[] result = new byte[0];
        try {
            final RSAPublicKey rsaPublicKey = (RSAPublicKey) KeyFactory.getInstance(_RSA)
                    .generatePublic(new X509EncodedKeySpec(decode));
            final Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, rsaPublicKey);
            result = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataUtils.base64Encode(result);
    }

    /**
     * 传入密文及私钥，返回明文
     *
     * @param data       密文
     * @param privateKey 私钥
     * @return 明文
     */
    public static String decrypt(String data, String privateKey) {
        final byte[] decode = DataUtils.base64Decode(privateKey);
        final byte[] content = DataUtils.base64Decode(data);

        byte[] result = new byte[0];
        try {
            final RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) KeyFactory.getInstance(_RSA)
                    .generatePrivate(new PKCS8EncodedKeySpec(decode));
            final Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, rsaPrivateKey);

            result = cipher.doFinal(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataUtils.base64Encode(result);
    }

    public static final String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDuYvKpKCbbjscH\n" +
            "MAppS7vf9kxQ2egLHWt5NstmLCSwlYepM9/oHG4ZZPvR4Fs+Wc5+edsxw4NCmtZ1\n" +
            "YaVOanM3eI57vg85EZS5BLjkVf+oEfqHUXcW6GwwDW/wwzKHmPsVSFfEdIOT8qXJ\n" +
            "ePVt5iZ+3V7qF4VfdMIsoJzBeOXlUf7K/r6XZbNqbx3mgsWskWkUx5PiXiEuAgF3\n" +
            "MLoYx3B87XDBMgr/35NDZQgLk/Gi72a/IvOCBGsd5h69Ws1ctAjqD1HBKWb1ChBz\n" +
            "mauF2iMJM5p8/YnGFTA+6X9in19YUc6BHQoQIE+2rcpSdht1CH1YZ4bxtWAOVkq5\n" +
            "e5xUrRGdAgMBAAECggEAFAU7W/mDSe0zyea++RjjLmwA/MlQM57E5+kyK+KJMktc\n" +
            "mVlB9LxugrN4cqflAdeJABY70nIZE/7tA+6vc2Z9RqtZTAsqPCC93MwIuyR91B+u\n" +
            "aq7s0X+zllWKkS3TkI/IhoEM3fLrGgHG6qS99/zcPstYrVBMYzfrFtRmVdlRdXDD\n" +
            "8IOhnbL6/SnIPpeHPEzQhRvvA5r4HuN/Hlb6Q/km4fYKbzzau3WbU5TTp+B+SY3F\n" +
            "hsMIsyQx+z7G2RYKMJ3U0k6Y4mkI456M8Vm+kqbPCdo4dK91wKVJz5If82DrikWv\n" +
            "CrXpkReeyaPijz9IzDmsnF6dvhQPBriNDlWEgvKAAQKBgQD/oHIa1WwBF6DDXmBK\n" +
            "Zhr62sS+X3A1J5hyVafHU1LY/Mh9wPPSsZM1nbdjhC2bXPV4Z6V/Wip60gt0NfBN\n" +
            "lU3nx5uVEY5R2s31bi6Vdp5ByOBi0aCiJnJKJZtZkkEzKkRdPFAEBq76xoFdQQxj\n" +
            "2I/hbx4FlMdTjWuuL7eLR8cP3QKBgQDuvA7F7asnJ2vem359VGntZJg5QPoHGfcM\n" +
            "EZ+eKz/+bPBHl7fNgCSbu0CnqLH1D9WCOVMPZ0Bl51qRmujbv5WBIM4B2TDh6MXA\n" +
            "+rBMjX7HLIurEbFBqkkcMsvv+gB0lu0CXd9t5aqjw2XntolX0fADEnB6Eyvzca4o\n" +
            "H/jFfm7MwQKBgDzeAm17RhVYf/IlJb5xY5k5wEEoTnqJrBYFaUbgA0khn8e5yxTv\n" +
            "LYNFw6YRkh59WwHJhDG30YefPhT0xvxiQcOf1t7+6Cl7dTEshDEYpoQ5hZxiF+Kk\n" +
            "TvBy1fPVDGtXdCHTO6ZJxR53Z9RBqeaYaWIfaEGh9HhjozE9sXGbrL2NAoGAejBI\n" +
            "g2eErTKRFEuTrwPwf294Nf2aut3AQy4V+zd5tnf9dzcg/Q40Lnzlt6oxAxPKnK9I\n" +
            "Yt7e6AlEoredrTNeisvGhM2sJkQkSwREDbpyA/E5vyH8Dnbgmo0pMjdL2mCRCCAR\n" +
            "xkbBUrYkxzb3DrrF1FywstpzKVOq5qCOjE6M2UECgYEAkO9Th4H/Bclggp5PIDsm\n" +
            "B9QG6himNWZQZChO0MydZLfw7ajrNlRf6lx4af3XBsfkZWh0n/0vBR5Mo3CMEIpn\n" +
            "5/3aBDZUv/5KmbcjG+PuqtVwtt94Yna9xos8eD4NA0QXhsZX79WI0dUD5v2x/9m9\n" +
            "lgg9gac6l8LRPlXJy5a/7l8=";

    public static final String RSA_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7mLyqSgm247HBzAKaUu7\n" +
            "3/ZMUNnoCx1reTbLZiwksJWHqTPf6BxuGWT70eBbPlnOfnnbMcODQprWdWGlTmpz\n" +
            "N3iOe74PORGUuQS45FX/qBH6h1F3FuhsMA1v8MMyh5j7FUhXxHSDk/KlyXj1beYm\n" +
            "ft1e6heFX3TCLKCcwXjl5VH+yv6+l2Wzam8d5oLFrJFpFMeT4l4hLgIBdzC6GMdw\n" +
            "fO1wwTIK/9+TQ2UIC5Pxou9mvyLzggRrHeYevVrNXLQI6g9RwSlm9QoQc5mrhdoj\n" +
            "CTOafP2JxhUwPul/Yp9fWFHOgR0KECBPtq3KUnYbdQh9WGeG8bVgDlZKuXucVK0R\n" +
            "nQIDAQAB";
}
