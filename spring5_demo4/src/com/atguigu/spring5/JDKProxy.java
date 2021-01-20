package com.atguigu.spring5;/**
 * @Author Curry
 * @Create 2021-01-21:02
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *@Description todo
 *@ClassName TestSpring
 *@Author admin
 *@Date 2021/1/3 21:02
 *@Version 1.0
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces={UserDao.class};
//        Proxy proxy = (Proxy) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });

        UserDaoImpl userDao=new UserDaoImpl();
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new userDaoProxy(userDao));
        int result = userDaoProxy.add(1, 2);
        System.out.println(result);
    }
}

class userDaoProxy implements InvocationHandler{

    //创建谁的代理类对象就把谁的对象传递进来
    private Object obj;
    public userDaoProxy(Object obi){
        this.obj=obi;
    }

    //增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行。。。"+method.getName()+"传递的参数："+ Arrays.toString(args));
        //被增强的方法
        Object result = method.invoke(obj, args);
        //方法之后执行
        System.out.println("方法之后执行。。。"+obj);
        return result;
    }
}