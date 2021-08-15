package ocean.cms.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class U1 {

    @Test
    public void t1() {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhangsan","123");
        try {
            subject.login(token);
        } catch (AuthenticationException e) {

        }
        Assert.assertEquals(true, subject.hasRole("r1"));
        Assert.assertEquals(true, subject.isPermitted("p1"));
        Assert.assertEquals(true, subject.isPermitted("p3"));
        Assert.assertEquals(true, subject.isAuthenticated());
        subject.logout();
    }

    @Test
    public void t2() {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:u1t2.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");
        try {
            subject.login(token);
        } catch (AuthenticationException e) {

        }
        Assert.assertEquals(true, subject.isAuthenticated());
        subject.logout();
    }

    @Test
    public void t3() {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:u1t3.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("a","b");
        try {
            subject.login(token);
        } catch (AuthenticationException e) {

        }
        Assert.assertEquals(true, subject.isAuthenticated());
        subject.logout();
    }

    @Test
    public void t4() {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-authenticator-all-success.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("a","b");
        try {
            subject.login(token);
        } catch (AuthenticationException e) {

        }
        subject = SecurityUtils.getSubject();
        System.out.println("size:" + subject.getPrincipals().asList().size());
//        Assert.assertEquals(true, subject.isAuthenticated());
        subject.logout();
    }
}
