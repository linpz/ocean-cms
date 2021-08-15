package ocean.cms.common;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

public class CustomRealm implements Realm {
    @Override
    public String getName() {
        return "custom";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        if ("a".equals(username)) {
            return new SimpleAuthenticationInfo("xx", password, getName());
        }
        if(!"zhang".equals(username)) {
            throw new UnknownAccountException();
        }
        if(!"123".equals(password)) {
            throw new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
