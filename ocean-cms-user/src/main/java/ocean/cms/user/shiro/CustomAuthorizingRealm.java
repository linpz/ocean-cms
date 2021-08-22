//package ocean.cms.user.shiro;
//
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.SimpleAuthenticationInfo;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.codec.Hex;
//import org.apache.shiro.crypto.hash.SimpleHash;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.util.ByteSource;
//
//import java.nio.charset.StandardCharsets;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
//public class CustomAuthorizingRealm extends AuthorizingRealm {
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        String name = (String) principals.getPrimaryPrincipal();
//        // TODO Find user
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addRole("r");
//        simpleAuthorizationInfo.addStringPermission("p");
//        return simpleAuthorizationInfo;
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        if (token.getPrincipal() == null) {
//            return null;
//        }
//        String name = token.getPrincipal().toString();
//        // TODO Find user
//        String password = "1a39d6a188238e86b7f5f7b6ab8f9aac";
//        //
////        return new SimpleAuthenticationInfo(name, password, getName());
//        return new SimpleAuthenticationInfo(name, password, ByteSource.Util.bytes("33"), getName());
//    }
//
//    public static void main(String[] args) throws NoSuchAlgorithmException {
//        SimpleHash md5 = new SimpleHash("md5", "123123", "33", 2);
//        System.out.println(md5.toHex());
//
//        byte[] source = "123123".getBytes(StandardCharsets.UTF_8);
//        byte[] salt = "33".getBytes(StandardCharsets.UTF_8);
//
//        byte[] temp = new byte[source.length + salt.length];
//        System.arraycopy(salt, 0, temp, 0, salt.length);
//        System.arraycopy(source, 0, temp, salt.length, source.length);
//
//        MessageDigest md = MessageDigest.getInstance("md5");
//        md.update(temp);
//        byte[] digest = md.digest();
//        digest = md.digest(digest);
//
//        System.out.println(Hex.encodeToString(digest));
//    }
//}
